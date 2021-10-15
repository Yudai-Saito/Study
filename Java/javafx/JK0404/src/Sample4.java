import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class Sample4 extends Application
{
   private Label[] lb = new Label[5];
   private Button[] bt = new Button[5];

   public static void main(String[] args)
   {
      launch(args);
   }
   public void start(Stage stage)throws Exception
   {
	   
	  char[] hiragana = {'‚ ', '‚¢', '‚¤', '‚¦', '‚¨'};
      for(int i=0; i<bt.length; i++){
         lb[i] = new Label("    " + Character.valueOf(hiragana[i]));
      }
      
      String[] names = {"‚¢‚Ê", "‚Ë‚±", "‚Æ‚ç", "‚«‚Â‚Ë", "‚Ð‚Â‚¶"};
      
      for(int i=0; i<lb.length; i++){
         bt[i] = new Button(names[i]);
      }

      BorderPane bp = new BorderPane();
      HBox hb = new HBox();
      VBox vb = new VBox();

      for(int i=0; i<lb.length; i++){
         hb.getChildren().add(lb[i]);
      }
      
      for(int i=0; i<bt.length; i++){
         vb.getChildren().add(bt[i]);
      }

      hb.setAlignment(Pos.CENTER);
      vb.setAlignment(Pos.CENTER);

      bp.setTop(hb);
      bp.setCenter(vb);

      Scene sc = new Scene(bp, 300, 200);
      
      stage.setScene(sc);

      stage.setTitle("ƒTƒ“ƒvƒ‹");
      stage.show();
   }
}
