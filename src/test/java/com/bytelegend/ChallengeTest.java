package com.bytelegend;

import com.github.hcsp.test.helper.JavaASTReader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

public class ChallengeTest {
    @Test
    public void multiplyBy31Test() {
        IntStream.range(-100, 100)
                .forEach(i -> Assertions.assertEquals(31 * i, Challenge.multiplyBy31(i)));
    }

    @Test
    public void divideBy2ThenMinus1Test() {
        IntStream.range(-100, 100)
                .forEach(i -> Assertions.assertEquals(i / 2 - 1, Challenge.divideBy2ThenMinus1(i)));
    }

    @Test
    public void noAdditionMultiplicationDivisionSigns() {
        Assertions.assertTrue(
                JavaASTReader.findAll(
                                Challenge.class, com.github.javaparser.ast.expr.BinaryExpr.class)
                        .stream()
                        .noneMatch(
                                expr ->
                                        expr.getOperator()
                                                        == com.github.javaparser.ast.expr.BinaryExpr
                                                                .Operator.PLUS
                                                || expr.getOperator()
                                                        == com.github.javaparser.ast.expr.BinaryExpr
                                                                .Operator.MULTIPLY
                                                || expr.getOperator()
                                                        == com.github.javaparser.ast.expr.BinaryExpr
                                                                .Operator.DIVIDE));
    }
}
