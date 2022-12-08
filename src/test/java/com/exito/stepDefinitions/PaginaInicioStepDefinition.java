package com.exito.stepDefinitions;

import com.exito.steps.*;
import com.exito.utils.EsperaImplicita;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class PaginaInicioStepDefinition {

    @Steps
    PaginaInicioStep paginaInicioStep;
    @Steps
    IngresarCuentaStep ingresarCuentaStep;
    @Steps
    EsperaImplicita esperaImplicita;

    @Dado("^el usuario se encuentre en la pagina web$")
    public void elUsuarioSeEncuentreEnLaPaginaWeb() {
        paginaInicioStep.abrirNavegador();


    }


    @Cuando("^ingrese la boton cuenta$")
    public void ingreseLaBotonCuenta() throws IOException {
        paginaInicioStep.clicMiCuenta();
        paginaInicioStep.clickLoguearse();


    }

    @Entonces("^visualizara las opciones para confirmar identidad$")
    public void visualizaraLasOpcionesParaConfirmarIdentidad() throws IOException {

        ingresarCuentaStep.ingresarCorreo();
        ingresarCuentaStep.ingresarClave();
        ingresarCuentaStep.entrar();
        esperaImplicita.esperaImplicita(5);

    }

}
