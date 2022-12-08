package com.exito.steps;

import com.exito.pageObjects.AgregarAlCarritoPageObject;
import com.exito.utils.EsperaImplicita;

public class AgregarAlCarritoStep {


    AgregarAlCarritoPageObject agregarAlCarritoPageObject = new AgregarAlCarritoPageObject();


    public void agregarCarrito(){
        agregarAlCarritoPageObject.getDriver().findElement(agregarAlCarritoPageObject.getBtnAgregarCarrito()).click();
     }

    public void verCarrito(){
        agregarAlCarritoPageObject.getDriver().findElement(agregarAlCarritoPageObject.getBtnVerCarrito()).click();
    }
}
