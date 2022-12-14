package com.exito.pageObjects;

import lombok.Getter;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@Getter
public class AgregarAlCarritoPageObject extends PageObject {
    By btnAgregarCarrito = By.xpath("//*[@class='exito-vtex-components-4-x-buttonText']");
    By btnVerCarrito = By.xpath("//*[@class='exito-header-3-x-minicartLink']");
    By txtValidarProducto = By.xpath("//th[@class='product']");
}
