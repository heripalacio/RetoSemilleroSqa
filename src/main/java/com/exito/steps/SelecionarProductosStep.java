package com.exito.steps;

import com.exito.pageObjects.SeleccionarProductosPageObject;
import com.exito.utils.Scroll;
import net.thucydides.core.annotations.Step;

public class SelecionarProductosStep {

    SeleccionarProductosPageObject selecionarProductosPageObject = new SeleccionarProductosPageObject();


    @Step
    public void selecionarPrimerProducto(){

        selecionarProductosPageObject.getDriver().findElement(selecionarProductosPageObject.getBtnAñadirProducto()).click();

    }


}
