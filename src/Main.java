import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
    private static final int op = 29;
    String[] attck = new String[]{"Sledge","Thatcher","Ash","Thermite","Twitch","Montagne","Glaz","Fuze","Blitz","IQ","Buck","BB","Capitao","Hibana","Jackal","Ying","Zofia","Dokkaebi","Lion","Finka","Maverick","Nomad","Gridlock","Nokk","Amaru","Kali","Iana","Ace","Zero"};
    String[] defend= new String[]{"Smoke","Mute","Castle","Pulse","Doc","Rook","Kapkan","Tachanka","Jager","Bandit","Frost","Valkirye","Caveira","Echo","Mira","Lesion","Ela","Vigil","Maestro","Alibi","Clash","Kaid","Mozzie","Warden","Goyo","Wamai","Oryx","Melusi","Aruni"};
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Esercizio");

        primaryStage.setWidth(1000);
        primaryStage.setHeight(1000);
        TilePane root = new TilePane();
        root.setVgap(80);
        Label lb1= new Label("Attaccanti");
        Label lb2= new Label("Difensori");
        root.getChildren().add(lb1);
        root.getChildren().addAll( ar(attck));
        root.getChildren().add(lb2);
        root.getChildren().addAll(ar(defend));
        Scene scene1= new Scene(root);
        primaryStage.show();
        primaryStage.setScene(scene1);

    }

    private Button[] ar(String[] arr){
        Button[] bottoni = new Button[op];
        for (int x=0;x<op;x++)
        {
            Button tempB= new Button(arr[x]);
            tempB.setOnAction(e->{
                tempB.setText("Morto");
            });
            bottoni[x] = tempB;

        }
        return bottoni;
    }
    public static void main(String[] args) {
        launch(args);
    }
}
