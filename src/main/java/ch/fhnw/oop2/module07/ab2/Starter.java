package ch.fhnw.oop2.module07.ab2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public final class Starter extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Scene scene = new Scene(new ApplicationUI());
		primaryStage.setResizable(false);
		primaryStage.setTitle("AB2");
		primaryStage.setScene(scene);
		primaryStage.setWidth(400);
		primaryStage.setHeight(400);
		primaryStage.show();
	}

}
