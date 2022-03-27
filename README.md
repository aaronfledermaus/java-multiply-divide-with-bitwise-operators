## [ByteLegend](https://bytelegend.com) Challenge of JavaIsland: Calculation and Operators

<details open='true'>
<summary>English</summary>

### Multiplication and Division with Bitwise Operators

Please finish `multiplyBy31()` and `divideBy2ThenMinus1()` methods in [src/main/java/com/bytelegend/Challenge.java](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/src/main/java/com/bytelegend/Challenge.java)`.

`multiplyBy31Description(int n)` returns the result of a given integer multiplying by 31, e.g. `n=1`, return `31`; `n=2`, return `62`. No need to consider overflow issue.
Note that you are not allowed to use multiplication sign (`*`), division sign (`/`), and addition sign (`+`).


`divideBy2ThenMinus1(int n)` returns the result of a given integer dividing by 2, then minus 1.

For example, `n=1`, return `-1`, because `1/2=0`, `0-1=-1`.

`n=4`, return 1, because `4/2=2`, `2-1=1`.

Note that you are not allowed to use multiplication sign (`*`), division sign (`/`), and addition sign (`+`).


- You can accomplish this challenge via any way below:
  - Recommended for beginners: run `git clone https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators` to download the code,
    finish the challenge in your local IDE, then copy/paste/submit the answer in web editor.
    - If you don't know how, you can click [import project into IDEA](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import.md)/[import project into VSCode](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import-vscode.md).
    - Before submitting your code, you'd better run `mvn verify` locally to save time. Don't know how? See [verify locally in IDEA](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-idea.md)/[verify locally in VSCode](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-vscode.md).
  - Very unrecommended: you can [click here to download zipped code](https://codeload.github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/zip/refs/heads/main) if you don't like `git` operations.
  - Or: if you are confident enough to write code in web editor directly, go ahead.
  - Or: if you are familiar with GitHub, you can fork [the repo](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators), finish the challenge and create a pull request.
- The bot will check your PR and tell you if you accomplish the challenge.
- Go back to [ByteLegend](https://bytelegend.com) and continue your hero journey.

Good luck!

If you need any help, feel free to join the [Discord Community](https://discord.gg/35RreUUGWt) or contact us via [contact@bytelegend.com](mailto:contact@bytelegend.com).

**Note: we only allow you to modify the following files.
Any changes to files other than the following files will be rejected:**

- `src/main/java/com/bytelegend/Challenge.java`

</details>

<details>
<summary>简体中文</summary>

### 使用位运算完成乘法和除法

请完成[src/main/java/com/bytelegend/Challenge.java](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/src/main/java/com/bytelegend/Challenge.java)的`multiplyBy31()`方法和`divideBy2ThenMinus1()`方法。

`multiplyBy31Description(int n)`返回给定的整数乘以31之后的结果。例如`n=1`，返回`31`，`n=2`，返回`62`。无需考虑溢出问题。
注意，你不能使用乘法符号(`*`)、除法符号(`/`)和加法符号(`+`)。


`divideBy2ThenMinus1(int n)`返回给定的整数除以2然后减1之后的结果。

例如`n=1`，返回`-1`，因为`1/2=0`, `0-1=-1`。

`n=4`，返回`1`，因为`4/2=2`，`2-1=1`。

注意，你不能使用乘法符号(`*`)、除法符号(`/`)和加法符号(`+`)。


- 你可以使用以下任意一种方法完成挑战：
  - 初学者推荐：运行`git clone https://git.bytelegend.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators`将代码下载到本地，在本地使用IDE调试完成后复制到网页编辑器里提交。
    - 如果你不知道怎么做，可以点击[导入IDEA](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/zh_hans/clone-and-import.md)/[导入VSCode](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/zh_hans/clone-and-import-vscode.md)。
    - 在提交之前，你最好先在本地运行`mvn verify`验证一下答案，以节约时间。不知道如何做？请查看[在IDEA中本地验证](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/zh_hans/run-mvn-verify-idea.md)/[在VSCode中本地验证](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/zh_hans/run-mvn-verify-vscode.md)。
  - 非常不推荐：如果你实在不喜欢`git`命令行操作，你可以[点击这里直接下载打包好的代码](https://ghcodeload.bytelegend.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/zip/refs/heads/main)。
  - 或者：如果你非常自信不需要下载代码到本地调试，可以使用网页编辑器直接提交。
  - 或者：如果你对GitHub非常熟悉，你可以fork[这个仓库](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators)、完成挑战后，创建一个Pull Request。
- 机器人将会检查你的答案，告诉你你是否通过了挑战。
- 回到[字节传说](https://bytelegend.com)，然后继续你的英雄旅程。

祝你好运！

如果你需要任何帮助，欢迎加入官方玩家QQ群（在[首页](https://bytelegend.com)右下角的`联系 & 关于`菜单里可以找到入群方式）或者[Discord社区](https://discord.gg/PvmqK3hF)，或email至[contact@bytelegend.com](mailto:contact@bytelegend.com)。

**注意：我们只允许您修改以下文件，任何对其他文件的修改都会被拒绝：**

- `src/main/java/com/bytelegend/Challenge.java`

</details>

<details>
<summary>繁體中文</summary>

### 位運算符的乘法和除法

請完成[src/main/java/com/bytelegend/Challenge.java](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/src/main/java/com/bytelegend/Challenge.java)中的`multiplyBy31()`和`divideBy2ThenMinus1()`方法。

`multiplyBy31Description(int n)`返回給定整數乘以 31 的結果，例如`n=1` ，返回`31` ； `n=2` ，返回`62` 。無需考慮溢出問題。請注意，您不能使用乘號 ( `*` )、除號 ( `/` ) 和加號 ( `+` )。

`divideBy2ThenMinus1(int n)`返回給定整數除以 2 然後減 1 的結果。

例如， `n=1` ，返回`-1` ，因為`1/2=0` ， `0-1=-1` 。

`n=4` ，返回 1，因為`4/2=2` ， `2-1=1` 。

請注意，您不能使用乘號 ( `*` )、除號 ( `/` ) 和加號 ( `+` )。

-   您可以通過以下任何方式完成此挑戰：
    -   推薦給初學者：運行`git clone https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators`下載代碼，在本地 IDE 中完成挑戰，然後復制/粘貼/提交答案網頁編輯器。
        -   如果你不知道怎麼做，你可以點擊[import project into IDEA](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import.md) / [import project into VSCode](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import-vscode.md) 。
        -   在提交代碼之前，您最好在本地運行`mvn verify`以節省時間。不知道怎麼樣？請參閱[在 IDEA](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-idea.md) [中進行本地驗證/在 VSCode 中進行本地驗證](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-vscode.md)。
    -   非常不推薦：如果你不喜歡`git`操作，可以[點擊這裡下載壓縮代碼](https://codeload.github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/zip/refs/heads/main)。
    -   或者：如果您有足夠的信心直接在 Web 編輯器中編寫代碼，請繼續。
    -   或者：如果你熟悉 GitHub，你可以 fork [倉庫](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators)，完成挑戰並創建一個拉取請求。
-   機器人會檢查你的 PR 並告訴你是否完成了挑戰。
-   回到[ByteLegend](https://bytelegend.com)繼續你的英雄之旅。

祝你好運！

如果您需要任何幫助，請隨時加入[Discord 社區](https://discord.gg/35RreUUGWt)或通過[contact@bytelegend.com](mailto:contact@bytelegend.com)聯繫我們。

**注意：我們只允許您修改以下文件。對以下文件以外的文件的任何更改都將被拒絕：**

-   `src/main/java/com/bytelegend/Challenge.java`
</details>

<details>
<summary>Español</summary>

### Multiplicación y división con operadores bit a bit

Finalice los métodos `multiplyBy31()` `divideBy2ThenMinus1()` en [src/main/java/com/bytelegend/Challenge.java](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/src/main/java/com/bytelegend/Challenge.java) \`.

`multiplyBy31Description(int n)` devuelve el resultado de un número entero multiplicado por 31, por ejemplo, `n=1` , devuelve `31` ; `n=2` , devuelve `62` . No es necesario considerar el problema de desbordamiento. Tenga en cuenta que no está permitido usar el signo de multiplicación ( `*` ), el signo de división ( `/` ) y el signo de suma ( `+` ).

`divideBy2ThenMinus1(int n)` devuelve el resultado de dividir un número entero entre 2 y luego menos 1.

Por ejemplo, `n=1` , devuelve `-1` , porque `1/2=0` , `0-1=-1` .

`n=4` , devuelve 1, porque `4/2=2` , `2-1=1` .

Tenga en cuenta que no está permitido usar el signo de multiplicación ( `*` ), el signo de división ( `/` ) y el signo de suma ( `+` ).

-   Puede lograr este desafío de cualquier manera a continuación:
    -   Recomendado para principiantes: ejecute `git clone https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators` para descargar el código, finalice el desafío en su IDE local, luego copie/pegue/envíe la respuesta en Editor web.
        -   Si no sabe cómo hacerlo, puede hacer clic en [importar proyecto a IDEA](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import.md) / [importar proyecto a VSCode](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Antes de enviar su código, es mejor que ejecute `mvn verify` localmente para ahorrar tiempo. ¿No sabes cómo? Ver [verificar localmente en IDEA](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-idea.md) / [verificar localmente en VSCode](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Muy poco recomendado: puede [hacer clic aquí para descargar el código comprimido](https://codeload.github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/zip/refs/heads/main) si no le gustan las operaciones de `git` .
    -   O: si tiene la confianza suficiente para escribir código en el editor web directamente, adelante.
    -   O: si está familiarizado con GitHub, puede bifurcar [el repositorio](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators) , finalizar el desafío y crear una solicitud de extracción.
-   El bot verificará tu PR y te dirá si logras el desafío.
-   Regrese a [ByteLegend](https://bytelegend.com) y continúe su viaje de héroe.

¡Buena suerte!

Si necesita ayuda, no dude en unirse a la [comunidad de Discord](https://discord.gg/35RreUUGWt) o contáctenos a través de [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Nota: solo le permitimos modificar los siguientes archivos. Cualquier cambio en los archivos que no sean los siguientes archivos será rechazado:**

-   `src/main/java/com/bytelegend/Challenge.java`
</details>

<details>
<summary>العربية</summary>

### الضرب والقسمة مع معاملات Bitwise

يرجى الانتهاء من طرق `multiplyBy31()` و `divideBy2ThenMinus1()` في [src / main / java / com / bytelegend / Challenge.java](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/src/main/java/com/bytelegend/Challenge.java) \`.

`multiplyBy31Description(int n)` تُرجع نتيجة عدد صحيح معين مضروبًا في 31 ، على سبيل المثال `n=1` ، وإرجاع `31` ؛ `n=2` ، إرجاع `62` . لا حاجة للنظر في قضية تجاوز السعة. لاحظ أنه غير مسموح لك باستخدام علامة الضرب ( `*` ) وعلامة القسمة ( `/` ) وعلامة الجمع ( `+` ).

`divideBy2ThenMinus1(int n)` تُرجع نتيجة قسمة عدد صحيح معين على 2 ، ثم ناقص 1.

على سبيل المثال ، `n=1` ، إرجاع `-1` ، لأن 1/2 `1/2=0` ، `0-1=-1` .

`n=4` ، إرجاع 1 ، لأن `4/2=2` ، `2-1=1` .

لاحظ أنه غير مسموح لك باستخدام علامة الضرب ( `*` ) وعلامة القسمة ( `/` ) وعلامة الجمع ( `+` ).

-   يمكنك إنجاز هذا التحدي بأي طريقة أدناه:
    -   موصى به للمبتدئين: قم بتشغيل `git clone https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators` لتنزيل الكود ، وإنهاء التحدي في IDE المحلي الخاص بك ، ثم نسخ / لصق / إرسال الإجابة في محررشبكة.
        -   إذا كنت لا تعرف كيف يمكنك النقر فوق [استيراد مشروع إلى IDEA](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import.md) / [استيراد مشروع إلى VSCode](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import-vscode.md) .
        -   قبل إرسال التعليمات البرمجية الخاصة بك ، من الأفضل تشغيل `mvn verify` محليًا لتوفير الوقت. لا أعرف كيف؟ انظر [التحقق محليًا في IDEA](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-idea.md) / [تحقق محليًا في VSCode](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   غير موصى به على الإطلاق: يمكنك [النقر هنا لتنزيل رمز مضغوط](https://codeload.github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/zip/refs/heads/main) إذا كنت لا تحب عمليات `git` .
    -   أو: إذا كنت واثقًا بدرجة كافية لكتابة التعليمات البرمجية في محرر الويب مباشرةً ، فابدأ.
    -   أو: إذا كنت معتادًا على GitHub ، فيمكنك تفرع [الريبو](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators) وإنهاء التحدي وإنشاء طلب سحب.
-   سيتحقق الروبوت من العلاقات العامة الخاصة بك ويخبرك إذا أنجزت التحدي.
-   ارجع إلى [ByteLegend وتابع](https://bytelegend.com) رحلة بطلك.

حظ سعيد!

إذا كنت بحاجة إلى أي مساعدة ، فلا تتردد في الانضمام إلى [مجتمع Discord](https://discord.gg/35RreUUGWt) أو الاتصال بنا عبر [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**ملاحظة: نسمح لك فقط بتعديل الملفات التالية. سيتم رفض أي تغييرات يتم إجراؤها على الملفات بخلاف الملفات التالية:**

-   `src/main/java/com/bytelegend/Challenge.java`
</details>

<details>
<summary>Português</summary>

### Multiplicação e divisão com operadores bit a bit

Por favor, termine os métodos `multiplyBy31()` e `divideBy2ThenMinus1()` em [src/main/java/com/bytelegend/Challenge.java](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/src/main/java/com/bytelegend/Challenge.java) \`.

`multiplyBy31Description(int n)` retorna o resultado de um dado inteiro multiplicado por 31, ex. `n=1` , return `31` ; `n=2` , retorne `62` . Não há necessidade de considerar o problema de estouro. Observe que você não tem permissão para usar o sinal de multiplicação ( `*` ), o sinal de divisão ( `/` ) e o sinal de adição ( `+` ).

`divideBy2ThenMinus1(int n)` retorna o resultado de um determinado inteiro dividido por 2 e menos 1.

Por exemplo, `n=1` , retorne `-1` , porque `1/2=0` , `0-1=-1` .

`n=4` , retorna 1, porque `4/2=2` , `2-1=1` .

Observe que você não tem permissão para usar o sinal de multiplicação ( `*` ), o sinal de divisão ( `/` ) e o sinal de adição ( `+` ).

-   Você pode realizar este desafio de qualquer maneira abaixo:
    -   Recomendado para iniciantes: execute `git clone https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators` para baixar o código, termine o desafio em seu IDE local e copie/cole/envie a resposta em editor web.
        -   Se você não sabe como, você pode clicar em [importar projeto para IDEA](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import.md) / [importar projeto para VSCode](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Antes de enviar seu código, é melhor você executar `mvn verify` localmente para economizar tempo. Não sei como? Consulte [verificar localmente em IDEA](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-idea.md) / [verificar localmente em VSCode](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Muito não recomendado: você pode [clicar aqui para baixar o código zipado](https://codeload.github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/zip/refs/heads/main) se não gostar das operações do `git` .
    -   Ou: se você estiver confiante o suficiente para escrever código diretamente no editor web, vá em frente.
    -   Ou: se você estiver familiarizado com o GitHub, você pode bifurcar [o repo](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators) , finalizar o desafio e criar um pull request.
-   O bot verificará seu PR e informará se você cumprir o desafio.
-   Volte para [ByteLegend](https://bytelegend.com) e continue sua jornada de herói.

Boa sorte!

Se precisar de ajuda, sinta-se à vontade para se juntar à [Comunidade Discord](https://discord.gg/35RreUUGWt) ou entre em contato conosco via [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Nota: só permitimos que você modifique os seguintes arquivos. Quaisquer alterações em arquivos que não sejam os arquivos a seguir serão rejeitadas:**

-   `src/main/java/com/bytelegend/Challenge.java`
</details>

<details>
<summary>Bahasa Indonesia</summary>

### Perkalian dan Pembagian dengan Operator Bitwise

Selesaikan metode `multiplyBy31()` dan `divideBy2ThenMinus1()` di [src/main/java/com/bytelegend/Challenge.java](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/src/main/java/com/bytelegend/Challenge.java) \`.

`multiplyBy31Description(int n)` mengembalikan hasil dari bilangan bulat yang diberikan dikalikan dengan 31, misalnya `n=1` , return `31` ; `n=2` , kembalikan `62` . Tidak perlu mempertimbangkan masalah overflow. Perhatikan bahwa Anda tidak diperbolehkan menggunakan tanda perkalian ( `*` ), tanda pembagian ( `/` ), dan tanda penambahan ( `+` ).

`divideBy2ThenMinus1(int n)` mengembalikan hasil bilangan bulat yang diberikan dibagi 2, lalu dikurangi 1.

Misalnya, `n=1` , kembalikan `-1` , karena `1/2=0` , `0-1=-1` .

`n=4` , kembalikan 1, karena `4/2=2` , `2-1=1` .

Perhatikan bahwa Anda tidak diperbolehkan menggunakan tanda perkalian ( `*` ), tanda pembagian ( `/` ), dan tanda penambahan ( `+` ).

-   Anda dapat menyelesaikan tantangan ini melalui cara apa pun di bawah ini:
    -   Direkomendasikan untuk pemula: jalankan `git clone https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators` untuk mengunduh kode, selesaikan tantangan di IDE lokal Anda, lalu salin/tempel/kirim jawabannya di editor web.
        -   Jika Anda tidak tahu caranya, Anda bisa mengklik [import project into IDEA](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import.md) / [import project into VSCode](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Sebelum mengirimkan kode Anda, Anda sebaiknya menjalankan `mvn verify` secara lokal untuk menghemat waktu. Tidak tahu bagaimana? Lihat [verifikasi secara lokal di IDEA](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-idea.md) / [verifikasi secara lokal di VSCode](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Sangat tidak direkomendasikan: Anda dapat [mengklik di sini untuk mengunduh kode zip](https://codeload.github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/zip/refs/heads/main) jika Anda tidak menyukai operasi `git` .
    -   Atau: jika Anda cukup percaya diri untuk menulis kode di editor web secara langsung, silakan.
    -   Atau: jika Anda terbiasa dengan GitHub, Anda dapat melakukan fork [repo](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators) , menyelesaikan tantangan, dan membuat permintaan tarik.
-   Bot akan memeriksa PR Anda dan memberi tahu Anda jika Anda menyelesaikan tantangan.
-   Kembali ke [ByteLegend](https://bytelegend.com) dan lanjutkan perjalanan pahlawan Anda.

Semoga beruntung!

Jika Anda memerlukan bantuan, jangan ragu untuk bergabung dengan [Komunitas Discord](https://discord.gg/35RreUUGWt) atau hubungi kami melalui [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Catatan: kami hanya mengizinkan Anda untuk mengubah file berikut. Setiap perubahan pada file selain file berikut akan ditolak:**

-   `src/main/java/com/bytelegend/Challenge.java`
</details>

<details>
<summary>Français</summary>

### Multiplication et division avec des opérateurs au niveau du bit

Veuillez terminer les méthodes `multiplyBy31()` et `divideBy2ThenMinus1()` dans [src/main/java/com/bytelegend/Challenge.java](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/src/main/java/com/bytelegend/Challenge.java) \`.

`multiplyBy31Description(int n)` renvoie le résultat d'un entier donné multiplié par 31, par exemple `n=1` , return `31` ; `n=2` , retour `62` . Pas besoin de considérer le problème de débordement. Notez que vous n'êtes pas autorisé à utiliser le signe de multiplication ( `*` ), le signe de division ( `/` ) et le signe d'addition ( `+` ).

`divideBy2ThenMinus1(int n)` renvoie le résultat d'un nombre entier donné divisé par 2, puis moins 1.

Par exemple, `n=1` , renvoie `-1` , car `1/2=0` , `0-1=-1` .

`n=4` , renvoie 1, car `4/2=2` , `2-1=1` .

Notez que vous n'êtes pas autorisé à utiliser le signe de multiplication ( `*` ), le signe de division ( `/` ) et le signe d'addition ( `+` ).

-   Vous pouvez accomplir ce défi de n'importe quelle manière ci-dessous:
    -   Recommandé pour les débutants : exécutez `git clone https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators` pour télécharger le code, terminez le défi dans votre IDE local, puis copiez/collez/soumettez la réponse dans éditeur web.
        -   Si vous ne savez pas comment, vous pouvez cliquer sur [importer le projet dans IDEA](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import.md) / [importer le projet dans VSCode](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Avant de soumettre votre code, vous feriez mieux d'exécuter `mvn verify` localement pour gagner du temps. Vous ne savez pas comment ? Voir [vérifier localement dans IDEA](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-idea.md) / [vérifier localement dans VSCode](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Très déconseillé : vous pouvez [cliquer ici pour télécharger le code compressé](https://codeload.github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/zip/refs/heads/main) si vous n'aimez pas les opérations `git` .
    -   Ou : si vous êtes suffisamment confiant pour écrire du code directement dans l'éditeur Web, continuez.
    -   Ou : si vous êtes familier avec GitHub, vous pouvez forker [le dépôt](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators) , terminer le défi et créer une demande d'extraction.
-   Le bot vérifiera votre PR et vous dira si vous accomplissez le défi.
-   Retournez à [ByteLegend](https://bytelegend.com) et continuez votre voyage de héros.

Bonne chance!

Si vous avez besoin d'aide, n'hésitez pas à rejoindre la [communauté Discord](https://discord.gg/35RreUUGWt) ou à nous contacter via [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Remarque : nous vous autorisons uniquement à modifier les fichiers suivants. Toute modification de fichiers autres que les fichiers suivants sera rejetée :**

-   `src/main/java/com/bytelegend/Challenge.java`
</details>

<details>
<summary>日本語</summary>

### ビット演算子による乗算と除算

[src / main / java / com / bytelegend / Challenge.java](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/src/main/java/com/bytelegend/Challenge.java) \`のmultiplyBy31（）メソッドと`divideBy2ThenMinus1()`メソッドを終了し`multiplyBy31()`ください。

`multiplyBy31Description(int n)`は、指定された整数に31を掛けた結果を返します。たとえば、 `n=1` `31`返します。 `n=2` `62`返します。オーバーフローの問題を考慮する必要はありません。乗算記号（ `*` ）、除算記号（ `/` ）、および加算記号（ `+` ）は使用できないことに注意してください。

`divideBy2ThenMinus1(int n)`は、指定された整数を2で除算し、次に1を引いた結果を返します。

たとえば、 `n=1`の場合、 `1/2=0` `0-1=-1`であるため、 `-1`を返します。

`n=4` `4/2=2` `2-1=1`であるため、1を返します。

乗算記号（ `*` ）、除算記号（ `/` ）、および加算記号（ `+` ）は使用できないことに注意してください。

-   この課題は、以下のいずれかの方法で達成できます。
    -   初心者に推奨： `git clone https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators`を実行してコードをダウンロードし、ローカルIDEでチャレンジを終了してから、で回答をコピー/貼り付け/送信します。 Webエディタ。
        -   方法がわからない場合は、\[ [プロジェクトをIDEAにインポート](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import.md)\]/\[ [プロジェクトをVSCodeにインポート](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import-vscode.md)\]をクリックできます。
        -   コードを送信する前に、時間を節約するためにローカルで`mvn verify`実行することをお勧めします。方法がわかりませんか？ [IDEAでローカルに](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-idea.md)[検証する/VSCodeでローカルに](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-vscode.md)検証するを参照してください。
    -   非常に推奨されていません`git`操作が気に入らない場合は、 [ここをクリックしてzipコードをダウンロード](https://codeload.github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/zip/refs/heads/main)できます。
    -   または：Webエディターで直接コードを記述できる自信がある場合は、先に進んでください。
    -   または：GitHubに精通している場合は[、リポジトリ](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators)をフォークしてチャレンジを終了し、プルリクエストを作成できます。
-   ボットはPRをチェックし、チャレンジを達成したかどうかを通知します。
-   [ByteLegend](https://bytelegend.com)に戻り、ヒーローの旅を続けてください。

幸運を！

ヘルプが必要な場合は、 [Discordコミュニティ](https://discord.gg/35RreUUGWt)に参加するか、contact [@bytelegend.com](mailto:contact@bytelegend.com)からお問い合わせください。

**注：変更できるのは次のファイルのみです。次のファイル以外のファイルへの変更は拒否されます。**

-   `src/main/java/com/bytelegend/Challenge.java`
</details>

<details>
<summary>Русский</summary>

### Умножение и деление с побитовыми операторами

Пожалуйста, завершите методы multipleBy31( `multiplyBy31()` и `divideBy2ThenMinus1()` в [src/main/java/com/bytelegend/Challenge.java](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/src/main/java/com/bytelegend/Challenge.java) \`.

`multiplyBy31Description(int n)` возвращает результат умножения заданного целого числа на 31, например `n=1` , return `31` ; `n=2` , вернуть `62` . Нет необходимости рассматривать проблему переполнения. Обратите внимание, что вам не разрешено использовать знак умножения ( `*` ), знак деления ( `/` ) и знак сложения ( `+` ).

`divideBy2ThenMinus1(int n)` возвращает результат деления заданного целого числа на 2, а затем минус 1.

Например, `n=1` , вернуть `-1` , потому что `1/2=0` , `0-1=-1` .

`n=4` , вернуть 1, потому что `4/2=2` , `2-1=1` .

Обратите внимание, что вам не разрешено использовать знак умножения ( `*` ), знак деления ( `/` ) и знак сложения ( `+` ).

-   Вы можете выполнить эту задачу любым способом, указанным ниже:
    -   Рекомендуется для начинающих: запустите `git clone https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators` , чтобы загрузить код, завершите задание в локальной среде IDE, затем скопируйте/вставьте/отправьте ответ в веб-редактор.
        -   Если вы не знаете как, вы можете нажать [импортировать проект в IDEA](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import.md) / [импортировать проект в VSCode](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Перед отправкой кода вам лучше запустить `mvn verify` локально, чтобы сэкономить время. Не знаете как? См. « [Проверить локально в IDEA](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-idea.md) / [проверить локально в VSCode»](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Крайне не рекомендуется: вы можете [щелкнуть здесь, чтобы загрузить заархивированный код](https://codeload.github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/zip/refs/heads/main) , если вам не нравятся операции `git` .
    -   Или: если вы достаточно уверены, чтобы писать код напрямую в веб-редакторе, вперед.
    -   Или: если вы знакомы с GitHub, вы можете разветвить [репо](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators) , выполнить задание и создать запрос на включение.
-   Бот проверит ваш PR и сообщит, выполнили ли вы задание.
-   Вернитесь в [ByteLegend](https://bytelegend.com) и продолжайте свое героическое путешествие.

Удачи!

Если вам нужна помощь, присоединяйтесь к [сообществу Discord](https://discord.gg/35RreUUGWt) или свяжитесь с нами по [адресу contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Примечание: мы разрешаем вам изменять только следующие файлы. Любые изменения в файлах, кроме следующих файлов, будут отклонены:**

-   `src/main/java/com/bytelegend/Challenge.java`
</details>

<details>
<summary>Deutsch</summary>

### Multiplikation und Division mit bitweisen Operatoren

Bitte beenden Sie die Methoden `multiplyBy31()` und `divideBy2ThenMinus1()` in [src/main/java/com/bytelegend/Challenge.java](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/src/main/java/com/bytelegend/Challenge.java) \`.

`multiplyBy31Description(int n)` gibt das Ergebnis der Multiplikation einer gegebenen Ganzzahl mit 31 zurück, zB `n=1` , return `31` ; `n=2` , Rückgabe `62` . Überlaufprobleme müssen nicht berücksichtigt werden. Beachten Sie, dass Sie kein Multiplikationszeichen ( `*` ), Divisionszeichen ( `/` ) und Additionszeichen ( `+` ) verwenden dürfen.

`divideBy2ThenMinus1(int n)` gibt das Ergebnis der Division einer gegebenen Ganzzahl durch 2 und dann minus 1 zurück.

Beispiel: `n=1` , gib `-1` zurück, weil `1/2=0` , `0-1=-1` .

`n=4` , gib 1 zurück, weil `4/2=2` , `2-1=1` .

Beachten Sie, dass Sie kein Multiplikationszeichen ( `*` ), Divisionszeichen ( `/` ) und Additionszeichen ( `+` ) verwenden dürfen.

-   Sie können diese Herausforderung auf eine der folgenden Arten meistern:
    -   Empfohlen für Anfänger: Führen Sie `git clone https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators` aus, um den Code herunterzuladen, beenden Sie die Herausforderung in Ihrer lokalen IDE und kopieren/fügen Sie dann die Antwort ein/senden Sie sie ein Web-Editor.
        -   Wenn Sie nicht wissen wie, können Sie auf [Projekt in IDEA](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import.md) [importieren / Projekt in VSCode importieren klicken](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Bevor Sie Ihren Code einreichen, sollten Sie `mvn verify` besser lokal ausführen, um Zeit zu sparen. Sie wissen nicht wie? Siehe [Lokal verifizieren in IDEA](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-idea.md) / [Lokal verifizieren in VSCode](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Sehr nicht zu empfehlen: Sie können [hier klicken, um den gezippten Code herunterzuladen,](https://codeload.github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/zip/refs/heads/main) wenn Sie `git` -Operationen nicht mögen.
    -   Oder: Wenn Sie sicher genug sind, Code direkt im Web-Editor zu schreiben, fahren Sie fort.
    -   Oder: Wenn Sie sich mit GitHub auskennen, können Sie [das Repo forken](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators) , die Challenge beenden und einen Pull-Request erstellen.
-   Der Bot überprüft Ihre PR und teilt Ihnen mit, ob Sie die Herausforderung meistern.
-   Gehen Sie zurück zu [ByteLegend](https://bytelegend.com) und setzen Sie Ihre Heldenreise fort.

Viel Glück!

Wenn Sie Hilfe benötigen, können Sie sich gerne der [Discord Community](https://discord.gg/35RreUUGWt) anschließen oder uns über [contact@bytelegend.com kontaktieren](mailto:contact@bytelegend.com) .

**Hinweis: Wir erlauben Ihnen nur, die folgenden Dateien zu ändern. Alle Änderungen an anderen Dateien als den folgenden Dateien werden abgelehnt:**

-   `src/main/java/com/bytelegend/Challenge.java`
</details>

<details>
<summary>한국어</summary>

### 비트 연산자를 사용한 곱셈과 나눗셈

[src/main/java/com/bytelegend/Challenge.java](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/src/main/java/com/bytelegend/Challenge.java) \`에서 multiBy31( `multiplyBy31()` 및 `divideBy2ThenMinus1()` 메서드를 완료하십시오.

`multiplyBy31Description(int n)` 은 주어진 정수에 31을 곱한 결과를 반환합니다(예: `n=1` , 반환 `31` ; `n=2` , `62` 를 반환합니다. 오버플로 문제를 고려할 필요가 없습니다. 곱하기 기호( `*` ), 나눗셈 기호( `/` ), 더하기 기호( `+` )는 사용할 수 없습니다.

`divideBy2ThenMinus1(int n)` 은 주어진 정수를 2로 나눈 다음 1을 뺀 결과를 반환합니다.

예를 들어 `n=1` , `1/2=0` , `0-1=-1` 이므로 `-1` 을 반환합니다.

`n=4` , `4/2=2` , `2-1=1` 이므로 1을 반환합니다.

곱하기 기호( `*` ), 나눗셈 기호( `/` ), 더하기 기호( `+` )는 사용할 수 없습니다.

-   아래 방법을 통해 이 챌린지를 완료할 수 있습니다.
    -   초보자에게 권장: `git clone https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators` 를 실행하여 코드를 다운로드하고 로컬 IDE에서 챌린지를 완료한 다음 답을 복사/붙여넣기/제출합니다. 웹 에디터.
        -   방법을 모르는 경우 [프로젝트를 IDEA로](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import.md) [가져오기 / 프로젝트를 VSCode로 가져](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import-vscode.md) 오기를 클릭할 수 있습니다.
        -   코드를 제출하기 전에 시간을 절약하기 위해 로컬에서 `mvn verify` 를 실행하는 것이 좋습니다. 방법을 모르십니까? [IDEA에서 로컬로](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-idea.md) [확인/VSCode에서 로컬로](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-vscode.md) 확인을 참조하세요.
    -   매우 권장하지 않음: `git` 작업이 마음에 들지 않으면 [여기를 클릭하여 압축 코드를 다운로드](https://codeload.github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/zip/refs/heads/main) 할 수 있습니다.
    -   또는 웹 편집기에서 직접 코드를 작성할 만큼 자신이 있다면 계속 진행하십시오.
    -   또는 GitHub에 익숙하다면 리포지토리를 분기 [하고](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators) 챌린지를 완료하고 풀 요청을 생성할 수 있습니다.
-   봇은 PR을 확인하고 도전 과제를 달성했는지 알려줍니다.
-   [ByteLegend](https://bytelegend.com) 로 돌아가 영웅 여정을 계속하세요.

행운을 빕니다!

도움이 필요하면 언제든지 [Discord 커뮤니티](https://discord.gg/35RreUUGWt) 에 가입하거나 [contact@bytelegend.com](mailto:contact@bytelegend.com) 을 통해 문의하세요.

**참고: 다음 파일만 수정할 수 있습니다. 다음 파일 이외의 파일에 대한 변경 사항은 거부됩니다.**

-   `src/main/java/com/bytelegend/Challenge.java`
</details>

<details>
<summary>Italiano</summary>

### Moltiplicazione e Divisione con Operatori Bitwise

Completare i metodi `multiplyBy31()` e `divideBy2ThenMinus1()` in [src/main/java/com/bytelegend/Challenge.java](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/src/main/java/com/bytelegend/Challenge.java) \`.

`multiplyBy31Description(int n)` restituisce il risultato di un dato intero moltiplicato per 31, ad esempio `n=1` , return `31` ; `n=2` , restituisce `62` . Non c'è bisogno di considerare il problema dell'overflow. Si noti che non è consentito utilizzare il segno di moltiplicazione ( `*` ), il segno di divisione ( `/` ) e il segno di addizione ( `+` ).

`divideBy2ThenMinus1(int n)` restituisce il risultato di un dato intero che divide per 2, quindi meno 1.

Ad esempio, `n=1` , return `-1` , perché `1/2=0` , `0-1=-1` .

`n=4` , restituisce 1, perché `4/2=2` , `2-1=1` .

Si noti che non è consentito utilizzare il segno di moltiplicazione ( `*` ), il segno di divisione ( `/` ) e il segno di addizione ( `+` ).

-   Puoi portare a termine questa sfida in qualsiasi modo di seguito:
    -   Consigliato per i principianti: esegui `git clone https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators` per scaricare il codice, completa la sfida nel tuo IDE locale, quindi copia/incolla/invia la risposta in editore web.
        -   Se non sai come fare, puoi fare clic su [importa progetto in IDEA](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import.md) / [importa progetto in VSCode](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/clone-and-import-vscode.md) .
        -   Prima di inviare il codice, è meglio eseguire `mvn verify` in locale per risparmiare tempo. Non sai come? Vedere [verifica in locale in IDEA](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-idea.md) / [verifica in locale in VSCode](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/blob/main/docs/en/run-mvn-verify-vscode.md) .
    -   Molto sconsigliato: puoi fare [clic qui per scaricare il codice zippato](https://codeload.github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators/zip/refs/heads/main) se non ti piacciono le operazioni `git` .
    -   Oppure: se sei abbastanza sicuro da scrivere il codice direttamente nell'editor web, vai avanti.
    -   Oppure: se hai familiarità con GitHub, puoi eseguire il fork [del repository](https://github.com/ByteLegendQuest/java-multiply-divide-with-bitwise-operators) , completare la sfida e creare una richiesta pull.
-   Il bot controllerà il tuo PR e ti dirà se hai superato la sfida.
-   Torna a [ByteLegend](https://bytelegend.com) e continua il tuo viaggio da eroe.

Buona fortuna!

Se hai bisogno di aiuto, non esitare a unirti alla [community di Discord](https://discord.gg/35RreUUGWt) o contattaci tramite [contact@bytelegend.com](mailto:contact@bytelegend.com) .

**Nota: ti permettiamo solo di modificare i seguenti file. Eventuali modifiche ai file diversi dai seguenti file verranno rifiutate:**

-   `src/main/java/com/bytelegend/Challenge.java`
</details>
