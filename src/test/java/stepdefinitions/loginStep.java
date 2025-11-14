package stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.gl.Dado;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import task.loginTask;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static stepdefinitions.actors.COMMON_ACTOR;
import static ui.webObject.barLogin;
import static ui.webObject.loginerror;

//Esta clase se utiliza para traducir los pasos del feature en acciones de código
public class loginStep {

    //Se está llamando para que se ejecute el link que se definio en el serenity config
    private static final String Orange = "pages.Orange";


    @Dado("que el usuario ingrese a la pagina de orange")
    //primer escenario
    public void queelusuarioingresealapaginadeorange(){
        COMMON_ACTOR.attemptsTo(
                //Este es el robot que va a realizar una acción
                Open.browserOn().thePageNamed(Orange)
        );
    }
    //Se crea la lista de String que se van a ingresar en usuario y contrasena
    @Cuando("ingrese las credenciales con los datos correctos")
    public void ingreselascredencialesconlosdatoscorrectos(List<Map<String, String>> dataMapList)
    {
        Map<String, String> parameters = dataMapList.get(0);
        COMMON_ACTOR.attemptsTo(loginTask.iniciarSesion(parameters));
    }
    @Entonces("Se visualizara el nombre del usuario con la foto")
    public void seVisualizaraElNombreDelUsuarioConLaFoto() {
        COMMON_ACTOR.attemptsTo(
                WaitUntil.the(barLogin, isVisible()).forNoMoreThan(30).seconds(),
                Ensure.that(barLogin).isDisplayed()
        );
    }
    @Cuando("ingrese las credenciales con los datos incorrectos")
    public void ingreselascredencialesconlosdatosincorrectos(List<Map<String, String>> dataMapList)
    {
        Map<String, String> parameters = dataMapList.get(0);
        COMMON_ACTOR.attemptsTo(loginTask.iniciarSesion(parameters));
    }
    @Entonces("Se debe visualizar el mensaje de error")
    public void Sedebevisualizarelmensajedeerror() {
        COMMON_ACTOR.attemptsTo(
                WaitUntil.the(loginerror, isVisible()).forNoMoreThan(30).seconds(),
                Ensure.that(loginerror).isDisplayed()
        );
    }
}
