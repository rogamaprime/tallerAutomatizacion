package ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class webObjectConsultaUsuarios {
    private webObjectConsultaUsuarios() {
    }

    public static final Target filtroUsuario = Target.the("Usuario")
            .located(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"));

    public static final Target UserRol = Target.the("Dropdown Rol de Usuario")
            .located(By.xpath("//label[normalize-space()='User Role' or normalize-space()='Rol de usuario']" +
                    "/following::div[contains(@class,'oxd-select-text')][1]"));
    public static final Target RolUser = Target.the("Opción rol Admin")
            .located(By.xpath("//div[@role='listbox']//span[normalize-space()='Admin']"));

    public static Target empleado = Target.the("empleado")
            .located(By.xpath("(//input[@placeholder='Type for hints...'])[1]"));

    public static Target UserStado = Target.the("UserStado")
            .located(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]"));

    public static Target StadoUser = Target.the("UserStado")
            .located(By.xpath("(//div[@class='oxd-select-text-input'][normalize-space()='Enabled'])[1]"));

    public static Target btnBuscar = Target.the("btnBuscar")
            .located(By.xpath("//button[normalize-space()='Search']"));

    public static Target btnReset = Target.the("btnBuscar")
            .located(By.xpath("(//button[normalize-space()='Reset'])[1]"));

    public static Target ResulUsuario = Target.the("ResulUsuario")
            .located(By.xpath("(//div[@role='row'])[2]"));
}
