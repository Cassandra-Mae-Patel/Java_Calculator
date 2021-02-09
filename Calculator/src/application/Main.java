package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		Circle circle = new Circle();
		circle.setCenterX(100);
		circle.setCenterY(100);
		circle.setRadius(50);
		circle.setStroke(Color.DARKRED);
		circle.setFill(Color.CADETBLUE);
		
		Pane pane = new Pane();
		pane.getChildren().add(circle);
		
		Scene scene = new Scene(pane,200,200);
		primaryStage.setTitle("ShowCircle");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
