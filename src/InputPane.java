import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class InputPane extends VBox {
    private TextField inputFileTextBox = new TextField();
    private TextArea inputTextBox = new TextArea();
    private Button uploadBtn = new Button("Upload");
    private Button formatTextBtn = new Button("Format File");
    private Label inputLabel;
    private Label errorLabel = new Label("");
    private HBox btnBox = new HBox(10);

    //private OutputPane outputPane;

    public InputPane() {
        //this.outputPane = opane;
        this.setSpacing(5);
        this.setPadding(new Insets(25,15,5,15));

        uploadBtn.setFont(Font.font("Verdana", 12));

        btnBox.setAlignment(Pos.CENTER);
        btnBox.getChildren().addAll(inputFileTextBox, uploadBtn);

        inputLabel = new Label("Input:");
        inputLabel.setFont(Font.font("Verdana", FontWeight.BOLD, 14));

        inputTextBox.setEditable(false); //disable editting for read-only

        errorLabel = new Label(""); //change this to display hardcoded error message

        formatTextBtn.setPrefSize(660, 20);
        //adds style to buttons implement later
        formatTextBtn.setFont(Font.font("Verdana", 12));
        //formatTextBtn.setBackground(new Background(new BackgroundFill(Color.web("#7592ba"), CornerRadii.EMPTY, Insets.EMPTY)));

        inputFileTextBox.setPrefSize(350,20);

        this.getChildren().addAll(btnBox, inputLabel, inputTextBox, formatTextBtn, errorLabel);

        uploadBtn.setOnAction(new uploadFileHandler());
    }

    private void uploadFile()
    {

    }

    private void displayFileContents()
    {

    }

    private void formatText()
    {

    }

    private class uploadFileHandler implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent e)
        {
            //if file is empty display error

            //else
            uploadFile();
            displayFileContents();
        }
    }

    private class FormatTextHandler implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent e)
        {

        }
    }
}
