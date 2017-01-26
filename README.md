Java Fundamentals - Homework 1
===========

This project is **Homework 1** for the [Java Fundamentals](https://courses.cs.ttu.ee/pages/ITI8905) course. The goal of this homework is to introduce how the upcoming homeworks will be structured and to explain how you can submit yours for grading.

The homeworks given in this course will generally follow the structure of a [Maven](http://maven.apache.org/) project similar to the one here.

Getting Started
---------------

Start off by cloning this Git repository by running

```shell
git clone https://github.com/JavaFundamentalsZT/jf-hw-intro
```
or by downloading and extracting the [homework zip](https://github.com/svenlaanela/jf-hw-intro/zipball/master).

Assignment structure
--------------------------

The homework project contains 2 source folders with 3 classes:
```
src/main/java
+- org.zeroturnaround.jf.Main
\- org.zeroturnaround.jf.homework1.Homework
src/main/test
\- org.zeroturnaround.jf.homework1.HomeworkTest
```

The `Main.main` method is the main entrypoint for the application, and calls the method `getCommonPrefix(String first, String second)` in the `Homework` class.
`HomeworkTest` serves as a container for two [JUnit](http://junit.org/junit4/) test methods that call and verify if the methods in the `Homework` class function correctly.

Building the project
--------------------

You can try to build the application now by running *(Windows users should use **mvnw.cmd** instead)*:
```shell
./mvnw clean package
```
However, when you do this, the build should fail because of a failing **JUnit** test. You should see the following error message in the console:

```shell
Results :

Failed tests:   testGetCommonSuffix(org.zeroturnaround.jf.homework1.HomeworkTest): expected:<[JavaFundamentals]> but was:<[fix me!]>

Tests run: 2, Failures: 1, Errors: 0, Skipped: 0
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 2.105 s
[INFO] Finished at: 2017-01-26T17:04:14+02:00
[INFO] Final Memory: 18M/304M
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.12.4:test (default-test) on project homework1: There are test failures.
```

If you look at the error message you can see that the `testGetCommonSuffix()` method in `HomeworkTest` class failed. Opening the class we can see that this test calls `Homework.getCommonSuffix(String first, String second)`
but if you look at that method, you can see that it does not really do anything - it always returns "fix me!".

Homework assignment
-------------------

Your first assignment in this course is to modify the `getCommonSuffix(String first, String second)` method in the `Homework` class to do what it is supposed to do - find a common suffix for two strings. They way it should work is also written in the *javadoc* comments for the method.
Once you have fixed the implementation and it does what it is supposed to, run the build again:
```shell
./mvnw clean package
```
The tests should now pass and you should see the following success message in the console:
```shell
Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

[INFO]
[INFO] --- maven-jar-plugin:3.0.2:jar (default-jar) @ homework1 ---
[INFO] Building jar: /Users/lanza/Projects/java/jf/jf-hw-intro/target/jf-homework1.jar
[INFO]
[INFO] --- maven-shade-plugin:2.4.3:shade (default) @ homework1 ---
[INFO] Including org.apache.commons:commons-lang3:jar:3.4 in the shaded jar.
[INFO] Replacing original artifact with shaded artifact.
[INFO] Replacing /Users/lanza/Projects/java/jf/jf-hw-intro/target/jf-homework1.jar with /Users/lanza/Projects/java/jf/jf-hw-intro/target/homework1-0.0.1-SNAPSHOT-shaded.jar
[INFO] Dependency-reduced POM written at: /Users/lanza/Projects/java/jf/jf-hw-intro/dependency-reduced-pom.xml
[INFO] Dependency-reduced POM written at: /Users/lanza/Projects/java/jf/jf-hw-intro/dependency-reduced-pom.xml
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 3.355 s
[INFO] Finished at: 2017-01-26T17:18:38+02:00
[INFO] Final Memory: 19M/215M
[INFO] ------------------------------------------------------------------------
```

Once you have gotten that one failing test to pass, you may also want to experiment with adding more tests to the `HomeworkTest` class for other string pairs to
verify your implementation works correctly for different kinds of inputs.

NB! Please note that just returning **"JavaFundamentals"** from the `getCommonSuffix` method - while arguably very clever - will not be accepted as a correct solution. :)

Running the application
-----------------------

Once you have successfully built the application, a jar file is generated to `target/jf-homework1.jar`. You can now try running the application's `main` method by calling:
```shell
java -jar target/jf-homework1.jar firstString secondString
```
If you fixed the method in the prevoius section your application should now work correctly and output `String` to the console

*Note: If you want to use a different class as your `Main`, you can change this on *line 42* in the `pom.xml` file*

Submitting your assignment
--------------------------

When you have gotten the test passing and the build to succeed, you can submit your assignment by first running the following command in the homework root folder:

```shell
./mvnw clean deploy
```

It will ask you for your **full name**, **Student Book Number** (also known as *matrikli number*) and a **comment** *(optional)*.

Example:

```shell
./mvnw clean deploy

#...skipping building, testing and packaging output from Maven...

[INFO] --- maven-antrun-plugin:1.7:run (package homework ZIP) ---
[INFO] Executing tasks

main:
Your full name (e.g. John Smith):
Jane Smith
Your Student Book Number (matrikli number, e.g. B12345):
B12345
Comment:
Java IO
      [zip] Building zip: /Users/jane/Workspaces/JF/jf-skeleton/target/jf-howework1-B12345.zip
   [delete] Deleting: /Users/jane/Workspaces/JF/jf-skeleton/homework.properties
[INFO] Executed tasks
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 45.028s
[INFO] Finished at: Thu Aug 28 15:36:19 EEST 2014
[INFO] Final Memory: 17M/99M
[INFO] ------------------------------------------------------------------------
```

After Maven has finished and the build was successful, you can find a **ZIP file** at **target/jf-homework1-B12345.zip** *(the name of the zip file contains the homework number and your Student Book Number/matrikli number)*.

This ZIP file contains all the files that we need to check your homework.
The only thing left to do now is to send the ZIP file as an attachment to an e-mail with subject **"Homework 1 - *your Student Book Number/maktrikli number*"** to *jf@zeroturnaround.com*.


Various tips
============

If you still want to build the application without fixing the tests, then you can do that by skipping them in the build by adding -DskipTests to the command:
```shell
./mvnw clean package -DskipTests
```
However, note that this is just for experimenting - to get the full score for this assignment, you still need to make the test(s) pass correctly.

Using Eclipse
-------------

If you are an Eclipse user then you can import the project to your workspace. *File* - *Import* - *Existing Maven Projects*.

To run the project or unit tests in Eclipse you should ..... oh wait! You are already familiar with your IDE and I'm not supposed to explain this!

Using IntelliJ IDEA
-------------------

If you are an IntelliJ IDEA user then you can import the project by selecting *File* - *New* - *Project from Existing Sources...*
and follow the dialog instructions.

To run the project or unit tests in IntelliJ IDEA you should ..... oh wait! You are already familiar with your IDE and I'm not supposed to explain this!