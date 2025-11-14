package ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class webObject {
    private webObject(){}

    //Se va a declarar la constante y el localizador: Usuario y contrasena
    public static final Target Usuario = Target.the("Usuario")
            .locatedBy("(//input[@placeholder='Username'])[1]");

    public static final Target Contrasena = Target.the("Contrasena")
            .locatedBy("(//input[@placeholder='Password'])[1]");

    public static final Target btnLogin = Target.the("btnLogin")
            .located(By.xpath("(//button[normalize-space()='Login'])[1]"));

    public static final Target barLogin = Target.the("loginExitoso")
            .located(By.xpath("(//div[@class='oxd-topbar-header'])[1]"));

    public static final Target loginerror = Target.the("loginerror")
            .located(By.xpath("(//div[@role='alert'])[1]"));
}
