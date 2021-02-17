package application;
	


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.text.*;
import javafx.scene.text.Font;
import application.*;


public class Main extends Application {
	
	public static Label lbl = new Label();
	public static StringBuilder numbers = new StringBuilder("");
	public static String str1, str2;
	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception  {
		
		
		
		BorderPane mainPane = new BorderPane();
		mainPane.setTop(getHBox());
		mainPane.setCenter(getGridPane());
		mainPane.setStyle("-fx-background-color: black");
		
		Scene scene = new Scene(mainPane,250,250);
		primaryStage.setTitle("Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public HBox getHBox() {
		HBox hBox = new HBox(10);
		hBox.setPadding(new Insets(15, 15, 15, 15));
		hBox.setStyle("-fx-background-color: pink");
		
		hBox.getChildren().add(lbl);
		return hBox;
		
	}
	
	public GridPane getGridPane() {
		Operations ansFinal = new Operations();
		Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btDot,btPlus,bteq,btDiv,btMul,btSub;
		//StringBuilder numbers = new StringBuilder("");
		//add answer = new add();
		// TODO Auto-generated method stub
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.TOP_CENTER);
		pane.setHgap(15);
		pane.setVgap(15);
		
		bt1 = new Button("1");
		bt1.setOnMouseClicked(e -> {numbers.append('1');
		ansFinal.printStmt(numbers,lbl);
		});
		
		bt2 = new Button("2");
		bt2.setOnMouseClicked(e -> {numbers.append('2');
			ansFinal.printStmt(numbers,lbl);
		});
		
		bt3 = new Button("3");
		bt3.setOnMouseClicked(e -> {numbers.append('3');
		ansFinal.printStmt(numbers,lbl);
		});
		
		bt4 = new Button("4");
		bt4.setOnMouseClicked(e -> {numbers.append('4');
		ansFinal.printStmt(numbers,lbl);
		});
		
		bt5 = new Button("5");
		bt5.setOnMouseClicked(e -> {numbers.append('5');
		ansFinal.printStmt(numbers,lbl);
		});
		
		bt6 = new Button("6");
		bt6.setOnMouseClicked(e -> {numbers.append('6');
		ansFinal.printStmt(numbers,lbl);
		});
		
		bt7 = new Button("7");
		bt7.setOnMouseClicked(e -> {numbers.append('7');
		ansFinal.printStmt(numbers,lbl);
		});
		
		bt8 = new Button("8");
		bt8.setOnMouseClicked(e -> {numbers.append('8');
		ansFinal.printStmt(numbers,lbl);
		});
		
		bt9 = new Button("9");
		bt9.setOnMouseClicked(e -> {numbers.append('9');
		ansFinal.printStmt(numbers,lbl);
		});
		
		bt0 = new Button("0");
		bt0.setOnMouseClicked(e -> {numbers.append('0');
		ansFinal.printStmt(numbers,lbl);
		});
		btDot = new Button(".");
		btDot.setOnMouseClicked(e -> {numbers.append('.');
		ansFinal.printStmt(numbers,lbl);
		});
		
		btPlus = new Button("+");
		btPlus.setOnMouseClicked(e -> {numbers.append('+');
		ansFinal.printStmt(numbers,lbl);
		});
		
		bteq = new Button("=");
		bteq.setOnMouseClicked(e -> {numbers.append('=');
		ansFinal.printStmt(numbers,lbl);
		
		});
		
		btMul = new Button("*");
		btMul.setOnMouseClicked(e -> {numbers.append('*');
		ansFinal.printStmt(numbers,lbl);
		});
		
		btSub = new Button("-");
		btSub.setOnMouseClicked(e -> {numbers.append('-');
		ansFinal.printStmt(numbers,lbl);
		
		});
		
		btDiv = new Button("/");
		btDiv.setOnMouseClicked(e -> {numbers.append('/');
		ansFinal.printStmt(numbers,lbl);
		});
		
		
		
		//Label label = new Label("");
		//Pane lbl = new HBox(100);
		//lbl.getChildren().add(label);
		//GridPane.setHalignment(label, HPos.CENTER);
		//pane.add(label, 0, 0);
		//pane.add(lbl, columnIndex, rowIndex);
		pane.add(bt1, 0, 1);
		pane.add(bt2, 1, 1);
		pane.add(bt3, 2, 1);
		pane.add(bt4, 0, 2);
		pane.add(bt5, 1, 2);
		pane.add(bt6, 2, 2);
		pane.add(bt7, 0, 3);
		pane.add(bt8, 1, 3);
		pane.add(bt9, 2, 3);
		pane.add(bt0, 1, 4);
		pane.add(btDot, 2, 4);
		pane.add(btPlus, 3, 2);
		pane.add(bteq, 3, 4);
		pane.add(btDiv, 3, 1);
		pane.add(btSub, 3, 3);
		pane.add(btMul, 0, 4);

		return pane;
		
	}
	
}
