package stepdefinitions;


import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import task.consultaUsuariosTask;
import task.moduloAdminTask;


import static stepdefinitions.actors.COMMON_ACTOR;


//Esta clase se utiliza para traducir los pasos del feature en acciones de código
public class consultaUsuarioStep {

    //Se está llamando para que se ejecute el link que se definio en el serenity config
    private static final String Orange = "pages.Orange";

    //Se crea la lista de String que se van a ingresar en usuario y contrasena
    @Cuando("ingresa a modulo admin para usar los filtros de consulta")
    public void ingresaamoduloadminparausarlosfiltrosdeconsulta() throws InterruptedException {
        COMMON_ACTOR.attemptsTo(moduloAdminTask.moduloAdmin());
    }

    @Y("filtra por nombre de usuario {string}")
    public void filtrapornombredeusuario(String Usuario) throws InterruptedException {
        COMMON_ACTOR.attemptsTo(
                consultaUsuariosTask.consultarusuario(Usuario)
        );
    }

    @Entonces("debería ver resultados relacionados con {string}")
    public void deberíaverresultadosrelacionadoscon(String Usuario) throws InterruptedException {
        COMMON_ACTOR.attemptsTo(
                consultaUsuariosTask.consultarusuario(Usuario)
        );
    }
}
