package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.webObjectUsuarios.*;

public class usuarioTask implements Task {

    private final String nombreEmpleado;
    private final String nombreUsuario;
    private final String contraseña;
    private final String confContraseña;

    public usuarioTask(String nombreEmpleado, String nombreUsuario, String contraseña, String confContraseña) {
        this.nombreEmpleado = nombreEmpleado;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.confContraseña = confContraseña;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Llamamos el actor para que empiece hacer cada clic o acción
        actor.attemptsTo(
                Click.on(btnAdmin),
                Click.on(btnAdd),
                Click.on(drowRolUsuario),
                Enter.theValue(nombreEmpleado).into(nombreEmpleado),
                Click.on(drowEstado),
                Enter.theValue(nombreUsuario).into(nombreUsuario),
                Enter.theValue(contraseña).into(contraseña),
                Enter.theValue(confContraseña).into(confContraseña)

        );
    }
    //Es el metodo crea un objeto apartir de la clase
    public static usuarioTask diligenciarFormulario(String nombreEmpleado, String nombreUsuario, String contraseña, String confContraseña) {
        return instrumented(usuarioTask.class, nombreEmpleado, nombreUsuario, contraseña, confContraseña);
    }
}
