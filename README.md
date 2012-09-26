Java Fundamentals - Project Skeleton
===========

The project is intended for the Java Fundamentals class as a skeleton project. It is a [Maven](http://maven.apache.org/)
project with a dependency on [Apache Commons Lang](http://commons.apache.org/lang/) and produces a single JAR file that can be executed via

```shell
java -jar target/jf2012-executable.jar
```

Getting Started
---------------

Start off by downloading this repository, you download this as a
[ZIP Archive](https://github.com/toomasr/jf-skeleton/zipball/master) for example.

Once you have the archive we will use Maven to build the project.

```shell
cd jf-skeleton
mvn install
java -jar target/jf2012-executable.jar
```

This builds and executes the project. The results are from the dummy source code in the project. We will be using the same
steps to start your application when you email your archive. We will use *mvn install* and then *java -jar*
to start your application.

Working on your assignment
--------------------------

The project has a source folder *src/main/java/ee/ut/jf2012/*. The sample is based on the first homework and
also specifies a subfolder called *hw1*. This should change depending on your assignment.

The project also has a folder for tests. See *test/java/ee/ut/jf2012*. The sample is based on the first homework
and also specifies a folder *hw1*. This should change depending on your assignment.

