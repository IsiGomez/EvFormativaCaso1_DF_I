# 📝 Sistema de Gestión de Tareas Pendientes (API REST)

Este proyecto es una API REST desarrollada con **Spring Boot** para la gestión de tareas diarias. Permite realizar operaciones CRUD básicas (Crear, Listar, Eliminar) y manejar el estado de las mismas, siguiendo los estándares de la arquitectura CSR.

## 🚀 Requisitos del Caso
* **Contexto:** Servicio para gestionar tareas diarias de un equipo de trabajo.
* **Funcionalidades:** Crear, listar, marcar como completada y eliminar tareas.
* **Validaciones:** Uso de anotaciones `@NotBlank` y `@NotNull`.
* **Respuestas:** Manejo de errores y estados HTTP mediante `ResponseEntity`.

## 🛠️ Tecnologías Utilizadas
* **Lenguaje:** Java 25
* **Framework:** Spring Boot
* **Herramientas:** IntelliJ IDEA, Maven, Postman.

## 📡 Endpoints de la API

| Método | Endpoint | Descripción |
| :--- | :--- | :--- |
| **GET** | `/api/v1/tareas` | Obtiene la lista completa de tareas. 
| **POST** | `/api/v1/tareas` | Agrega una nueva tarea al sistema. 
| **PATCH** | `/api/v1/tareas/{id}` | Marca una tarea específica como completada. 
| **DELETE** | `/api/v1/tareas/{id}` | Elimina una tarea por su ID. 
