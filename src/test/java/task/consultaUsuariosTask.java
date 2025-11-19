package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.webObjectConsultaUsuarios.btnBuscar;
import static ui.webObjectConsultaUsuarios.filtroUsuario;
import static ui.webObjectUsuarios.*;


public class consultaUsuariosTask implements Task {

    private final String Usuario;
    //private final String Empleado;
    //private final String Clave;
    //private final String ConfClave;

    public consultaUsuariosTask(String Usuario) {

        this.Usuario = Usuario;
        //this.Empleado = Empleado;
        //this.Clave = Clave;
        //this.ConfClave = ConfClave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Llamamos el actor para que empiece hacer cada clic o acción
        actor.attemptsTo(
                /*WaitUntil.the(filtroUsuario, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(filtroUsuario),
                Enter.theValue(Usuario).into(filtroUsuario),
                Click.on(btnBuscar)*/
                WaitUntil.the(filtroUsuario, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue("usuarioPrueba No borrar2").into(filtroUsuario),
                Click.on(btnBuscar)
        );
    }

    //Es el metodo crea un objeto apartir de la clase
    public static consultaUsuariosTask consultarusuario(String Usuario) {
        return instrumented(consultaUsuariosTask.class, Usuario);
    }
}
