package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.webObjectConsultaUsuarios.*;
import static ui.webObjectConsultaUsuarios.UserRol;


public class consultaFiltroRolTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Llamamos el actor para que empiece hacer cada clic o acción
        actor.attemptsTo(
                WaitUntil.the(UserRol, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(UserRol),
                WaitUntil.the(RolUser, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(RolUser),
                WaitUntil.the(btnBuscar, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(btnBuscar),
                WaitUntil.the(ResulUsuario, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(btnReset)
        );
    }

    //Es el metodo crea un objeto apartir de la clase
    public static consultaFiltroRolTask consultarRol() {
        return instrumented(consultaFiltroRolTask.class);
    }
}
