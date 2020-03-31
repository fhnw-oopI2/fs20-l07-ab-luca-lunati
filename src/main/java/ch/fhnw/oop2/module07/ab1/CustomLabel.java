package ch.fhnw.oop2.module07.ab1;

import javafx.geometry.Insets;
import javafx.scene.control.Label;

public class CustomLabel extends Label {
	public static int counter = 1;

	public CustomLabel() {
		// TODO Auto-generated constructor stub
		this.setText("Label " + counter);
		counter++;
		setPadding(new Insets(10));
	}

}
