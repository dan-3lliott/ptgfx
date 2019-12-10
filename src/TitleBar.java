import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TitleBar extends HBox {
    private static final int height = 20;
    private static final int width = 100;
    private static final String noBorder = "-fx-border-width: 0";
    public TitleBar() {
        //set up hbox sizing and alignment
        setMaxHeight(height);
        setMaxWidth(width);
        setAlignment(Pos.CENTER_RIGHT);
        setSpacing(5);
        setPadding(new Insets(10));
        //create buttons
        Button minimize = new Button("—");
        Button close = new Button(" X ");
        //define action for the minimize button
        minimize.setOnAction(e -> ((Stage)((Button)e.getSource()).getScene().getWindow()).setIconified(true));
        //define action for the close button
        close.setOnAction(e -> ((Stage)((Button)e.getSource()).getScene().getWindow()).close());
        //remove button borders while leaving the rest of the css styling for buttons intact
        minimize.setStyle(noBorder);
        close.setStyle(noBorder);
        //add buttons to hbox
        getChildren().addAll(minimize, close);
    }
}
