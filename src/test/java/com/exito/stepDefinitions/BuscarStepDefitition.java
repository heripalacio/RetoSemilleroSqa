package com.exito.stepDefinitions;


import com.exito.steps.AgregarAlCarritoStep;
import com.exito.steps.BuscarProductoStep;
import com.exito.utils.EsperaImplicita;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class BuscarStepDefitition {

    @Steps
    BuscarProductoStep buscarProductoStep;
    @Steps
    AgregarAlCarritoStep agregarAlCarritoStep;
    @Steps
    EsperaImplicita esperaImplicita;


    //Escenario consultar por barra de busqueda
    @Cuando("^ingrese el nombre del producto en la barra de busqueda$")
    public void ingreseElNombreDelProductoEnLaBarraDeBusqueda() throws IOException {
        buscarProductoStep.escribirProducto();
    }


    @Cuando("^presione el boton buscar$")
    public void presioneElBotonBuscar() {
        buscarProductoStep.botonBuscar();

    }

    @Entonces("^podra agregar el producto al carrito$")
    public void podraAgregarElProductoAlCarrito() {
        agregarAlCarritoStep.agregarCarrito();
        esperaImplicita.esperaImplicita(5);
        agregarAlCarritoStep.verCarrito();
        esperaImplicita.esperaImplicita(5);
    }

    @Entonces("^verificar que los productos hayan sido agregado correctamente$")
    public void verificarQueLosProductosHayanSidoAgregadoCorrectamente() {
        agregarAlCarritoStep.validarProductoAgregado();
    }

}
