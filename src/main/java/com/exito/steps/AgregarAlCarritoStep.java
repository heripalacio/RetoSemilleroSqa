package com.exito.steps;

import com.exito.pageObjects.AgregarAlCarritoPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class AgregarAlCarritoStep {
    AgregarAlCarritoPageObject agregarAlCarritoPageObject = new AgregarAlCarritoPageObject();

    @Step
    public void agregarCarrito(){
        agregarAlCarritoPageObject.getDriver().findElement(agregarAlCarritoPageObject.getBtnAgregarCarrito()).click();
     }
    @Step
    public void verCarrito(){
        agregarAlCarritoPageObject.getDriver().findElement(agregarAlCarritoPageObject.getBtnVerCarrito()).click();
    }
    @Step
    public void validarProductoAgregado(){
        Assert.assertThat(agregarAlCarritoPageObject.getDriver().findElement(agregarAlCarritoPageObject.getTxtValidarProducto()).isDisplayed(), Matchers.is(true));
    }
}
