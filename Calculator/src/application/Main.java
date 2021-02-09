package application;
	


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.*;
import javafx.scene.text.Font;


public class Main extends Application {
	Integer num3, num1, num2;
	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception  {
		
		
		// TODO Auto-generated method stub
		Pane pane2 = new HBox(10);
		Label answer= new Label();
		
		
		FlowPane root = new FlowPane();
		Pane pane1 = new HBox(10);
		
		Button button1 = new Button("5");
		button1.setOnAction(e ->  num1 = 5);
		Button button2 = new Button("25");
		button2.setOnAction(e ->  num2 = 25);
		Button add = new Button("+");
		add.setOnAction(e ->  {num3 = num1+num2;
		answer.setText(" 	"+num3.toString());
		answer.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,20));
		pane2.getChildren().add(answer);
		});
		pane1.getChildren().addAll(button1,button2,add);
		
		
		root.getChildren().addAll(pane1,pane2);
		Scene scene = new Scene(root);
		primaryStage.setTitle("ShowImage");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
