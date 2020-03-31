package ch.fhnw.oop2.module07.ab2;

import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {
	private Slider slider;
	private Label label;

	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}

	private void initializeControls() {
		slider = new Slider(1, 10, 5);
		slider.setShowTickMarks(true);
		slider.setShowTickLabels(true);
		slider.setMajorTickUnit(1);
		slider.setBlockIncrement(0.1f);
		slider.setSnapToTicks(true);
		label = new Label("5");
		
		slider.valueProperty().addListener(
				(observableValue, oldValue, newValue) -> label.textProperty().setValue(String.valueOf(newValue)));

	}

	private void layoutControls() {
		setPadding(new Insets(10));
		this.getChildren().addAll(label, slider);
	}
}
