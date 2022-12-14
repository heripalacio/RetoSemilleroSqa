package com.exito.pageObjects;

import lombok.Getter;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@Getter
public class IngresarCuentaPageObject extends PageObject {
    By txtCorreo = By.xpath("//*[@placeholder='Ingresa tu email']");
    By txtContraseña = By.xpath("//input[@placeholder='Ingresa tu contraseña']");
    By btnEntrar = By.xpath("//*[@class='vtex-button bw1 ba fw5 v-mid relative pa0 lh-solid br2 min-h-small t-action--small bg-action-primary b--action-primary c-on-action-primary hover-bg-action-primary hover-b--action-primary hover-c-on-action-primary pointer ']");
}
