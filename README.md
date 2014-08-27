Java Fundamentals - Project Skeleton
===========

The project is intended for the Java Fundamentals class as a skeleton project. It is a [Maven](http://maven.apache.org/)
project with a dependency on [Apache Commons Lang](http://commons.apache.org/lang/) and it produces a single
JAR file that can be executed via

```shell
java -jar target/jf2014-executable.jar
```

Getting Started
---------------

Start off by downloading this repository ([quick ZIP archive link](https://github.com/toomasr/jf-skeleton/zipball/master)). 
Once you have the archive we will use Maven to build the project.

```shell
cd jf-skeleton
mvn install
java -jar target/jf2014-executable.jar
```

This builds and executes the project. The current project will print the number 16 (just an example). When we check your
homework we will be using the very same steps! We will use *mvn install* to build your project and then *java -jar*
to start your application.

Assignment structure
--------------------------

The project has a source folder *src/main/java/ee/ut/jf2014/*. The sample is based on the first homework and
also specifies a subfolder called *hw1*. You should change this depending on your assignment.

The project also has a folder for tests. See *test/java/ee/ut/jf2014*. The sample is based on the first homework
and also specifies a folder *hw1*. You should change this depending on your assignment.

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
java -jar target/jf2014-executable.jar
```

Now you can edit your homework and rerun the sample. The *pom.xml* instructs the *jf2014-executable.jar* to execute
the *ee.ut.jf2014.Main* class by default. If you want to use some other class then you also need to update the *pom.xml*.

Submitting your assignment automatically
--------------------------

We have set up the Maven project to submit the homework for you, automatically. It will ZIP up all files in your project
folder and will send an e-mail to *jf@zeroturnaround.com* with the ZIP file as attachment. For sending, it will use
GMail (everyone has @gmail address, right?).

It is really simple, just run the following command in your project folder:

```
mvn clean deploy
```

It will ask you for your full GMail username (e.g. yourhandle@gmail.com), password and homework topic.

Example:

```bash
mvn clean deploy

#...skipping building and testing output from Maven...

[INFO] --- maven-assembly-plugin:2.4.1:single (make a zip) @ jf2014-hwX ---
[INFO] Reading assembly descriptor: build-zip.xml
[INFO] Building zip: /Users/neeme/Workspaces/ZT/jf-skeleton/target/jf-skeleton-project.zip
[INFO]
[INFO] --- maven-antrun-plugin:1.7:run (get mail username and password) @ jf2014-hwX ---
[INFO] Executing tasks

main:
Enter your e-mail address (e.g. yourhandle@gmail.com):
nemecec@gmail.com
Enter your e-mail account password:
Homework topic:
IO
[INFO] Executed tasks
[INFO]
[INFO] --- maven-postman-plugin:0.1.6:send-mail (send a mail via gmail) @ jf2014-hwX ---
[INFO] add attachment /Users/neeme/Workspaces/ZT/jf-skeleton/target/jf-skeleton-project.zip
[INFO] configure SSL connection for mail
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 35.055s
[INFO] Finished at: Wed Aug 27 17:12:51 EEST 2014
[INFO] Final Memory: 27M/120M
[INFO] ------------------------------------------------------------------------
```

*Note:* Your GMail account and password are only used for sending the e-mail via Google SMTP server
and not stored anywhere. Paranoid people can check out the source code of the Maven plugin here:
https://code.google.com/p/fortysix/

Submitting your assignment manually
--------------------------

In case you do not like the automated option outlined above, you can also submit your homework manually.
As we are still interested in your homework as *ZIP* archive, you will need to execute the following command
in your project folder:

```
mvn clean package
```

Maven will build the ZIP file for you -- you can find the generated ZIP file in *target* folder with name 
*jf-skeleton-project.zip*. Attach it to an e-mail and send it our way, to *jf@zeroturnaround.com*.
