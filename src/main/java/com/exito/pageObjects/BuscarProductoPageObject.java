package com.exito.pageObjects;

import lombok.Getter;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@Getter
public class BuscarProductoPageObject extends PageObject {
    By txtBuscar = By.xpath("//*[@placeholder='Buscar en exito.com']");
    By btnBuscar = By.xpath("//*[@class=' vtex-store-components-3-x-searchBarIcon vtex-store-components-3-x-searchBarIcon--search flex items-center pointer bn bg-transparent outline-0 pv0 pl0 pr3']");

}
