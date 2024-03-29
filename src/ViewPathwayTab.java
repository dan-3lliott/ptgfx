import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class ViewPathwayTab extends Tab {
    public ViewPathwayTab() {
        //set up tab
        setText("Pathways");
        //create table
        ViewPathwayTable viewPathwayTable = new ViewPathwayTable();
        VBox.setVgrow(viewPathwayTable, Priority.ALWAYS);
        //create button to add a pathway
        Button addButton = new Button("Add Pathway");
        addButton.setMaxWidth(500);
        //define action for addButton
        addButton.setOnAction(e -> {
            AddPathwayStage addPathwayStage = new AddPathwayStage();
            addPathwayStage.show();
        });
        //set up vbox
        VBox vBox = new VBox();
        vBox.setSpacing(5);
        vBox.setPadding(new Insets(10, 10, 10, 10));
        vBox.setAlignment(Pos.TOP_CENTER);
        //add components to vbox
        vBox.getChildren().addAll(viewPathwayTable, addButton);
        //set content of tab to vbox
        setContent(vBox);
    }
}
