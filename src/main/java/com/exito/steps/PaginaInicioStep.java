package com.exito.steps;

import com.exito.pageObjects.PaginaInicioPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class PaginaInicioStep {

    PaginaInicioPageObject paginaInicioPageObject = new PaginaInicioPageObject();

    @Step
    public void abrirNavegador() {
        paginaInicioPageObject.open();
    }

    @Step
    public void clicMiCuenta() {
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getBtnMiCuenta()).click();

    }

    @Step
    public void clickLoguearse() {
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getTxtLoguearse()).click();
    }
    @Step
    public void cuentaRegistrada() {
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getBtnCuenta()).click();
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getBtnCuentaRegistrada()).click();
    }
    @Step
    public void validarLogueo() {
        Assert.assertThat(paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getTxtMensajeValidacion()).isDisplayed(), Matchers.is(true));
    }
}
