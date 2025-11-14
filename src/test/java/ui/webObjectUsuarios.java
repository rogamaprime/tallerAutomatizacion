package ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class webObjectUsuarios {
    private webObjectUsuarios(){}

    public static Target btnAdmin = Target.the("Botón Admin")
            .located(By.xpath("//span[text()='Admin']"));

    public static final Target btnAdd = Target.the("btnAdd")
            .located(By.xpath("//button[normalize-space()='Add']"));

    public static final Target drowRolUsuario = Target.the("drowRolUsuario")
            .located(By.xpath("(//font[@dir='auto'][normalize-space()='Administración'])[6]"));

    public static final Target nombreEmpleado = Target.the("nombreEmpleado")
            .located(By.xpath("(//input[@placeholder='Escribe para obtener pistas...'])[1]"));

    public static final Target drowEstado = Target.the("drowRolUsuario")
            .located(By.xpath("(//font[contains(text(),'Activado')])[1]"));

    public static final Target nombreUsuario = Target.the("nombreUsuario")
            .located(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));

    public static final Target contraseña = Target.the("contraseña")
            .located(By.xpath("(//input[@type='password'])[1]"));

    public static final Target confContraseña = Target.the("confContraseña")
            .located(By.xpath("(//input[@type='password'])[2]"));

    public static Target btnAhorrar = Target.the("Botón ahorrar")
            .located(By.xpath("(//button[@type='submit'])[1]"));

}
