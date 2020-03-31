package ch.fhnw.oop2.module07.ab3;

import java.text.NumberFormat;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Insets;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

public class ApplicationUI extends VBox {
	private Slider slider;
	private TextField textField;
	IntegerProperty sliderValue = new SimpleIntegerProperty(5);  
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
		textField = new TextField("5");
		StringConverter<Number> converter = new NumberStringConverter();
		textField.textProperty().bindBidirectional(slider.valueProperty(),converter);
	}

	private void layoutControls() {
		setPadding(new Insets(10));
		this.getChildren().addAll(textField, slider);
	}
}
