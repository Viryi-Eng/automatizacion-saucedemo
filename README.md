# Automatización de Flujos en SauceDemo con Screenplay

## Descripción

Este proyecto implementa la automatización de pruebas funcionales para la plataforma SauceDemo utilizando el patrón de diseño Screenplay con Serenity BDD, Selenium WebDriver y Cucumber.

Los flujos automatizados permiten validar los procesos críticos de negocio relacionados con el acceso a la aplicación y la compra de productos.

---

## Objetivo

Automatizar los siguientes procesos:

1. Inicio de sesión exitoso.
2. Compra exitosa de un producto.

La solución está diseñada bajo el patrón Screenplay para garantizar escalabilidad, mantenibilidad y reutilización de componentes.

---

## Tecnologías Utilizadas

- Java 17
- Maven
- Serenity BDD
- Selenium WebDriver
- Cucumber
- Gherkin
- JUnit
- Screenplay Pattern

---

## Aplicación Bajo Prueba

**URL:**

https://www.saucedemo.com/

**Credenciales de prueba:**

| Usuario | Contraseña |
|----------|------------|
| standard_user | secret_sauce |

---

## Estructura del Proyecto

```text
src
└── main
    ├── java
    │   ├── questions
    │   ├── tasks 
    │   ├── userinterfaces
    │   ├── stepdefinitions
    │   └── runners
└── test
    ├── java
    │   ├── runners
    │   ├── stepsdefinitions
    └── resources
        ├── features
        │   ├── compra
        │
        └── serenity.conf
```

---

# Flujo 1: Inicio de Sesión

## Descripción

Valida que un usuario registrado pueda autenticarse exitosamente en la plataforma SauceDemo utilizando credenciales válidas.

## Pasos del Flujo

1. Ingresar a SauceDemo.
2. Digitar el usuario.
3. Digitar la contraseña.
4. Presionar el botón Login.
5. Verificar que se visualice la página de productos.

## Resultado Esperado

El usuario debe acceder correctamente al catálogo de productos y visualizar el inventario disponible.

## Escenario Gherkin

```gherkin
Feature: Inicio de Sesión

  Scenario: Login exitoso
    Given que el usuario ingresa a SauceDemo
    When inicia sesión con credenciales válidas
    Then deberá visualizar la página de productos
```

---

# Flujo 2: Compra de Producto

## Descripción

Valida que un usuario autenticado pueda seleccionar un producto, agregarlo al carrito y completar satisfactoriamente el proceso de compra.

## Pasos del Flujo

1. Iniciar sesión en la plataforma.
2. Seleccionar un producto del catálogo.
3. Agregar el producto al carrito.
4. Acceder al carrito de compras.
5. Iniciar el proceso de checkout.
6. Ingresar los datos del comprador.
7. Confirmar la orden.
8. Finalizar la compra.
9. Validar el mensaje de confirmación.

## Resultado Esperado

El sistema debe completar el proceso de compra y mostrar el mensaje de confirmación:

```text
Thank you for your order!
```

## Escenario Gherkin

```gherkin
Feature: Compra de Producto

  Scenario: Compra exitosa
    Given que el usuario ha iniciado sesión en SauceDemo
    When agrega un producto al carrito
    And completa el proceso de checkout
    Then deberá visualizar el mensaje de compra exitosa
```

---

## Casos de Prueba Cubiertos

| ID | Descripción |
|----|-------------|
| CP-001 | Validar inicio de sesión exitoso |
| CP-002 | Validar acceso al inventario después del login |
| CP-003 | Validar adición de producto al carrito |
| CP-004 | Validar proceso de checkout |
| CP-005 | Validar finalización de compra |
| CP-006 | Validar mensaje de confirmación de compra |

---

## Ejecución de las Pruebas

### Ejecutar todos los escenarios

```bash
mvn clean verify
```

### Ejecutar únicamente el flujo de Login

```bash
mvn clean verify -Dcucumber.filter.tags="@Login"
```

### Ejecutar únicamente el flujo de Compra

```bash
mvn clean verify -Dcucumber.filter.tags="@Purchase"
```

---

## Reportes

Los reportes generados por Serenity estarán disponibles en:

```text
target/site/serenity/index.html
```

---

## Buenas Prácticas Implementadas

- Uso del patrón Screenplay.
- Separación de responsabilidades por capas.
- Reutilización de Tasks, Questions e Interactions.
- Centralización de localizadores.
- Escenarios legibles mediante Gherkin.
- Generación automática de evidencias y reportes.

---

## Criterios de Aceptación

✅ El usuario puede iniciar sesión correctamente.

✅ El usuario puede visualizar el inventario de productos.

✅ El usuario puede agregar productos al carrito.

✅ El usuario puede completar el proceso de checkout.

✅ El sistema muestra el mensaje de confirmación:

```text
Thank you for your order!
```

✅ La prueba finaliza exitosamente sin errores.