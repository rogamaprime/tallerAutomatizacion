package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.webObjectUsuarios.*;


public class formularioTask implements Task {

    private final String Empleado;
    private final String Usuario;
    private final String Clave;
    private final String ConfClave;

    public formularioTask(String Empleado, String Usuario, String Clave, String ConfClave) {
        this.Empleado = Empleado;
        this.Usuario = Usuario;
        this.Clave = Clave;
        this.ConfClave = ConfClave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Llamamos el actor para que empiece hacer cada clic o acción
        actor.attemptsTo(
                WaitUntil.the(drowRolUsuario, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(drowRolUsuario),
                WaitUntil.the(drowRolAdmin, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(drowRolAdmin),
                Enter.theValue(Empleado).into(nombre_Empleado),
                WaitUntil.the(empleado_Opcion.of("Joseph  Evans"), isVisible()).forNoMoreThan(10).seconds(),
                Click.on(empleado_Opcion.of("Joseph  Evans")),
                WaitUntil.the(drowEstado, isVisible()).forNoMoreThan(60).seconds(),
                Click.on(drowEstado),
                WaitUntil.the(drowEnable, isVisible()).forNoMoreThan(60).seconds(),
                Click.on(drowEnable),
                Enter.theValue(Usuario).into(nombre_Usuario),
                Enter.theValue(Clave).into(contraseña),
                Enter.theValue(ConfClave).into(conf_Contraseña),
                Click.on(btnAhorrar),
                WaitUntil.the(registroUsuario, isVisible()).forNoMoreThan(60).seconds()
        );
    }

    //Es el metodo crea un objeto apartir de la clase
    public static formularioTask diligenciarFormulario(String Empleado, String Usuario, String Clave, String ConfClave) {
        return instrumented(formularioTask.class, Empleado, Usuario, Clave, ConfClave);
    }
}
