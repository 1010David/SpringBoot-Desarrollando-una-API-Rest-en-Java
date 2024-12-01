📚 API Rest para Gestión de Médicos y Pacientes
Este proyecto es una API Restful desarrollada con Spring Boot que permite gestionar médicos y pacientes, implementando las operaciones básicas de creación, lectura, actualización y eliminación (CRUD). Es una práctica para aprender conceptos clave de desarrollo backend con Spring Boot, JPA, validaciones y más.

🚀 Características
Creación de un proyecto Spring Boot desde Spring Initializr.
Controladores Rest con las anotaciones @RestController, @RequestMapping, @PostMapping, @GetMapping, @PutMapping, y @DeleteMapping.
Gestión de datos utilizando DTOs (Data Transfer Objects).
Persistencia de datos con JPA y bases de datos relacionales.
Migraciones automáticas con Flyway.
Validaciones con Bean Validation (@NotBlank, @RequestBody).
Paginación y ordenamiento de datos usando la interfaz Pageable.
Exclusión lógica de registros.

📋 Funcionalidades
1. Crear una API básica con Spring Boot
Crear un proyecto en Spring Initializr.
Importar y ejecutar el proyecto en IntelliJ.
Implementar controladores con @RestController y @RequestMapping.
Probar las URL desde el navegador.
2. Manejo de solicitudes POST
Enviar solicitudes POST en formato JSON usando Insomnia.
Recibir datos en la API con @RequestBody.
Representar datos con DTOs utilizando Java Records.
3. Persistencia de datos
Agregar dependencias de JPA y H2.
Crear entidades y repositorios.
Implementar migraciones con Flyway.
4. Validaciones
Usar Bean Validation para validar datos de entrada, como:
@NotBlank: Validar campos no vacíos.
5. Paginación y ordenamiento
Implementar consultas con paginación usando la interfaz Pageable.
Controlar la paginación con parámetros como page, size y sort.
6. Actualización y eliminación
Mapear solicitudes PUT con @PutMapping.
Mapear solicitudes DELETE con @DeleteMapping.
Usar @PathVariable para parámetros dinámicos.
Implementar exclusión lógica con un atributo booleano.
🛠️ Tecnologías Utilizadas
Java 17
Spring Boot 3.x
JPA/Hibernate
H2 Database
Flyway
Bean Validation
Insomnia (para pruebas)
