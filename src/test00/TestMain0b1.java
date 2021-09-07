package test00;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TestMain0b1 extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage stage0) throws Exception {
		stage0.setTitle("stage0");
		Button btn1= new Button();
		Button btn2=new Button();
		EventHandler<ActionEvent> action1=new EventHandler<ActionEvent>()
				{

					@Override
					public void handle(ActionEvent arg0) {
						if(arg0.getSource().equals(btn1))
						{
							System.out.println("btn1 hit");
						}
						else if (arg0.getSource().equals(btn2))
						{
							System.out.println("btn2 hit");
						}
						
					}
					
				};
		btn1.setText("BUTTON ONE");
		btn2.setText("Button Two");
		btn1.setOnAction(action1);
		btn2.setOnAction(action1);
		VBox vb1 = new VBox();
		vb1.getChildren().add(btn1);
		vb1.getChildren().add(btn2);
		StackPane root = new StackPane();
		root.getChildren().add(vb1);
		stage0.setScene(new Scene(root, 300,300));
		stage0.show();
	}
}
