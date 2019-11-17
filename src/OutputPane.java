import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class OutputPane extends VBox {
    private TextField filePath = new TextField();
    private TextArea outputFeild = new TextArea();
    private Button saveFileBtn = new Button("Save File");
    private HBox btnBox = new HBox(5);

    private Label outputLabel;
    private Label errorLabel;

    public OutputPane()
    {
        this.setSpacing(5);
        this.setPadding(new Insets(25,15,5,15));

        filePath.setPrefSize(350, 20);
        btnBox.setAlignment(Pos.CENTER);
        btnBox.getChildren().addAll(filePath, saveFileBtn);

        outputLabel = new Label("Output:");
        outputLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 14));

        errorLabel = new Label(""); //change this to display hardcoded error message

        outputFeild.setEditable(false);//disable the ability to edit field, read-only

        //saveFileBtn.setPrefSize(200, 20);
        //adds style to buttons implement later
        saveFileBtn.setFont(Font.font("Verdana", 12));
        //listView.getItems().addAll(laptopList.toString(), "Titanic", "Contact", "The Social Network");
        this.getChildren().addAll(outputLabel, outputFeild, btnBox, errorLabel);

        saveFileBtn.setOnAction(new saveFileHandler2());

        displayFileContents();

    }

    public void saveFile()
    {
        //get from filePath textfield
    }


    public void displayFileContents()
    {

    }

    private class saveFileHandler2 implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent e)
        {
            //if file is empty print error

            //else

            saveFile();
        }
    }

}
