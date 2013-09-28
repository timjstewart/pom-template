# pom-template

A pom file that serves as a good starting place for Maven projects.

# Dependencies

* junit - A Unit Testing Framework developed in part by Kent Beck
* EasyMock - A simple to use Mocking Framework
* hamcrest - A matching library for expressive assertions
* commons-collections - Additional collection classes
* guice - Dependency Injection Framework by Google
* log4j - A logging framework
* commons-lang - Additional utilities for Java's core classes
* guava - Some of Google's Core Libraries

# Plugins

## exec - Runs a particular main method.

See: http://mojo.codehaus.org/exec-maven-plugin/usage.html

     exec:java - runs application in the same JVM as Maven
	 exec:exec - spawns a new process

Run with arguments with: mvn exec:java -Dexec.args="foo bar baz"

## javadoc - Creates Javadoc documentation 

See: http://maven.apache.org/plugins/maven-javadoc-plugin/usage.html

     mvn javadoc:javadoc - creates target/site/apidocs/index.html
     mvn javadoc:fix - adds javadoc comments to source files in place

I tried putting this plugin in the reporting section but it did
not automatically generate my JavaDoc site when I ran mvn site.

## findbugs - Finds bugs in your source code

     findbugs:check
     findbugs:findbugs
     findbugs:gui

See: http://mojo.codehaus.org/findbugs-maven-plugin/usage.html

Note: Java source code must be compiled.  I guess it does
byte-code analysis as opposed to source code analysis.

## cobertura - Code Coverage Tool

    cobertura:cobertura - generates report at target/site/cobertura/index.html

See: http://mojo.codehaus.org/cobertura-maven-plugin/usage.html

## jdepend - Generates a dependency report

    mvn jdepend:generate - creates target/jdepend-report.xml

    mvn site:site - creates target/site/jdepend-report.html

See: http://mojo.codehaus.org/jdepend-maven-plugin/usage.html

## taglist - Scans source code for various tags

    taglist:taglist

See: http://mojo.codehaus.org/taglist-maven-plugin/usage.html

## eclipse - Create eclipse project

     mvn eclipse:eclipse

See: http://maven.apache.org/plugins/maven-eclipse-plugin/plugin-info.html

## source - Creates a jar file with the source code in it

      mvn source:jar

See: http://maven.apache.org/plugins/maven-source-plugin/usage.html
