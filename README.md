Для запуска проекта проделайте следующие шаги:
(как сделать просто и чтобы точно работало)
1. Установить IntellijIDEA
3. В разделе Project Structure->Project->SDK выбирите Download SDK,выбирите версию 17(если нет никакой jdk)
4. обновите зависисости, нажав reload maven(справа кнопка, m, затем кнопка перезагрузки)
5. Запустите проект нажав на зеленую кнопку

(как сделать сложно, но без IDE)
1. Установите jdk17
2. Пропишите путь до jdk/bin в переменные среды
3. Установите maven
4. пропишите путь к maven/bin в переменные среды
5. Откройте терминал, перейдите в папку проекта
6.  напишите команды- mvn clean, mvn install
7. Должна появится папка target в папке проекта 
8. найдите в ней jar архив
9. Запустите его командой java jar /path/(name).jar
