About
-----

This repository contains a project template for web apps using the Spring
Framework. It provides:

* Maven POM
* Spring Boot for embedded Tomcat, JPA, Security
* Spring Data
* JPA + Hibernate and embedded H2SQL
* Spring Web MVC
* Spring Security
* Thymeleaf Template Engine
* A sensible .gitignore file as starting point

Getting Started
---------------

1. On the shell:

        git clone https://github.com/martinmo/spring-template.git
        cd spring-template
        mvn install
        mvn spring-boot:run

   If Maven fails, retry again with the -U switch:

        mvn -U install

2. Browse and enjoy http://localhost:8080/

Importing into Eclipse
----------------------

1. Prerequisite: Eclipse IDE for Java EE Developers

2. Very straightforward: File -> Import... -> Existing Maven Project

3. Import the code formatting rules `eclipse-codeformatter.xml` (Project ->
   Properties -> Java Code Style -> Formatter -> Import...)

4. Import the template settings `eclipse-codetemplates.xml` (Project ->
   Properties -> Java Code Style -> Code Templates -> Import...). Make sure
   the option "Automatically add comments for new methods and types" is
   checked.

Tips
----

* Use consistent code formatting (always tabs) and avoid long lines, this
  makes reading code and diffs much easier. Use the above provided template
  and format settings for Eclipse and configure your favorite editor
  appropriately (e.g., use Vim modelines).
* Never commit generated files (e.g., Java .class files), they will always
  lead to conflicts.
* Use consistent, meaningful commit messages (not "blub", "update" etc).
* *Never* put unrelated changes into one commit.

Credits and License
-------------------

The project layout is heavily inspired by the Spring Boot sample projects. This
work is licensed under the Apache License version 2 (see LICENSE.txt).

