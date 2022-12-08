package com.exito.stepDefinitions;

import com.exito.pageObjects.PaginaInicioPageObject;
import com.exito.steps.AgregarAlCarritoStep;
import com.exito.steps.BuscarProductoStep;
import com.exito.utils.EsperaImplicita;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class BuscarStepDefitition {

    @Steps
    BuscarProductoStep buscarProductoStep;
    @Steps
    AgregarAlCarritoStep agregarAlCarritoStep;


    @Cuando("^ingrese el nombre del producto en la barra de busqueda$")
    public void ingreseElNombreDelProductoEnLaBarraDeBusqueda() throws IOException {
        buscarProductoStep.escribirProducto();
    }

    @Cuando("^presione el boton buscar$")
    public void presioneElBotonBuscar() {
        buscarProductoStep.botonBuscar();
        agregarAlCarritoStep.agregarCarrito();

    }

    @Entonces("^mostrara una nueva pagina con el producto consultado$")
    public void mostraraUnaNuevaPaginaConElProductoConsultado() {


        agregarAlCarritoStep.verCarrito();

    }

}
