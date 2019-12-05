import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class ptgWindow extends Stage {
    public ptgWindow() {
        //set up window
        setTitle("ptg");
        setWidth(1600);
        setHeight(900);
        //set up tabpane
        TabPane mainPane = new TabPane();
        Tab viewStudentTab = new Tab("View Students", new Label("View all students currently in a pathway."));
        Tab viewPathwayTab = new Tab("View Pathways", new Label("View all currently available pathways."));
        //set content of tabs

        //add tabs to tabpane
        mainPane.getTabs().add(viewStudentTab);
        mainPane.getTabs().add(viewPathwayTab);
        //make tabs unclosable
        mainPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
        //wrap tabpane in a scene and add it
        setScene(new Scene(mainPane));
    }
}
