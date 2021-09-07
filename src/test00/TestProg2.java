package test00;
import javafx.application.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
public class TestProg2 extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage mainStage) throws Exception {
		// TODO Auto-generated method stub
		mainStage.setTitle("Hey WORLD");
		Button btn1 = new Button();
		btn1.setText("HAH BUTTON");
		btn1.setOnAction(new EventHandler<ActionEvent>()
		{
			   @Override
	            public void handle(ActionEvent event) {
	                System.out.println("Hello World!");
	            }
		});
		StackPane root = new StackPane();
		root.getChildren().add(btn1);
		mainStage.setScene(new Scene(root, 300,300));
		mainStage.show();
	}

}
