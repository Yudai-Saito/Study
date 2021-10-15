import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;

 

public class Sample7 extends Application
{
    private Label lb;
    private Button bt;
    int c = 0;

    public static void main(String[] args){
        launch(args);
    }
    
    public void start(Stage stage)throws Exception
    {
        lb = new Label("��������Ⴂ�܂��B");
        bt = new Button("�w��");

        BorderPane bp = new BorderPane();

        bp.setTop(lb);
        bp.setCenter(bt);

        bt.setOnAction(new SampleEventHandler());

        Scene sc = new Scene(bp, 300, 200);
 
        stage.setScene(sc);

        stage.setTitle("�T���v��");
        stage.show();
    }

 
    class SampleEventHandler implements EventHandler<ActionEvent>
    {
        public void handle(ActionEvent e)
        {
            c = c%2;
            if(c == 0) {
                Alert al = new Alert(Alert.AlertType.INFORMATION);
                al.setTitle("�w��"); 
                al.getDialogPane().setHeaderText("���w�����肪�Ƃ��������܂����B");
                al.show();
                c++;
            }
            else {
                Alert al = new Alert(Alert.AlertType.WARNING);
                al.setTitle("�݌ɂȂ�"); 
                al.getDialogPane().setHeaderText("�\���󂠂�܂��񂪔���؂�ł��B");
                al.show();
                c++;
            }
        }
    }
}