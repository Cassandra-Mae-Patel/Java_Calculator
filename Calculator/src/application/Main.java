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
		Pane pane = new Pane();
		
		Circle circle =  new Circle();
		circle.centerXProperty().bind(pane.widthProperty().divide(2));
		circle.centerYProperty().bind(pane.heightProperty().divide(2));
		circle.setRadius(50);
		circle.setStroke(Color.RED);
		circle.setFill(Color.AQUAMARINE);
		pane.getChildren().add(circle);
		
		Scene scene = new Scene(pane, 200,200);
		primaryStage.setTitle("Centered Circle");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
