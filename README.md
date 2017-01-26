Java Fundamentals - Homework 1
===========

This project is **Homework 1** for the [Java Fundamentals](https://courses.cs.ttu.ee/pages/ITI8905) course. The goal of this homework is to introduce how
the course homework will be structured and to explain how homework should be submitted for grading.

The homeworks given in this course will generally follow the structure of a [Maven](http://maven.apache.org/) project similar to the one here.

Getting Started
---------------

Start off by downloading this repository by cloning it via Git by running

```shell
git clone https://github.com/JavaFundamentalsZT/jf-hw-intro
```
or by downloading and extracting the [homework zip](https://github.com/svenlaanela/jf-hw-intro/zipball/master).
Once you have the archive you can build and execute the project by calling the following commands on your console:

```shell
cd jf-hw-intro
./mvnw clean package
java -jar target/jf-homework1.jar
```

This builds and executes the project. The current project will print the number 16 (just an example). When we check your
homework we will be using the very same steps! We will use *mvn clean package* to build your project and then
*java -jar target/jf-homework1.jar* to start the application.

Assignment structure
--------------------------

The homework project has a source folder **src/main/java/org/zeroturnaround/jf/**. The homework for the first lecture contains two
classes - a class named *Main* and a class named *Homework* in the subfolder called *homework1*. When you ran the jar file
by calling **java -jar target/jf-homework1.jar** in the previous section, the Main class was executed. Which class in the **jf-homework1.jar** to execute is defined in the *pom.xml* so if you want to use some other class instead then you also
need to update the *pom.xml*.

The project also has a folder for [JUnit](http://junit.org/junit4/) tests at **src/test/java/org/zeroturnaround/jf/**. In the
*homework* folder is a class named *HomeworkTest* which contains two test methods that call and verify if the methods in the *Homework* class function correctly.

Running tests
-------------

When you ran **mvn clean package** in the previous section, the JUnit tests were actually ignored. Usually it is a good idea to also run tests during build and this can be done by adding **-Ptest** to the build command:
```shell
./mvnw clean package -Ptest
```
If all of the unit tests pass, the build should succeed and result
in the target/jf-homework1.jar file being built. If the unit tests do not pass, the build will fail with an error such as:
```shell
Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.12.4:test (default-test) on project homework1: There are test failures.**
```

If you run the tests, then you should see that they currently fail with the following error:
```shell
Results :

Failed tests:   testGetCommonSuffix(org.zeroturnaround.jf.homework1.HomeworkTest): expected:<[JavaFundamentals]> but was:<[fix me!]>

Tests run: 2, Failures: 1, Errors: 0, Skipped: 0
```
The **HomeworkTest.testGetCommonSuffix()** method that failed the test calls **HomeworkTest.getCommonSuffix(String first, String second)**
but if you look at that method, you can see that it does not really do anything - it always returns "fix me!".

Homework assignment
-------------------

The first assignment of this course is to modify the **getCommonSuffix(String first, String second)** method in the **Homework** class to do what it is supposed to do - find a common suffix for two strings. They way it should work is also written in the javadoc comments for the method.
Once you have fixed the implementation and it does what it is supposed to, the test should start passing when you run it again.

You may also want to experiment with adding more tests to the **HomeworkTest** class for other string pairs to
verify your implementation works correctly for different kinds of inputs.

NB! Please note that just returning **"JavaFundamentals"** from the **getCommonSuffix** method - while arguably very clever - will not be accepted as a correct solution. :)

Submitting your assignment
--------------------------

To submit your assignment, first run the following command in the homework root folder:

```
mvn clean deploy -Ptest
```

It will ask you for your **full name**, **Student Book Number** (also known as *matrikli number*) and a **comment** *(optional)*.

Example:

```bash
mvn clean deploy -Ptest

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

After Maven has finished and the build was successful, you can find a **ZIP file** at **target/jf-homework1-B12345.zip** (the name of the zip file contains the homework number and your Student Book Number/matrikli number).

This ZIP file contains all the files that we need to check your homework.
The only thing left to do now is to send the ZIP file as an attachment to an e-mail with subject **"Homework 1 - *your Student Book Number/maktrikli number"*** to *jf@zeroturnaround.com*.


Various tips
============

Using Eclipse
-------------

If you are an Eclipse user then you can import the project to your workspace. *File* - *Import* - *Existing Maven Projects*.

To run the project or unit tests in Eclipse you should ..... oh wait! You are already familiar with your IDE and I'm not supposed to explain this!

Using IntelliJ IDEA
-------------------

If you are an IntelliJ IDEA user then you can import the project by selecting *File* - *New* - *Project from Existing Sources...*
and follow the dialog instructions.

To run the project or unit tests in IntelliJ IDEA you should ..... oh wait! You are already familiar with your IDE and I'm not supposed to explain this!