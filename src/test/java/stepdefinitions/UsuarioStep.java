package stepdefinitions;


import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import task.usuarioTask;


import static stepdefinitions.actors.COMMON_ACTOR;
import static ui.webObjectUsuarios.confContraseña;
import static ui.webObjectUsuarios.contraseña;


//Esta clase se utiliza para traducir los pasos del feature en acciones de código
public class UsuarioStep {

    //Se está llamando para que se ejecute el link que se definio en el serenity config
    private static final String Orange = "pages.Orange";

    //Se crea la lista de String que se van a ingresar en usuario y contrasena
    @Y("ingrese al modulo admin y de clic en el botón + Add")
    public void ingresealmoduloadminydeclicenelbotónAdd()throws InterruptedException
    {
        COMMON_ACTOR.attemptsTo(usuarioTask.diligenciarFormulario(nombreEmpleado, nombreUsuario, contraseña, confContraseña));
    }
    @Entonces("se diligencian los campos{String}, {String}´, {String}, {String}")
    public void sediligencianloscampos(String nombreEmpleado, String nombreUsuario, String contraseña, String confContraseña)throws InterruptedException{
        COMMON_ACTOR.attemptsTo(
                usuarioTask.diligenciarFormulario(nombreEmpleado, nombreUsuario, contraseña, confContraseña)
        );
    }
}
