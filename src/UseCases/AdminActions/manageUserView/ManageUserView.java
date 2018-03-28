package UseCases.AdminActions.manageUserView;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * 
 */
public class ManageUserView extends Scene {

    /**
     * Default constructor
     */
    public ManageUserView(AnchorPane root, double width, double height) {
    	super(root, width, height);
		URL url = getClass().getResource("ManageUserStructure.fxml");
	    FXMLLoader fxmlLoader = new FXMLLoader(url);
	    try {
	    AnchorPane root2 = (AnchorPane) fxmlLoader.load();
	    root.getChildren().add(root2);
	    }
	    catch (IOException ex) {
	        System.err.println("Erreur au chargement: " + ex);
	    }
	}


    public void init() {
        // TODO implement here
        return;
    }

}