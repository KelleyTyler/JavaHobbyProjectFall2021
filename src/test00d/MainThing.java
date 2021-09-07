package test00d;
//--module-path="C:\Program Files\Java\OpenFX\javafx-sdk-11.0.2\lib" --add-modules=javafx.controls,javafx.fxml

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MainThing extends Application{
	//EVENTS--
	EventHandler<ActionEvent> act1;
	EventHandler<MouseEvent> mEvent1;
	EventHandler<KeyEvent> kEvent0,kEvent1;
	EventHandler<KeyEvent> kEvent2;
	//EVENTS--
	
	@Override
	public void start(Stage stage0) throws Exception {
		stage0.setTitle("MY STAGE");
		CustomPane cPane = new CustomPane();
		Scene scene=new Scene(cPane.myPane);
		cPane.EventInit();
		//cPane.
		stage0.setScene(scene);
		stage0.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
		System.out.println("ProgramOver");
	}
}