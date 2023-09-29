##To configure swagger in spring-boot application;

### Add following entry to pom.xml
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-boot-starter</artifactId>
    <version>3.0.0</version>
</dependency>

## Add following code in SpringBootDockerAppApplication
@EnableSwagger2

## Bean created to support swagger
@Bean
public Docket productApi() {
return new Docket(DocumentationType.SWAGGER_2).select()
.apis(RequestHandlerSelectors.basePackage("com.tutorialspoint.swaggerdemo")).build();
}

## command to view swagger
http://localhost:9090/swagger-ui.html

