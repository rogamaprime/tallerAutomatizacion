package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.webObjectUsuarios.*;

public class nuevoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Llamamos el actor para que empiece hacer cada clic o acción
        actor.attemptsTo(
                Click.on(btnAdmin),
                Click.on(btnAdd)
        );
    }
    //Es el metodo crea un objeto apartir de la clase
    public static nuevoTask nuevoUsuario() {
        return instrumented(nuevoTask.class);
    }
}
