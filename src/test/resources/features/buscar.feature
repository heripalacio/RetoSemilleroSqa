#language: es

Característica: buscar
  Antecedentes:
    Dado el usuario se encuentre en la pagina web e ingrese al boton cuenta
    Cuando registre sus datos de logueo correctamente
    Y ingrese a su perfil

  Escenario: buscar producto
    Cuando ingrese el nombre del producto en la barra de busqueda
    Y agregue el producto al carrito
    Entonces verificar que los productos hayan sido agregado correctamente





