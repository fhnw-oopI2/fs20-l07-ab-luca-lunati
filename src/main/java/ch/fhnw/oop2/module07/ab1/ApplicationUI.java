package ch.fhnw.oop2.module07.ab1;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;

public class ApplicationUI extends FlowPane {
	private Button b;
	private Button b2;
	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		b = new Button("Add Label");
		b.setOnAction(e -> getChildren().add(new CustomLabel()));
	}

	private void layoutControls() {
		setPadding(new Insets(10));
		// TODO Auto-generated method stub
//	this.setPadding(new Insets(10));
		this.getChildren().addAll(b);
	}
}
