import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AddPathwayStage extends Stage {
    private static final int width = 800;
    private static final int height = 400;
    public AddPathwayStage() {
        //set up window
        setTitle("Vision");
        setWidth(width);
        setHeight(height);
        initStyle(StageStyle.UNDECORATED);
        //create components - text fields for values
        TextField title = new TextField(); //title of pathway
        TextField languageReq = new TextField(); //language arts credit requirement
        TextField mathReq = new TextField(); //mathematics credit requirement
        //create components - labels for text fields
        Label languageReqLabel = new Label("Language Arts:");
        Label mathReqLabel = new Label("Mathematics:");
        //set up primary vbox
        VBox vBox = new VBox();
        vBox.setSpacing(5);
        vBox.setPadding(new Insets(10));
        vBox.setAlignment(Pos.TOP_CENTER);
        //set up first hbox
        HBox hBox = new HBox();
        hBox.setSpacing(5);
        hBox.setAlignment(Pos.CENTER);
        //add components to first hbox
        hBox.getChildren().addAll(languageReqLabel, languageReq, mathReqLabel, mathReq);
        //add components to vbox
        vBox.getChildren().addAll(title, hBox);
        //wrap vbox in a scene and add it
        setScene(new Scene(vBox));
        //add style to the scene
        getScene().getStylesheets().add(Main.style);
        //move window to front
        toFront();
    }
}
