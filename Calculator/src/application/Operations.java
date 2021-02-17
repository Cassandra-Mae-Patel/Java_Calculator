package application;

import java.util.Spliterator;

import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class Operations {
//StringBuilder string = Main.numbers;
	public void printStmt(StringBuilder s, Label l) {
		l.setText(s.toString());
		l.setFont(Font.font("Timer New Roman", FontWeight.BOLD, FontPosture.ITALIC,25));
	}
	public void arithmatic(StringBuilder str) {
		int[] num = new int[100],indexNum; char op; String firstNum, secondNum, mainString;
		int idop;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)=='+' ||str.charAt(i)=='-' ||str.charAt(i)=='/'||str.charAt(i)=='*') {
				
					op =str.charAt(i);
					idop = i;
					if(i==0) {
						firstNum="0";
					}
					else if(i!=0) {
						mainString = str.toString();
						
					}
			}
			else if(str.charAt(i)=='=') {
				//answer
			}
			else {
				num[i] = (int)str.charAt(i);
				
			}
		}
	}
	
	public void getadd() {
		
	}

}
