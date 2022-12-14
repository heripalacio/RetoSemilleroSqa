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

    @Dado("^el usuario se encuentre en la pagina web e ingrese al boton cuenta$")
    public void elUsuarioSeEncuentreEnLaPaginaWebEIngreseAlBotonCuenta() {
        paginaInicioStep.abrirNavegador();
        paginaInicioStep.clicMiCuenta();
    }


    @Cuando("^registre sus datos de logueo correctamente$")
    public void registreSusDatosDeLogueoCorrectamente() throws IOException {
        paginaInicioStep.clickLoguearse();
        ingresarCuentaStep.ingresarCorreo();
        ingresarCuentaStep.ingresarClave();

    }

    @Cuando("^ingrese a su perfil$")
    public void ingreseASuPerfil() {
        ingresarCuentaStep.entrar();
        paginaInicioStep.cuentaRegistrada();
        esperaImplicita.esperaImplicita(5);
    }

    @Entonces("^visualizara su perfil de cuenta$")
    public void visualizaraSuPerfilDeCuenta() {
        paginaInicioStep.validarLogueo();

    }
}
