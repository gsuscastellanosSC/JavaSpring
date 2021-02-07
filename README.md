# Curso de Java Spring
    https://platzi.com/clases/java-spring/
# Class#1
    Bienvenida al curso
# Class#2
    ¿Java sigue siendo gratuito?
# Class#3
    Instalación de ambiente de desarrollo: Linux Ubuntu:
        How install postgres in Docker:
            docker run -d -p 5432:5432 --name some-postgres -e POSTGRES_PASSWORD=mysecretpassword postgres -c shared_buffers=256MB -c max_connections=200
# Class#4
    Instalación de ambiente de desarrollo: macOS
# Class#5
    Instalación de ambiente de desarrollo: Windows
# Class#6
    ¿Qué es y qué usaremos de Spring?
        Spring Framework: Proyecto que permite la creación de aplicaciones modernas.
        Spring Boot: Permite la creación de aplicaciones auto contenidas y autoconfigurables. 
        Spring Data JPA(Csandra, mongo DB): Permite la gestión e integración de BD con las aplicaciones.
        Spring Security: Gestión de la seguridad de toda la seguridad de las aplicaciones.
# Class#7
    Conocer qué es una aplicación autocontenida
        Spring Boot
            * Es el proyecto de Spring para aplicaciones auto contenidas.
            * Permite olvidarnos de la infraestructura y centrarnos en el desarrollo.
            * Puede funcionar con Tomcat(por defecto), Jetty o Undertow.
            * Incluye gestión de dependencias iniciales, configuración automática y más.
# Class#8
    Crear nuestra aplicación con Spring Initializr
# Class#9
    Hola mundo con Spring Boot
# Class#10 
    Configurar Spring Boot
# Class#11
    Crear la estructura del proyecto

    ¿Qué es JPA?
        "Java Persistence API, más conocida por sus siglas JPA, es la API de persistencia desarrollada para la plataforma Java EE. Es un framework del lenguaje de programación Java que maneja datos relacionales en aplicaciones usando la Plataforma Java en sus ediciones Standard y Enterprise."
            * JPA es una especificación de Java(Un estándar) para un framework ORM.
            * Interactua con las tablas de la base de datos en forma de objetos Java.
            * Algunas de sus implementaciones son:
                - Hibernate         - EclipseLink
                - TopLink           - ObjectDB
        Anotaciones de JPA:
            * @Entity(Indica a la clase Java que esta representando un objeto del modelo de datos)
            * @Table(Nombre de la tabla que esta mapeando la clase java)
            * @Column(Anotación que se le pone a los atributos de la clase, aplica solo cuanto el nombre del atributo es diferente al del valor del atributo de la tabla)
            * @Id & @EmbededId(Representan el primary key y primary key compuestas, respectivamente)
            * @GeneratedValue(Permite generar valores automaticos para las primary key)
            * @OneToMany & @ManyToOne(Indica las relaciones de las tablas)
# Class#13
    Conocer qué es Spring Data
        * Es un proyecto que internamente contiene otros, nosotros usaremos el Spring Data JPA
        * Optimización de tareas repetitivas
        * Repositorios sin código con JPARepository, CrudRepository & PagingAndSortingRepository
        * Auditorías transparentes
# Class#14
    Conectar la base de datos a nuestra aplicación
# Class#15
    Mapear las tablas como clases
# Class#16    
    Crear Entity cuando su clave primaria es compuesta
# Links:
    Conectar la base de datos a nuestra aplicación:
        https://drive.google.com/file/d/1MhNMwcxSvRYNfA8H3NjOtixSPM6Ovwaa/view
    schema.sql - Google Drive:
        https://drive.google.com/file/d/1DZTGB-BC3LqoZLN_UK8uyt4_eZP-MfBl/view
    mvnrepository:
        https://mvnrepository.com/
    Common Application properties:
        https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html
    Spring Initializr:
        https://start.spring.io/
    Spring:
        https://spring.io/projects
    Download posman:
        postman.com/downloads
    How install postgres in Docker:
        https://www.arteco-consulting.com/instalar-postgresql-con-docker/