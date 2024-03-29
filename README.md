Тесты к курсу «Технологии Java»
====

[Условия домашних заданий](http://www.kgeorgiy.info/courses/java-advanced/homeworks.html)

Домашнее задание 9. HelloUDP
----
* Протестировать клиент:

        info.kgeorgiy.java.advanced.hello.Tester client <полное имя класса>

* Протестировать сервер:

        info.kgeorgiy.java.advanced.hello.Tester server <полное имя класса>

Исходный код тестов:

* [Клиента](java/info/kgeorgiy/java/advanced/hello/HelloClientTest.java)
* [Сервера](java/info/kgeorgiy/java/advanced/hello/HelloServerTest.java)

Домашнее задание 8. Web Crawler
----
* Протестировать простую версию задания:

        info.kgeorgiy.java.advanced.crawler.Tester easy <полное имя класса>

* Протестировать сложную версию задания:

        info.kgeorgiy.java.advanced.crawler.Tester hard <полное имя класса>

Исходный код тестов:

* [Простой вариант](java/info/kgeorgiy/java/advanced/crawler/CrawlerEasyTest.java)
* [Сложный вариант](java/info/kgeorgiy/java/advanced/crawler/CrawlerHardTest.java)

Домашнее задание 7. Параллельный запуск
----
* Протестировать простую версию задания:

        info.kgeorgiy.java.advanced.mapper.Tester taskScalar <ParallelMapperImpl>,<IterativeParallelism>

* Протестировать сложную версию задания:

        info.kgeorgiy.java.advanced.mapper.Tester taskList <ParallelMapperImpl>,<IterativeParallelism>

Внимание! Между полными именами классов `ParallelMapperImpl` и `IterativeParallelism` должна
быть запятая и не должно быть пробелов.

Исходный код тестов:

* [Простой вариант](java/info/kgeorgiy/java/advanced/concurrent/ScalarTPTest.java)
* [Сложный вариант](java/info/kgeorgiy/java/advanced/concurrent/ListTPTest.java)

Домашнее задание 6. Итеративный параллелизм
----
* Протестировать сложную версию задания:

        info.kgeorgiy.java.advanced.concurrent.Tester list <полное имя класса>

  Класс должен реализовывать интерфейс
  [ListIP](java/info/kgeorgiy/java/advanced/concurrent/ListIP.java).
* Протестировать простую версию задания:

        info.kgeorgiy.java.advanced.concurrent.Tester scalar <полное имя класса>

  Класс должен реализовывать интерфейс
  [ScalarIP](java/info/kgeorgiy/java/advanced/concurrent/ScalarIP.java).

Исходный код тестов:

* [Простой вариант](java/info/kgeorgiy/java/advanced/concurrent/ScalarIPTest.java)
* [Сложный вариант](java/info/kgeorgiy/java/advanced/concurrent/ListIPTest.java)


Домашнее задание 4. JarImplementor
----
* Протестировать простую версию задания:

        info.kgeorgiy.java.advanced.implementor.Tester jar-interface <полное имя класса>

  Класс должен реализовывать интерфейс
  [JarImpler](java/info/kgeorgiy/java/advanced/implementor/JarImpler.java).

* Протестировать сложную версию задания:

        info.kgeorgiy.java.advanced.implementor.Tester jar-class <полное имя класса>

  Класс должен реализовывать интерфейс
  [JarImpler](java/info/kgeorgiy/java/advanced/implementor/JarImpler.java).

Домашнее задание 3. Implementor
----
* Протестировать простую версию задания:

        info.kgeorgiy.java.advanced.implementor.Tester interface <полное имя класса>

  Класс должен реализовывать интерфейс
  [Impler](java/info/kgeorgiy/java/advanced/implementor/Impler.java).

* Протестировать сложную версию задания:

        info.kgeorgiy.java.advanced.implementor.Tester class <полное имя класса>

  Класс должен реализовывать интерфейс
  [Impler](java/info/kgeorgiy/java/advanced/implementor/Impler.java).

Исходный код тестов:

* [Простой вариант](java/info/kgeorgiy/java/advanced/implementor/InterfaceImplementorTest.java)
* [Сложный вариант](java/info/kgeorgiy/java/advanced/implementor/ClassImplementorTest.java)

Домашнее задание 2. ArraySortedSet
----
* Протестировать сложную версию задания:

        info.kgeorgiy.java.advanced.arrayset.Tester NavigableSet <полное имя класса>

* Протестировать простую версию задания:

        info.kgeorgiy.java.advanced.arrayset.Tester SortedSet <полное имя класса>

Исходный код тестов:

* [Простой вариант](java/info/kgeorgiy/java/advanced/arrayset/SortedSetTest.java)
* [Сложный вариант](java/info/kgeorgiy/java/advanced/arrayset/NavigableSetTest.java)

Домашнее задание 1. Обход файлов
----
Для того, чтобы протестировать программу:

 1. Скачайте тесты ([WalkTest.jar](artifacts/WalkTest.jar)) и библиотеки к ним:
    [junit-4.11.jar](lib/junit-4.11.jar) [hamcrest-core-1.3.jar](lib/hamcrest-core-1.3.jar)
 * Откомпилируйте решение домашнего задания
 * Запустите

        info.kgeorgiy.java.advanced.walk.Tester Walk <полное имя класса>

   для простого варианта, и

        info.kgeorgiy.java.advanced.walk.Tester RecursiveWalk <полное имя класса>

   для сложного. Обратите внимание, что все скачанные `.jar` файлы должны
   быть указаны в `CLASSPATH`.

Исходный код тестов:

* [Простой вариант](java/info/kgeorgiy/java/advanced/walk/WalkTest.java)
* [Сложный вариант](java/info/kgeorgiy/java/advanced/walk/RecursiveWalkTest.java)
