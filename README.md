# Microservicio Articulos

Este microservicio se encarga de gestionar las operaciones relacionadas con los articulos, como creación, actualización, eliminación. A continuación se describen los endpoints disponibles y cómo utilizarlos.

## Endpoints

### 1. Crear Articulo

**Descripción:** Este endpoint permite crear un nuevo articulo.

- **URL:** `/api/articulos/crear`
- **Método HTTP:** `POST`
- **Cuerpo de la solicitud:** `CrearArticuloDTO`
- **Ejemplo solicitud POSTMAN:**
  ```json
  {
    "nombre": "paco",
    "correo_electronico": "paco@example.com",
    "direccion": "Direccion 1",
    "contrasena": "p1"
  }
