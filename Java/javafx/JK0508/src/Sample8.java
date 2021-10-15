import java.util.*;
import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;

public class Sample8 extends Application{
    private Label lb;
    private Button bt;

    public static void main(String[] args){
        launch(args);
    }
    
    public void start(Stage stage)throws Exception{

        lb = new Label();
        bt = new Button();

        lb.setText("いらっしゃいませ。");
        bt.setText("購入");
        
        BorderPane bp = new BorderPane();

        bp.setTop(lb);
        bp.setCenter(bt);

        bt.setOnAction(new SampleEventHandler());

        Scene sc = new Scene(bp, 300, 200);

        stage.setScene(sc);

        stage.setTitle("サンプル");
        stage.show();
    }

    class SampleEventHandler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            Alert al1 = new Alert(Alert.AlertType.CONFIRMATION);
            al1.setTitle("確認"); 
            al1.getDialogPane().setHeaderText("本当に購入しますか？");
            Optional<ButtonType> res = al1.showAndWait();

            if(res.get() == ButtonType.OK){
                Alert al2 = new Alert(Alert.AlertType.CONFIRMATION);
                al2.setTitle("再確認"); 
                al2.getDialogPane().setHeaderText("本当に本当に購入しますか？");
                Optional<ButtonType> res1 = al2.showAndWait();

                if(res1.get() == ButtonType.OK){
                    Alert al3 = new Alert(Alert.AlertType.INFORMATION);
                    al3.setTitle("購入"); 
                    al3.getDialogPane().setHeaderText("ご購入ありがとうございました。");
                    al3.show();
                }
            }
        }
    }
}