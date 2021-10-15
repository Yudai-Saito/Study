import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;

public class Sample5 extends Application
{
   private Label lb;
   private MenuBar mb;
   private Menu[] mn = new Menu[7];
   private MenuItem[] mi = new MenuItem[15];

   public static void main(String[] args)
   {
      launch(args);
   }
   public void start(Stage stage)throws Exception
   {
      lb = new Label("��������Ⴂ�܂��B");
      mb = new MenuBar();
      
      mn[0] = new Menu("���C��1");
      mn[1] = new Menu("���C��2");
      mn[2] = new Menu("�T�u1");
      mn[3] = new Menu("�T�u2");
      mn[4] = new Menu("���C��3");
      mn[5] = new Menu("�T�u1");
      mn[6] = new Menu("�T�u2");

      mi[0] = new MenuItem("��p��");
      mi[1] = new MenuItem("�g���b�N");
      mi[2] = new MenuItem("�I�[�v���J�[");
      mi[3] = new MenuItem("�^�N�V�[");
      mi[4] = new MenuItem("�X�|�[�c�J�[");
      mi[5] = new MenuItem("�~�j�J�[");
      mi[6] = new SeparatorMenuItem();
      mi[7] = new MenuItem("�p�g�J�[");
      mi[8] = new MenuItem("���h��");
      mi[9] = new MenuItem("���]��");
      mi[10] = new SeparatorMenuItem();
      mi[11] = new MenuItem("�x�r�[�J�[");
      mi[12] = new SeparatorMenuItem();
      mi[13] = new MenuItem("�O�֎�");
      mi[14] = new SeparatorMenuItem();

      mn[0].getItems().addAll(mi[0], mi[1]);

      mn[2].getItems().addAll(mi[2], mi[3]);

      mn[3].getItems().addAll(mi[4], mi[5]);

      mn[1].getItems().addAll(mn[2]);
      mn[1].getItems().addAll(mi[6], mn[3]);
      
      mn[5].getItems().addAll(mi[7], mi[8]);
      mn[6].getItems().addAll(mi[9], mi[10]);
      mn[6].getItems().addAll(mi[11], mi[12]);
      mn[6].getItems().addAll(mi[13]);
      mn[4].getItems().addAll(mn[5]);
      mn[4].getItems().addAll(mi[14],mn[6]);

      mb.getMenus().addAll(mn[0], mn[1], mn[4]);

      BorderPane bp = new BorderPane();

      bp.setTop(mb);
      bp.setCenter(lb);

       for(int i=0; i<mi.length; i++)
      {
         mi[i].setOnAction(new SampleEventHandler()); 
      }

      Scene sc = new Scene(bp, 300, 200);

      stage.setScene(sc);

      stage.setTitle("�T���v��");
      stage.show();
   }

   class SampleEventHandler implements EventHandler<ActionEvent>
   {
      public void handle(ActionEvent e)
      {
         MenuItem tmp =(MenuItem) e.getSource();
         String str = tmp.getText();
         lb.setText(str + "�ł��ˁB");
      }
   }
}
