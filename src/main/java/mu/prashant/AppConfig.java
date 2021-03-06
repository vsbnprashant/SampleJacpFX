package mu.prashant;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author bns
 */

@Configuration
@ComponentScan
public class AppConfig {

    public static final String PERSPECTIVE_ONE = "idPone";

    public static final String COMPONENT_LEFT = "id002";
    public static final String COMPONENT_RIGHT = "id003";

    public static final String TARGET_CONTAINER_LEFT = "PLeft";
    public static final String TARGET_CONTAINER_MAIN = "PMain";
}
