package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.webObjectConsultaUsuarios.*;


public class consultaFiltroUsuarioTask implements Task {

    private final String nomUsuario;

    public consultaFiltroUsuarioTask(String nomUsuario) {

        this.nomUsuario = nomUsuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Llamamos el actor para que empiece hacer cada clic o acción
        actor.attemptsTo(
                WaitUntil.the(filtroUsuario, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(nomUsuario).into(filtroUsuario),
                WaitUntil.the(btnBuscar, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(btnBuscar),
                WaitUntil.the(ResulUsuario, isVisible()).forNoMoreThan(50).seconds(),
                WaitUntil.the(btnReset, isVisible()).forNoMoreThan(50).seconds(),
                Click.on(btnReset)
        );
    }

    //Es el metodo crea un objeto apartir de la clase
    public static consultaFiltroUsuarioTask consultarusuario(String nomUsuario) {
        return instrumented(consultaFiltroUsuarioTask.class, nomUsuario);
    }
}
