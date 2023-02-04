package title;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;


public class UserTitle extends Application{
    @Override
    public void start(Stage window){
        Parameters param = getParameters();
        String title = param.getNamed().get("title");
        Label label = new Label();
        Scene view = new Scene(label, 300, 300);
        window.setTitle(title);
        window.setScene(view);
        window.show();
        
        
        
        
    }

}
