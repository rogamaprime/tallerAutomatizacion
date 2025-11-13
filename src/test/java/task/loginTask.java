package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.webObject.*;

public class loginTask implements Task {

    private final Map<String,String> data;
    public loginTask(Map<String,String> data) {
        this.data = data;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Llamamos el actor para que empiece hacer cada clic o acción
        actor.attemptsTo(
                Enter.keyValues(data.get("Usuario")).into(Usuario),
                Enter.keyValues(data.get("Contrasena")).into(Contrasena),
                Click.on(btnLogin)
                //Ensure.that(dashboar).isDisplayed()
        );
    }
    //Es el metodo crea un objeto apartir de la clase
    public static loginTask iniciarSesion(Map<String,String> data) {
        return instrumented(loginTask.class, data);
    }
}
