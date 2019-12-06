import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ptgWindow extends Stage {
    private String style = "stylesheets/darktheme.css";
    public ptgWindow() {
        //set up window
        setTitle("ptg");
        setWidth(1600);
        setHeight(900);
        initStyle(StageStyle.UNDECORATED);
        //set up tabpane and declare tabs
        TabPane mainPane = new TabPane();
        ViewStudentTab viewStudentTab = new ViewStudentTab();
        ViewPathwayTab viewPathwayTab = new ViewPathwayTab();
        //add tabs to tabpane
        mainPane.getTabs().add(viewStudentTab);
        mainPane.getTabs().add(viewPathwayTab);
        //make tabs unclosable
        mainPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);
        //wrap tabpane in a scene and add it
        setScene(new Scene(mainPane));
        getScene().getStylesheets().add(style);
    }
}
