import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.collections.*;

public class Sample1 extends Application
{
   private Label lb;
   private ComboBox<String> cb1, cb2;
   private ObservableList<String> ol1, ol2;
   private String str1, str2;

   public static void main(String[] args)
   {
      launch(args);
   }
   public void start(Stage stage)throws Exception
   {
      lb = new Label("��������Ⴂ�܂��B");
      cb1 = new ComboBox<String>();
      cb2 = new ComboBox<String>();
      
      ol1 = FXCollections.observableArrayList("��p��", "�g���b�N", "�I�[�v���J�[", "�^�N�V�[", "�X�|�[�c�J�[", "�~�j�J�[");
      
      ol2 = FXCollections.observableArrayList("��p��2", "�g���b�N2", "�I�[�v���J�[2","�^�N�V�[2", "�X�|�[�c�J�[2", "�~�j�J�[2");
      
      cb1.setItems(ol1);
      cb2.setItems(ol2);

      BorderPane bp = new BorderPane();

      bp.setTop(lb);
      bp.setLeft(cb1);
      bp.setRight(cb2);

      cb1.setOnAction(new SampleEventHandler());
      cb2.setOnAction(new SampleEventHandler());

      Scene sc = new Scene(bp, 300, 200);

      stage.setScene(sc);

      stage.setTitle("�T���v��");
      stage.show();
   }

   class SampleEventHandler implements EventHandler<ActionEvent>
   {
      public void handle(ActionEvent e)
      {
        ComboBox<?> tmp = (ComboBox<?>) e.getSource();
        if(tmp == cb1){
        	 str1 = tmp.getValue().toString();
        }else {
        	 str2 = tmp.getValue().toString();
        }if(str1 == null && str2 == null){
        	lb.setText("��������Ⴂ�܂��B");
        }else if(str1 == null){
        	lb.setText(str2 + "�ł��ˁB");
        }else if(str2 == null){
        	lb.setText(str1 + "�ł��ˁB");
        }else{
        	lb.setText(str1 + "��" + str2 +"�ł��ˁB");
        }
      }
   }
}
