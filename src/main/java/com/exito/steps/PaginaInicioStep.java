package com.exito.steps;

import com.exito.pageObjects.PaginaInicioPageObject;
import com.exito.utils.Scroll;
import net.thucydides.core.annotations.Step;

public class PaginaInicioStep {

    PaginaInicioPageObject paginaInicioPageObject = new PaginaInicioPageObject();
    Scroll scroll = new Scroll();

    @Step
    public void abrirNavegador (){
    paginaInicioPageObject.open();
    }

    public void clicMiCuenta (){
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getBtnMiCuenta()).click();

    }

    @Step
    public void clickLoguearse(){
        paginaInicioPageObject.getDriver().findElement(paginaInicioPageObject.getTxtLoguearse()).click();
    }



    @Step
    public void hacerScroll(){
        scroll.scrollElemento(paginaInicioPageObject.getDriver(),paginaInicioPageObject.getTxtTexto());
    }
}
