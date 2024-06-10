<H2>Bankline API 🚀</H2>

Bem-vindo ao projeto Bankline API! Este projeto tem como objetivo a gestão de correntistas e movimentações de receitas e despesas. A seguir, você encontrará as instruções para configurar e iniciar o projeto.

<H2>Requisitos 📋</H2>

Arquitetura MVC: Implementar a aplicação seguindo o padrão de arquitetura Model-View-Controller.
Spring Framework: Utilizar a plataforma de inversão de controle e injeção de dependência Spring.
Hibernate ORM: Interagir com o banco de dados utilizando o framework ORM Hibernate.
API Rest com Swagger: Disponibilizar a API Rest, devidamente documentada com Swagger.
Deploy no Heroku: Publicar os serviços de forma pública utilizando um container, como o Heroku.

<H2>Configuração Inicial 🌱</H2>

Spring Initializr
Acesse o site: Spring Initializr;
Selecione a opção Maven Project;
Selecione a opção Language - Java;
Preencha os campos conforme abaixo:
Group: Nome do grupo organizacional.
Artifact: Identificação do projeto.
Name: Nome do Projeto (igual ao artifact).
Description: Descrição do Projeto.
Package Name: Nome do pacote raiz da sua aplicação.
Packaging: Tipo de build da sua aplicação, pode manter .jar.
Java: Versão do Java JDK e JRE que está utilizando.
Clique no botão GENERATE para realizar o download do projeto.
Extraia o arquivo .zip e importe na IDE Eclipse.
Nota: Recomendamos que você extraia o bankline-api.zip na pasta c:\estudos, resultando em c:\estudos\bankline-api.

<H2>Importando o Projeto no Eclipse 💻</H2>

Abra o Eclipse.
Vá em File > Import.
Selecione Existing Maven Projects.
Navegue até a pasta onde você extraiu o projeto (c:\estudos\bankline-api).
Clique em Finish.
Configuração do Maven 🛠️
Abaixo está o arquivo pom.xml configurado para o projeto:

```xml
Copiar código
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.3.0</version>
        <relativePath/>
    </parent>
    <groupId>com.santander</groupId>
    <artifactId>bankline-api</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>bankline-api</name>
    <description>API REST BANK LINE API</description>
    <properties>
        <java.version>17</java.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
            <version>2.1.0</version>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>
```

<H2>Começando 🚀</H2>

Certifique-se de que o projeto foi importado corretamente no Eclipse.
Execute a aplicação como um Spring Boot App.
Acesse a documentação da API gerada pelo Swagger em http://localhost:8080/swagger-ui.html.

<H2>Exemplo de Documentação da API 📄</H2>

<div align="center">
    <br>
  <img  alt="Documentação da API" src="https://github.com/IG41/bankline-api/assets/86057048/764db0a5-cf88-400e-a4e7-8102faf44b73" width="1365px" height="670px"/>
</div>
<H2>Exemplo de Movimentação 💸</H2>

<div align="center">
    <br>
  <img alt="Exemplo de Movimentação" src="https://github.com/IG41/bankline-api/assets/86057048/63fec037-f57e-4e93-9190-e53a75e521bf" width="1365px" height="670px"/>
</div>
<H2>Exemplo de Correntistas 👥</H2>

<div align="center">
  <br>
  <img alt="Exemplo de Correntistas" src="https://github.com/IG41/bankline-api/assets/86057048/5da11581-0133-4d26-a086-46b91565110d" width="1365px" height="670px"/>
</div>

<H2>Publicação no Heroku ☁️</H2>

Para publicar a aplicação no Heroku, siga os passos descritos na documentação oficial do Heroku.
