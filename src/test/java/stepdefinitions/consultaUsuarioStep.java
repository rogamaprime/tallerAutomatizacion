package stepdefinitions;


import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import task.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static stepdefinitions.actors.COMMON_ACTOR;
import static ui.webObjectConsultaUsuarios.UserRol;


//Esta clase se utiliza para traducir los pasos del feature en acciones de código
public class consultaUsuarioStep {

    //Se está llamando para que se ejecute el link que se definio en el serenity config
    private static final String Orange = "pages.Orange";

    //Se crea la lista de String que se van a ingresar en filtro de usuario
    @Cuando("ingresa a modulo admin para usar los filtros de consulta")
    public void ingresaamoduloadminparausarlosfiltrosdeconsulta() throws InterruptedException {
        COMMON_ACTOR.attemptsTo(moduloAdminTask.moduloAdmin());
    }

    @Entonces("filtra por nombre de usuario {string}, y da clic en el botón buscar")
    public void filtrapornombredeusuarioydaclicenelbotónbuscar(String nomUsuario) throws InterruptedException {
        COMMON_ACTOR.attemptsTo(
                consultaFiltroUsuarioTask.consultarusuario(nomUsuario)
        );
    }

    @Entonces("filtra por rol de usuario y da clic en el botón buscar")
    public void filtraporroldeusuarioydaclicenelbotónbuscar() throws InterruptedException {
        COMMON_ACTOR.attemptsTo(
                consultaFiltroRolTask.consultarRol()
        );
    }

    @Entonces("filtra por nombre empleado {string}, y da clic en el botón buscar")
    public void filtrapornombreempleadoydaclicenelbotónbuscar(String NomEmpl) throws InterruptedException {
        COMMON_ACTOR.attemptsTo(
                consultaFiltroEmpleadoTask.consultarEmpleado(NomEmpl)
        );
    }

    @Entonces("filtra por estado de usuario y da clic en el botón buscar")
    public void filtraporestadodeusuarioydaclicenelbotónbuscar() throws InterruptedException {
        COMMON_ACTOR.attemptsTo(
                consultaFiltroEstadoTask.consultarEstado()
        );
    }

    @Y("se debe visualizar el resultado")
    public void sedebevisualizarelresultado() throws InterruptedException {
        COMMON_ACTOR.attemptsTo(
                WaitUntil.the(UserRol, isVisible()).forNoMoreThan(30).seconds(),
                Ensure.that(UserRol).isDisplayed()
        );
    }

    @Cuando("ingresa a modulo admin para usar el filtro de rol usuario")
    public void ingresaamoduloadminparausarelfiltroderolusuario() throws InterruptedException {
        COMMON_ACTOR.attemptsTo(moduloAdminTask.moduloAdmin());
    }
}
