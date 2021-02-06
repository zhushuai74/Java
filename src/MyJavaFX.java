//Every JavaFX application is divided hierarchically into three main components
//known as Stage, Scene and nodes

//Must import these 3 classes

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application
{
	// Override the start method in the Application class
  	public void start(Stage primaryStage)
  	{
    	//Create a button.
    	Button btOK = new Button("OK");

    	//Scene(node, width, height). This constructor specifies the
    	//width and height of the scene and places the node in the scene
    	Scene scene = new Scene(btOK, 200, 250);

    	//set the stage title
   		primaryStage.setTitle("JavaFx.MyJavaFX");

   		// Place the scene in the stage
   		primaryStage.setScene(scene);

   		// Display the stage
   		primaryStage.show();
  	}

  /* This main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
 /* public static void main(String[] args)
  {
    launch(args);
  } */
}