# language: es
# enconding: UTF-8

Característica: Comprar Jaket en la pagina web saucedemo
  como usuario de la pagina web saucedemo
  quiero comprar Jaket
  para validar su correcto funcionamiento del ecommerce.

  @Compra_Jacket
  @UserHistory=345677
  Escenario: Flujo completo de compra
    Dado que el usuario ingresa a la pagina web saucedemo
    Cuando el usuario inicia sesion correctamente
    Y selecciona el producto Sauce Labs Fleece Jacket
    Y agrega el producto al carrito
    Y verifica el producto en el carrito
    Y realiza click en el menu principal
    Entonces la compra debe estar añadido correctamente y salir a la pagina principal
