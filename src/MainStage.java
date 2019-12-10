import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainStage extends Stage {
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
        //create custom title bar and set its position to the upper right hand corner of the window
        TitleBar titleBar = new TitleBar();
        //create stackpane to combine the tabpane and the custom title bar, set position of title bar to upper right hand corner of window
        StackPane stackPane = new StackPane(mainPane, titleBar);
        stackPane.setAlignment(titleBar, Pos.TOP_RIGHT);
        //wrap stackpane in a scene, then add it
        setScene(new Scene(stackPane));
        //add style to the scene
        getScene().getStylesheets().add(Main.style);
        //move window to front
        toFront();
    }
}
