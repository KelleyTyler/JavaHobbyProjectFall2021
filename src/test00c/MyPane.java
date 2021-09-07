package test00c;

import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class MyPane extends Pane
{
	VBox vb1,vb2;
	HBox hb1,hb2;
	Button btn1,btn2,btn3,btn4;
	Canvas cnvs1;
	GraphicsContext gc1;
	
	int switching;
	MyPane()
	{	
		super();
		PreRun();
		super.getChildren().add(vb1);
		switching=0;
	}
	public void PreRun()
	{
		Insets inset1=new Insets(3.0,3.0,3.0,3.0);
		btn1=new Button("Btn1");
		btn2=new Button("Btn2");
		btn3=new Button("Btn3");
		btn4=new Button("Btn4");
		//btn1.setText("BUTTON ONE");
		cnvs1=new Canvas(400,400);
		cnvs1.setVisible(true);
		gc1=cnvs1.getGraphicsContext2D();
		//
//		cnvs1.setOnMouseClicked(mEvent1);
//		btn1.setOnAction(act1);
//		btn2.setOnAction(act1);
//		btn3.setOnAction(act1);
		//BOXES
		hb1=new HBox();
		hb1.getChildren().add(btn1);
		hb1.getChildren().add(btn2);
		hb1.getChildren().add(btn3);
		hb1.getChildren().add(btn4);
		hb1.setPadding(inset1);
		hb1.setSpacing(20.0);
		vb1=new VBox();
		vb1.getChildren().add(cnvs1);
		vb1.getChildren().add(hb1);
		vb1.setSpacing(2.0);
	}
	public void aEvent(ActionEvent e)
	{
		if(e.getSource()==btn1)
		{
			System.out.println("btn1");
		}
		if(e.getSource()==btn2)
		{
			System.out.println("btn2");
			switching =3;
		}
		if(e.getSource()==btn3)
		{
			System.out.println("btn3");
			gc1.clearRect(0, 0, 400, 400);
			switching =0;
		}
	}
	public void mEvent(MouseEvent me)
	{
		System.out.printf("\nCOORDINATES CLICKED:%3f,%3f\n", me.getX(),me.getY());
		gc1.fillOval(me.getX(), me.getY(), 20.0, 20.0);

	}
	public void kEvent(KeyEvent ke, int code)
	{
		if(code==0)//key is pressed
		{
			switch(ke.getCode())
			{
				case W:
					break;
				case S:
					break;
				case D:
					break;
				case A:
					System.out.println("YOU PRESSED A!");
					break;
				
				default:
					break;
			}
		}
		else if(code==1)//key is released
		{
			
		}
		else//idk.
		{
		}
	}
	
	public int update()
	{
		
		return switching;
	}
	public int update(long pTime,long tTime)
	{
		double time1 = (pTime - tTime) / 1000000000;
		double time2 = (pTime - tTime) / 100000000;
		double xAxis = 231 + 127 * Math.cos(time1);
		double yAxis = 231 + 127 * Math.sin(time1);
		double xAxis1 = 231 + 127 * Math.cos(time2);
		double yAxis1 = 231 + 127 * Math.sin(time2);
		gc1.setStroke(Color.BLACK);
		gc1.strokeOval(xAxis,yAxis,10.0,10.0);
		gc1.setStroke(Color.RED);
		gc1.strokeOval(xAxis1,yAxis1,10.0,10.0);
		//System.out.printf("%20f\t|\t%20f\n",time1,time2);
		return switching;
	}
}
