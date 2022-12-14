package com.exito.steps;

import com.exito.pageObjects.BuscarProductoPageObject;
import com.exito.utils.DatosExcel;
import com.exito.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class BuscarProductoStep {

    BuscarProductoPageObject buscarProductoPageObject = new BuscarProductoPageObject();
    DatosExcel datosExcel = new DatosExcel();
    @Step
    public void escribirProducto() throws IOException {
        buscarProductoPageObject.getDriver().findElement(buscarProductoPageObject.getTxtBuscar()).sendKeys(datosExcel.leerDatosExcel("RetoDatos.xlsx","DatosBalones",1,0));
    }
    @Step
    public void botonBuscar(){
        buscarProductoPageObject.getDriver().findElement(buscarProductoPageObject.getBtnBuscar()).click();
    }
}
