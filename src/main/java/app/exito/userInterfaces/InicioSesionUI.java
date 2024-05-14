package app.exito.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class InicioSesionUI {


    public static final Target BTN_INGRESAR = Target.the("INGRESAR").located(By.id("com.exito.appcompania:id/AppCompatButton_ingresar"));
    public static final Target INP_CORREO = Target.the("CORREO").located(By.id("com.exito.appcompania:id/TextInputEditText_email"));
    public static final Target INP_CLAVE= Target.the("CLAVE").located(By.xpath("(//*[@class='android.widget.EditText'])[2]"));
    public static final Target LBL_NOMBRE_USUARIO = Target.the("NOMBRE DEL USUARIO").located(By.id("com.exito.appcompania:id/AppCompatTextView_hola"));
    public static final Target BTN_INICIO = Target.the("INICIO").located(By.id("com.exito.appcompania:id/navigation_home"));
}
