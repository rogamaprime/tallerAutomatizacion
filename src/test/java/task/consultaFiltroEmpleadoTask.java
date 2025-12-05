package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static ui.webObjectConsultaUsuarios.*;



public class consultaFiltroEmpleadoTask implements Task {

    private final String NomEmpl;


    public consultaFiltroEmpleadoTask(String NomEmpl) {

        this.NomEmpl = NomEmpl;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Llamamos el actor para que empiece hacer cada clic o acción
        actor.attemptsTo(

                WaitUntil.the(empleado, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(NomEmpl).into(empleado),
                WaitUntil.the(btnBuscar, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(btnBuscar),
                WaitUntil.the(ResulUsuario, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(btnReset)
        );
    }

    //Es el metodo crea un objeto apartir de la clase
    public static consultaFiltroEmpleadoTask consultarEmpleado(String NomEmpl) {
        return instrumented(consultaFiltroEmpleadoTask.class, NomEmpl);
    }
}
