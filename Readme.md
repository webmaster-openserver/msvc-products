# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.openserver.springcloud.msvc.products.msvc-products' is invalid and this project uses 'com.openserver.springcloud.msvc.products.msvc_products' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.10/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.10/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.10/reference/htmlsingle/index.html#web)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.2.10/reference/htmlsingle/index.html#using.devtools)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.2.10/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Cloud Bootstrap](https://docs.spring.io/spring-cloud-commons/docs/current/reference/html/)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

-------------------------------------------------------------------------------------------------------------------------------------
### Configuration VS Code
```json
{
    "configurations": [
        {
            "type": "java",
            "name": "Spring Boot-MsvcProductsApplication<msvc-products> 8001",
            "request": "launch",
            "cwd": "${workspaceFolder}",
            "mainClass": "com.openserver.springcloud.msvc.products.MsvcProductsApplication",
            "projectName": "msvc-products",
            "args": "",
            "envFile": "${workspaceFolder}/.env"
        },
        {
            "type": "java",
            "name": "Spring Boot-MsvcProductsApplication<msvc-products> 9001",
            "request": "launch",
            "cwd": "${workspaceFolder}",
            "mainClass": "com.openserver.springcloud.msvc.products.MsvcProductsApplication",
            "projectName": "msvc-products",
            "args": "",
            "envFile": "${workspaceFolder}/.env",
            "vmArgs": "-Dserver.port=9001"
        }
    ]
}
    