package com.exito.steps;

import com.exito.pageObjects.IngresarCuentaPageObject;
import com.exito.utils.DatosExcel;
import com.exito.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class IngresarCuentaStep {
    IngresarCuentaPageObject ingresarCuentaPageObject = new IngresarCuentaPageObject();
    DatosExcel datosExcel = new DatosExcel();
    EsperaImplicita esperaImplicita = new EsperaImplicita();

    @Step
    public void ingresarCorreo() throws IOException {
        ingresarCuentaPageObject.getDriver().findElement(ingresarCuentaPageObject.getTxtCorreo()).sendKeys(datosExcel.leerDatosExcel("RetoDatos.xlsx","DatosLogueo",1,0));

    }
    @Step
    public void ingresarClave() throws IOException {
      ingresarCuentaPageObject.getDriver().findElement(ingresarCuentaPageObject.getTxtContraseña()).sendKeys(datosExcel.leerDatosExcel("RetoDatos.xlsx","DatosLogueo",1,1));
        esperaImplicita.esperaImplicita(2);
    }
    @Step
    public void entrar(){
        ingresarCuentaPageObject.getDriver().findElement(ingresarCuentaPageObject.getBtnEntrar()).click();

    }

}
