import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TrisApp extends Application {

    // 01 creo le variabili di cui ho bisogno a livello globale
    private int n = 3;
    private Button[][] btns = new Button[n][n];
    private Stage primaryStage;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // 03 richiamo il metodo per creqre la board
        this.primaryStage = primaryStage;
        createBoard();


        // 04 settiamo titolo e lo lanciamo
        primaryStage.setTitle("TRIS GAME");
        primaryStage.show();


    }

    private void createBoard() {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        // 05 creo i bottoni e setto la loro dimensione, aggiungendoli alla griglia
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Button btn = new Button();
                btn.setPrefSize(100, 100);
                gridPane.add(btn, i, j);
                btns[i][j] = btn;

                btn.setOnAction(event -> click());
            }
        }
// 06 creiamo la scena e l'assegnamo al primaryStage
        Scene scena = new Scene(gridPane, 320, 320);
        primaryStage.setScene(scena);

    }

    private void click() {

    }

}
