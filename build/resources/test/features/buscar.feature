#language: es

Característica: buscar
  Antecedentes:
    Dado el usuario se encuentre en la pagina web e ingrese al boton cuenta
    Cuando registre sus datos de logueo correctamente
    Y ingrese a su perfil

  Escenario: buscar producto
    Cuando ingrese el nombre del producto en la barra de busqueda
    Y presione el boton buscar
    Entonces podra agregar el producto al carrito
    Y verificar que los productos hayan sido agregado correctamente


