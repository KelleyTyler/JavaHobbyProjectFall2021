package test00c;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainThing extends Application {
	
	//EVENT HANDLING
	EventHandler<ActionEvent> act1;
	EventHandler<MouseEvent> mEvent1;
	EventHandler<KeyEvent> kEvent0,kEvent1;
	EventHandler<KeyEvent> kEvent2;
	
	//EVENT HANDLING
	
	//TIMER SHIT
	AnimationTimer aTimer;
	final long tNTime=System.nanoTime();
	//TIMER SHIT
	VBox vbox;
	HBox hbox;
	Label lab1,lab2,lab3;
	@Override
	public void start(Stage stage0) throws Exception {
		stage0.setTitle("MY STAGE");
		Pane pane = new Pane();
		MyPane cPane= new MyPane();
		//cPane.add
		//--Additional--
		hbox=new HBox();
		vbox=new VBox();
		lab1=new Label("Door");
		lab2=new Label("cups");
		lab3=new Label("West");
		vbox.getChildren().addAll(lab1,lab2,lab3);
		hbox.getChildren().addAll(cPane,vbox);
		
		//--additional--
		EventInit(cPane);
		Scene scene=new Scene(hbox);
		stage0.setScene(scene);

		aTimer.start();
		stage0.show();
	}

	
	public void EventInit(MyPane p)//this is to handle/initialize all the events;
	{

		act1 = new EventHandler<ActionEvent>()
			{
				
				
				@Override
				public void handle(ActionEvent evnt) {
					System.out.println("A BUTTON PRESSED!");
					p.aEvent(evnt);
				}	
			};
		mEvent1 =new EventHandler<MouseEvent>()
			{

				@Override
				public void handle(MouseEvent me) {
					p.mEvent(me);
				}
			
			};
		kEvent0=new EventHandler<KeyEvent>()
			{

				@Override
				public void handle(KeyEvent ke) {
					System.out.println("Key: "+ke.getCharacter()+" Down");
					p.kEvent(ke, 0);
				}
			};
		kEvent1=new EventHandler<KeyEvent>()
			{
			
				@Override
				public void handle(KeyEvent ke) {

					System.out.println("Key: "+ke.getCode().toString()+" UP");
					p.kEvent(ke, 1);
				}
			};
		kEvent2=new EventHandler<KeyEvent>()
			{
			
				@Override
				public void handle(KeyEvent ke) {

				}
			};
			aTimer=new AnimationTimer() {

				@Override
				public void handle(long pNTime) {
						int j= p.update(pNTime,tNTime);
						if (j==3)
						{
							lab1.setText("Cats");
							lab2.setText("Mice");
							lab3.setText("Fish");
						}
					}
				
			};
			p.cnvs1.setOnMouseClicked(mEvent1);
			p.btn1.setOnAction(act1);
			p.btn2.setOnAction(act1);
			p.btn3.setOnAction(act1);
			p.setOnKeyPressed(kEvent0);
			p.setOnKeyReleased(kEvent1);
	}
	
	public static void main(String[] args) {
		launch(args);
		System.out.println("ProgramOver");
	}
}
