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

Credits and License
-------------------

The project layout is heavily inspired by the Spring Boot sample projects. This
work is licensed under the Apache License version 2 (see LICENSE.txt).

