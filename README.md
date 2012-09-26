Java Fundamentals - Project Skeleton
===========

The project is intended for the Java Fundamentals class as a skeleton project. It is a [Maven](http://maven.apache.org/)
project with a dependency on [Apache Commons Lang](http://commons.apache.org/lang/) and it produces a single
JAR file that can be executed via

```shell
java -jar target/jf2012-executable.jar
```

Getting Started
---------------

Start off by downloading this repository ([quick ZIP archive link](https://github.com/toomasr/jf-skeleton/zipball/master)).

Once you have the archive we will use Maven to build the project.

```shell
cd jf-skeleton
mvn install
java -jar target/jf2012-executable.jar
```

This builds and executes the project. The results are from the dummy source code in the project. We will be using the same
steps to start your application when you email your archive. We will use *mvn install* and then *java -jar*
to start your application.

Assignment structure
--------------------------

The project has a source folder *src/main/java/ee/ut/jf2012/*. The sample is based on the first homework and
also specifies a subfolder called *hw1*. This should change depending on your assignment.

The project also has a folder for tests. See *test/java/ee/ut/jf2012*. The sample is based on the first homework
and also specifies a folder *hw1*. This should change depending on your assignment.

Using Eclipse
-------------

If you are an Eclipse user then you can import the project to your workspace. The project comes with the *.project*
and *.classpath* files and is easy to import. *File* - *Import* - *Existing Maven Projects*.

To run the project in Eclipse you should ..... oh wait! You are already familiar with your IDE and I'm not
supposed to explain this!

Using the commandline
---------------------

Once you have downloaded the project and you want to run the main class you can do the following

```shell
cd jf-skeleton
mvn install
java -jar target/jf2012-executable.jar
```

Now you can edit your homework and rerun the sample. The *pom.xml* instructs the *jf2012-executable.jar* to execute
the *ee.ut.jf2012.Main* class by default. If you want to use some other class then you also need to update the *pom.xml*.

Submitting your assignment
--------------------------

We are interested in your homework as *ZIP* archive (we are not fond of RAR, gzip, TAR etc.). We are not interested
in the binary artifacts either. So the easiest is to run the following command in your project folder:

```
mvn clean
```

and then ZIP the project folder and send it our way. Please include the toplevel folder for easier unpacking!

Let me bring an example if you happen to be friendly with your shell

```bash
cd jf-skeleton
mvn clean
zip -r ../jf-skeleton.zip *
```
and now you send jf-skeleton.zip to *jf@zeroturnaround.com*.