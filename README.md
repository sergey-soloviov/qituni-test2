# Микросайт
## Открытие проекта

Как пройти весь этот список вы увидете здесь: https://youtu.be/GbM09vhQgso.

Для открытие проекта необходимо:
1. Установить JDK 11 (https://www.oracle.com/java/technologies/javase-jdk11-downloads.html). 
2. Установите среду разработки IntelliJ Idea Community Edition (https://www.jetbrains.com/idea/download).
3. Откройте установленную IntelliJ Idea.
4. Скачайте этот проект и распакуйте его куда-нибудь.
5. Откройте проект. Для этого:
    1. Нажмите на кнопку **Open** в окне приветствия.
    2. В открывшемся диалоговом окне в каталоге куда распаковали проект выберите файл build.gradle и нажмите на **OK**.
    3. В открывшемся диалоговом окне выберите **Open as Project**.

## Сборка проекта
1. В правой части окна вы найдёте боковую надпись **Gradle**.
2. Найдите в меню test2 -> Tasks -> build -> build.
3. Дважды кликнете на него.
4. Откроется внизу консоль с прогрессом сборки. По концовке должна быть запись **BUILD SUCCESSFUL**. 
Значит всё успешно собралось.

## Запуска cайта
Вы это можете посмотреть на видео в вебинаре, но кратко это можно описать так:
1. В ниспадающем меню в верхнем правом углу экрана рядом в зелёным молоточком выберите пункт **Edit configurations**.
2. В верхнем левом углу диалогового окна нажмите на плюсик.
3. Выберите **Application**
4. Правее поля ввода **Main class** нажмите на кнопку с тремя точками.
5. Выберите **Test2Application**
6. В поле **Use classpath module** выберите **test2.main**.
7. В поле **JRE** выберите одинадцатую джаву.
8. Нажмите на **OK**.
9. В ниспадающем меню выберите пункт **Unnamed** (мы его только что создали).
10. Нажмите на зелёную стрелку правее этого ниспадающего меню. Проект запустится.
11. Когда внизу экрана в консоли вы увидете надпись похожую на "Started Test2Application in 1.148 seconds (JVM running for 6.708)"
откройте бразер и введите http://localhost:8080

## Внештатные ситуации
1. У меня нет JRE одинадцатой в списке запуска.
    Для этого в меню выберите File -> Project Structure.  В диалоговом окне выберите слева **SDKs** и нажмите на плюсик расположенный над второй колонкой.
    Выберите **JDK**. Найдите и выберите каталог куда установили джаву (из п. 1 раздела "Открытие проекта"). Потом на **OK**. 

## Структура проекта
1. src - главный каталог с исходным кодом проекта
2. src/main/resources/static/images - картинки сайта
3. src/main/resources/static/css - стили. Достаточно править styles.css
4. src/main/resources/templates - шаблоны для отображения на сайте
5. src/main/java/test2/MainController - класс с логикой сайта
    1. метод index() - реагирует на главную страницу сайта и возвращает имя шаблона для использования
    2. метод download(...) - реагирует на отправку емэйла и возврщает также имя шаблона для отображения
    
    
**Успехов в освоении Java и веб программирования**
