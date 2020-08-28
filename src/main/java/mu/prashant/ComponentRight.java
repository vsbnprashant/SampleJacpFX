package mu.prashant;

import java.util.logging.Logger;

import org.jacpfx.api.annotations.Resource;
import org.jacpfx.api.annotations.component.DeclarativeView;
import org.jacpfx.api.message.Message;
import org.jacpfx.rcp.component.FXComponent;
import org.jacpfx.rcp.context.Context;
import org.jacpfx.rcp.util.FXUtil;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextArea;

/**
 *
 * @author bns
 */
@DeclarativeView(id = AppConfig.COMPONENT_RIGHT,
        name = "SimpleView",
        viewLocation = "/fxml/ComponentRight.fxml",
        active = true,
        resourceBundleLocation = "bundles.languageBundle",
        localeID = "en_US",
        initialTargetLayoutId = AppConfig.TARGET_CONTAINER_MAIN)
public class ComponentRight implements FXComponent {
    private Logger log = Logger.getLogger(ComponentRight.class.getName());
    @Resource
    private Context context;
    @FXML
    private TextArea name;

    @Override
    /**
     * The handle method always runs outside the main application thread. You can create new nodes,
     * execute long running tasks but you are not allowed to manipulate existing nodes here.
     */
    public Node handle(final Message<Event, Object> message) {
        return null;
    }

    @Override
    /**
     * The postHandle method runs always in the main application thread.
     */
    public Node postHandle(final Node arg0,
                           final Message<Event, Object> message) {
        // runs in FX application thread
        if (!message.messageBodyEquals(FXUtil.MessageUtil.INIT)) {
            name.setText(message.getTypedMessageBody(String.class));
        }
        return null;
    }

    @FXML
    public void sayHello() {
        context.send(AppConfig.COMPONENT_LEFT, "hello");
    }


}