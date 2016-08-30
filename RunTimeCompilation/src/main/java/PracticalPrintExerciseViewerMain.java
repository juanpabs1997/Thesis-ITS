import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sample.controller.PracticalExerciseMakerController;
import sample.controller.PracticalPrintExerciseViewerController;

/**
 * Created by robertoguazon on 30/08/2016.
 */
public class PracticalPrintExerciseViewerMain extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sample/view/PracticalPrintExerciseViewer.fxml"));
            BorderPane root = loader.load();

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
