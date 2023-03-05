


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.canvas.*;
import javafx.scene.web.*;
import javafx.scene.Group;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	//  declare two HBoxes
	
	
	
	
	
	  Button button1 = new  Button("Hello"); 
	  Button button2 = new  Button("Howdy"); 

	  Button button3 = new  Button("Chinese"); 

	  Button button4 = new  Button("Clear"); 

	  Button button5 = new  Button("Exit"); 
	  Label label = new  Label("Feedback");
	  TextField field = new  TextField();

	 
	 
	 
	 
     HBox hbox = new HBox();
      HBox hbox2 = new HBox();

	 //student Task #4:
	//  declare an instance of DataManager
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		//  instantiate the HBoxes
       hbox.getChildren().addAll(button1,button2,button3,button4,button5);
       
       
       
       hbox2.getChildren().addAll(label,field);
getChildren().addAll(hbox ,hbox2);
		//student Task #4:




		//  instantiate the DataManager instance
		//  set margins and set alignment of the components
		button1.setOnAction(  new ButtonHandler());
		button2.setOnAction(  new ButtonHandler());

		button3.setOnAction(  new ButtonHandler());

		button4.setOnAction(  new ButtonHandler());

		button5.setOnAction(  new ButtonHandler());

		 

			DataManager object = new DataManager();

		//student Task #3:
		//  add the label and textfield to one of the HBoxes
		//  add the buttons to the other HBox
		//  add the HBoxes to this FXMainPanel (a VBox)
		HBox.setMargin(button1, new Insets(20,20 ,20,20));
		HBox.setMargin(button2, new Insets(20,20 ,20,20));

		HBox.setMargin(button3, new Insets(20,20 ,20,20));
		HBox.setMargin(button4, new Insets(20,20 ,20,20));
		HBox.setMargin(button5, new Insets(20,20 ,20,20));
		hbox.setAlignment(Pos.CENTER);

	
	hbox2.setAlignment(Pos.CENTER);
	
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	
	DataManager object = new DataManager();

		 public class ButtonHandler implements EventHandler<ActionEvent>{

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				if(event.getTarget() == button1) {
					
					
					
					
					field.setText(object.getHello()); 
					
				}if(event.getTarget() == button2) {
					
					
					field.setText( object.getHowdy()); 
					
				}if(event.getTarget() == button3) {
					
					
					field.setText( object.getChinese());
					
				}
				
				
				
				
				
				
if(event.getTarget() == button4) {
					
					
					field.setText("");
					
				}

if(event.getTarget() == button5) {
	
	
	Platform.exit();
	System.exit(0); 
	
}
			}
		
		
		
		
		
	}
	
}
	
