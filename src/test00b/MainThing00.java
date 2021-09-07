package test00b;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MainThing00 extends Application{
	//beginning the rabbit hole!
	
	VBox vb1,vb2;
	HBox hb1,hb2;
	Button btn1,btn2,btn3;
	Canvas cnvs1;
	GraphicsContext gc1;
	//EVENT HANDLING
	EventHandler<ActionEvent> act1;
	EventHandler<MouseEvent> mEvent1;
	EventHandler<KeyEvent> kbEvent1;
	//EVENT HANDLING
	public static void main(String args[])
	{
		
		
		launch(args);
	}
	
	public void PreRun()
	{
		Insets inset1=new Insets(3.0,3.0,3.0,3.0);
		btn1=new Button("Btn1");
		btn2=new Button("Btn2");
		btn3=new Button("Btn3");
		//btn1.setText("BUTTON ONE");
		cnvs1=new Canvas(400,400);
		cnvs1.setVisible(true);
		gc1=cnvs1.getGraphicsContext2D();
		//
		cnvs1.setOnMouseClicked(mEvent1);
		btn1.setOnAction(act1);
		btn2.setOnAction(act1);
		btn3.setOnAction(act1);
		//BOXES
		hb1=new HBox();
		hb1.getChildren().add(btn1);
		hb1.getChildren().add(btn2);
		hb1.getChildren().add(btn3);
		hb1.setPadding(inset1);
		hb1.setSpacing(20.0);
		vb1=new VBox();
		vb1.getChildren().add(cnvs1);
		vb1.getChildren().add(hb1);
		vb1.setSpacing(2.0);
	}
	public void EventInit()//this is to handle/initialize all the events;
	
	{
		act1 = new EventHandler<ActionEvent>()
			{
				
				@Override
				public void handle(ActionEvent evnt) {
					if(evnt.getSource()==btn1)
					{
						System.out.println("btn1");
					}
					if(evnt.getSource()==btn2)
					{
						System.out.println("btn2");
					}
					if(evnt.getSource()==btn3)
					{
						System.out.println("btn3");
						gc1.clearRect(0, 0, 400, 400);
					}
				}
				
			};

		mEvent1 =new EventHandler<MouseEvent>()
			{

				@Override
				public void handle(MouseEvent me) {
					System.out.printf("\nCOORDINATES CLICKED:%3f,%3f\n", me.getX(),me.getY());
					gc1.fillOval(me.getX(), me.getY(), 20.0, 20.0);
				}
			
			};
		kbEvent1=new EventHandler<KeyEvent>()
			{

				@Override
				public void handle(KeyEvent arg0) {
					// TODO Auto-generated method stub
					
				}
			};
			
	}
	@Override
	public void start(Stage stge0) throws Exception {
		stge0.setTitle("Stage Zero");
		EventInit();
		PreRun();
		
		Scene sc1 = new Scene(vb1);
		stge0.setScene(sc1);
		stge0.show();
	}
}
