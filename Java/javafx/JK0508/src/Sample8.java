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

        lb.setText("��������Ⴂ�܂��B");
        bt.setText("�w��");
        
        BorderPane bp = new BorderPane();

        bp.setTop(lb);
        bp.setCenter(bt);

        bt.setOnAction(new SampleEventHandler());

        Scene sc = new Scene(bp, 300, 200);

        stage.setScene(sc);

        stage.setTitle("�T���v��");
        stage.show();
    }

    class SampleEventHandler implements EventHandler<ActionEvent>{
        public void handle(ActionEvent e){
            Alert al1 = new Alert(Alert.AlertType.CONFIRMATION);
            al1.setTitle("�m�F"); 
            al1.getDialogPane().setHeaderText("�{���ɍw�����܂����H");
            Optional<ButtonType> res = al1.showAndWait();

            if(res.get() == ButtonType.OK){
                Alert al2 = new Alert(Alert.AlertType.CONFIRMATION);
                al2.setTitle("�Ċm�F"); 
                al2.getDialogPane().setHeaderText("�{���ɖ{���ɍw�����܂����H");
                Optional<ButtonType> res1 = al2.showAndWait();

                if(res1.get() == ButtonType.OK){
                    Alert al3 = new Alert(Alert.AlertType.INFORMATION);
                    al3.setTitle("�w��"); 
                    al3.getDialogPane().setHeaderText("���w�����肪�Ƃ��������܂����B");
                    al3.show();
                }
            }
        }
    }
}