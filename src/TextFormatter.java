import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.StackPane;


public class TextFormatter extends Application{
    private TabPane tabPane;
    private InputPane inputPane;
    private OutputPane outputPane;

    public void start(Stage stage)
    {

        StackPane root = new StackPane();

        outputPane = new OutputPane();
        inputPane = new InputPane();

        tabPane = new TabPane();

        Tab tab1 = new Tab();
        tab1.setText("Input");
        tab1.setContent(inputPane);

        Tab tab2 = new Tab();
        tab2.setText("Output");
        tab2.setContent(outputPane);

        tabPane.getSelectionModel().select(0);
        tabPane.getTabs().addAll(tab1, tab2);

        root.getChildren().add(tabPane);

        Scene scene = new Scene(root, 600, 400);
        stage.setTitle("Text Formatter");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}
