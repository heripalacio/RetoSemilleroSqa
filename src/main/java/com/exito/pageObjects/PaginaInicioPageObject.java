package com.exito.pageObjects;

import lombok.Getter;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

//Agregar url y extender de PageObjetcs

@DefaultUrl("https://www.exito.com")

@Getter
public class PaginaInicioPageObject extends PageObject {

    By btnMiCuenta = By.xpath("//*[@class='vtex-menu-2-x-styledLinkIcon vtex-menu-2-x-styledLinkIcon--header-link mh2']");
    By txtLoguearse = By.xpath("//*[@class='vtex-login-2-x-button vtex-login-2-x-emailPasswordOptionBtn']");
    By txtTexto = By.xpath("//*[@class='exito-home-components-1-x-carouselTitleTextGrid fw6 c-black t-heading-5']");

}
