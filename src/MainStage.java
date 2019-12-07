import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainStage extends Stage {
    private String style = "stylesheets/darktheme.css"; //"stylesheets/lighttheme.css";
    private static final int width = 1600;
    private static final int height = 900;
    public MainStage() {
        //set up window
        setTitle("Vision");
        setWidth(width);
        setHeight(height);
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
        //add style to the scene
        getScene().getStylesheets().add(style);
    }
}
