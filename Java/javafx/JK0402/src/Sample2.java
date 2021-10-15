import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Sample2 extends Application
{
   private Button[] bt = new Button[10];

   public static void main(String[] args)
   {
      launch(args);
   }
   public void start(Stage stage)throws Exception
   {
	  char c = 'A';
      for(int i=0; i<bt.length; i++){
         bt[i] = new Button("" + Character.valueOf(c));
         c++;
      }

      FlowPane fp = new FlowPane();

      for(int i=0; i<bt.length; i++){
         fp.getChildren().add(bt[i]);
      }

      Scene sc = new Scene(fp, 300, 100);

      stage.setScene(sc);

      stage.setTitle("ƒTƒ“ƒvƒ‹");
      stage.show();
   }
}
