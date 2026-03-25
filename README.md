# 📚 Sistema de Gestión de Productos (API REST)

Este proyecto es una API REST desarrollada con **Spring Boot** diseñada para administrar el inventario de una pequeña librería. Permite realizar operaciones CRUD básicas (Crear, Listar, Eliminar) y manejar el estado de las mismas, siguiendo los estándares de la arquitectura CSR (Controller-Service-Repository).

## 🚀 Requisitos del Caso
* **Contexto:** Servicio de administración de productos para una librería.
* **Funcionalidades:** Agregar nuevos productos, listar el inventario completo y eliminar productos por su nombre.
* **Validaciones:** Uso de anotaciones `@NotBlank` y `@NotNull`.
* **Respuestas:** Manejo de errores y estados HTTP mediante `ResponseEntity`.

## 🛠️ Tecnologías Utilizadas
* **Lenguaje:** Java 25
* **Framework:** Spring Boot
* **Herramientas:** IntelliJ IDEA, Maven, Postman.

## 📡 Endpoints de la API

| Método | Endpoint | Descripción |
| :--- | :--- | :--- |
| **GET** | `/api/v1/productos` | Obtiene la lista de todos los productos en stock. 
| **POST** | `/api/v1/productos` | Registra un nuevo producto (Libro, cuaderno, etc). 
| **DELETE** | `/api/v1/productos/{nombre}` | Elimina un producto específico buscando por su nombre.

## 🧪 Ejemplo de JSON para POST

Para agregar un producto mediante el método **POST**, el cuerpo de la solicitud debe seguir este formato:

```json
{
  "nombre": "Cien años de soledad",
  "precio": 15000,
  "categoria": "Literatura"
}
