package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.webObjectUsuarios.btnAdd;
import static ui.webObjectUsuarios.btnAdmin;

public class moduloAdminTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Llamamos el actor para que empiece hacer cada clic o acción
        actor.attemptsTo(
                Click.on(btnAdmin)
        );
    }

    //Es el metodo crea un objeto apartir de la clase
    public static moduloAdminTask moduloAdmin() {
        return instrumented(moduloAdminTask.class);
    }
}
