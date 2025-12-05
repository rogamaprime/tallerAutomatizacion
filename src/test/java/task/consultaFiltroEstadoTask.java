package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.webObjectConsultaUsuarios.*;


public class consultaFiltroEstadoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Llamamos el actor para que empiece hacer cada clic o acción
        actor.attemptsTo(

                WaitUntil.the(UserStado, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(UserStado),
                WaitUntil.the(StadoUser, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(StadoUser),
                WaitUntil.the(btnBuscar, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(btnBuscar),
                WaitUntil.the(ResulUsuario, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(btnReset)
        );
    }

    //Es el metodo crea un objeto apartir de la clase
    public static consultaFiltroEstadoTask consultarEstado() {
        return instrumented(consultaFiltroEstadoTask.class);
    }
}
