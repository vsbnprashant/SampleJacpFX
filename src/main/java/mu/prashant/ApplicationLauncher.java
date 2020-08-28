package mu.prashant;

import org.jacpfx.rcp.workbench.FXWorkbench;
import org.jacpfx.spring.launcher.AFXSpringJavaConfigLauncher;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author bns
 */
public class ApplicationLauncher extends AFXSpringJavaConfigLauncher {

    @Override
    protected Class<? extends FXWorkbench> getWorkbenchClass() {
        return JacpFXWorkbench.class;
    }

    @Override
    protected String[] getBasePackages() {
        return new String[]{"mu.prashant"};
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void postInit(Stage stage) {
    }

    @Override
    protected Class<?>[] getConfigClasses() {
        return new Class<?>[]{AppConfig.class};
    }


}
