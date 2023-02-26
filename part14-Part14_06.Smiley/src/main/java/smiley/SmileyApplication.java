package smiley;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class SmileyApplication extends Application {
    
    @Override
    public void start(Stage window){
        
        BorderPane paintingLayout = new BorderPane();
        Canvas paintingCanvas = new Canvas(480,480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();
        
        paintingLayout.setCenter(paintingCanvas);
        
         painter.fillRect(150, 100, 50, 50);
         painter.fillRect(300, 100, 50, 50);
         painter.fillRect(100, 250, 50, 50);
         painter.fillRect(350,250, 50, 50);
         painter.fillRect(150, 300, 200, 50);
        
        
        paintingCanvas.setOnMouseDragged((event) -> {
            double xLocation = event.getX();
            double yLocation = event.getY();
            
            painter.fillOval(xLocation, yLocation, 4, 4);
            
        });
        
        Scene scene = new Scene(paintingLayout);
        window.setScene(scene);
        window.show();
        
        
        
        
    }
  
    

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(SmileyApplication.class);
        
    }

}
