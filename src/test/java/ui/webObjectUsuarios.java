package ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class webObjectUsuarios {
    private webObjectUsuarios(){}

    public static Target btnAdmin = Target.the("Botón Admin")
            .located(By.xpath("//span[text()='Admin']"));

    public static final Target btnAdd = Target.the("btnAdd")
            .located(By.xpath("//button[normalize-space()='Add']"));

    public static final Target drowRolUsuario  = Target.the("Dropdown Rol de Usuario")
            .located(By.xpath("//label[normalize-space()='User Role' or normalize-space()='Rol de usuario']" +
                    "/following::div[contains(@class,'oxd-select-text')][1]"));
    public static final Target drowRolAdmin = Target.the("Opción rol Admin")
            .located(By.xpath("//div[@role='listbox']//span[normalize-space()='Admin']"));

    public static final Target nombre_Empleado = Target.the("Campo Nombre de empleado")
            .located(By.xpath("//label[normalize-space()='Employee Name' or normalize-space()='Nombre de empleado']" +
                    "/following::input[1]"));
    public static Target empleado_Opcion = Target.the("opción del empleado")
            .locatedBy("//div[contains(@class,'oxd-autocomplete-option') and contains(.,'{0}')]");

    public static final Target drowEstado = Target.the("Dropdown Estado")
            .located(By.xpath(
                    "//*[normalize-space(.)='Status' or normalize-space(.)='Estado']" +
                            "/ancestor::*[contains(@class,'oxd-input-group')][1]" +
                            "//div[contains(@class,'oxd-select-text')]"
            ));

    public static final Target drowEnable = Target.the("Opción Estado Enabled/Activado")
            .located(By.xpath("//div[@role='listbox']//span[normalize-space()='Enabled' or normalize-space()='Activado']"));

    //public static final Target OPT_ESTADO_DISABLED = Target.the("Opción Estado Disabled/Desactivado")
            //.located(By.xpath("//div[@role='listbox']//span[normalize-space()='Disabled' or normalize-space()='Desactivado']"));

    public static final Target nombre_Usuario = Target.the("nombreUsuario")
            .located(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));

    public static final Target contraseña = Target.the("contraseña")
            .located(By.xpath("(//input[@type='password'])[1]"));

    public static final Target conf_Contraseña = Target.the("confContraseña")
            .located(By.xpath("(//input[@type='password'])[2]"));

    public static Target btnAhorrar = Target.the("Botón ahorrar")
            .located(By.xpath("//button[normalize-space()='Save']"));

}
