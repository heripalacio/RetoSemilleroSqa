package com.exito.pageObjects;

import lombok.Getter;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@Getter
public class SeleccionarProductosPageObject extends PageObject {

   By btnAñadirProducto = By.xpath("//body/div[@class='render-container render-route-store-home']/div[@class='render-provider']/div[@class='vtex-store__template bg-base']/div[@class='flex flex-column min-vh-100 w-100']/div/div[@class='flex flex-grow-1 w-100 flex-column']/div/div[1]/div[3]/div[1]/div[1]/div[2]/section[1]/a[1]/article[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[2]/button[1]/div[1]");

}
