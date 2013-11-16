About
=====

This repository contains a template project using the Spring Framework, configured
to provide:

* Maven POM
* Spring Boot for embedded Tomcat, JPA, Security
* Spring Data
* JPA + Hibernate and embedded H2SQL
* Spring Web MVC
* Spring Security
* Thymeleaf Template Engine
* A sensible .gitignore file as starting point

Getting Started
===============

1. On the shell:

```bash
git clone https://github.com/martinmo/spring-template.git
cd spring-template
mvn -U clean install
mvn spring-boot:run
# (Press Ctrl-C to stop the embedded Tomcat)
```

2. Browse and enjoy http://localhost:8080/

Credits and License
===================

The project layout is heavily inspired by the Spring Boot sample projects. This
work is licensed under the Apache License version 2 (see LICENSE.txt).
