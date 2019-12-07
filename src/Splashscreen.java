import javafx.application.Preloader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Splashscreen extends Preloader {
    private static final int width = 600;
    private static final int height = 300;
    private Stage stage;
    @Override
    public void start(Stage stage) {
        //set up stage
        this.stage = stage;
        this.stage.initStyle(StageStyle.UNDECORATED);
        this.stage.setWidth(width);
        this.stage.setHeight(height);
        //set up vbox and scene, add image
        VBox vBox = new VBox();
        vBox.getChildren().add(new ImageView(new Image("assets/splashscreen.png")));
        //add scene to stage
        this.stage.setScene(new Scene(vBox));
        //show stage
        stage.show();
    }
    @Override
    public void handleStateChangeNotification(StateChangeNotification stateChangeNotification) {
        if (stateChangeNotification.getType() == StateChangeNotification.Type.BEFORE_START) {
            stage.hide();
        }
    }
}
