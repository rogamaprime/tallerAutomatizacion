package ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class webObjectConsultaUsuarios {
    private webObjectConsultaUsuarios() {
    }

    public static final Target filtroUsuario = Target.the("Usuario")
            .located(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"));

    public static Target btnBuscar = Target.the("btnBuscar")
            .located(By.xpath("//button[normalize-space()='Search']"));

}
