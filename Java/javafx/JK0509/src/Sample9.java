import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;

public class Sample9 extends Application{
   private Canvas cv;
   private double[] xPoints;
   private double[] yPoints;
   private int nPoints = 3;


   public static void main(String[] args){
      launch(args);
   }
   
   public void start(Stage stage)throws Exception{
      cv = new Canvas(300, 200);
      
      xPoints = new double[3];
      yPoints = new double[3];

      GraphicsContext gc = cv.getGraphicsContext2D();

      for(int i=0; i<100; i++){
    	  int r = (int) (Math.random() * 256);
    	  int g = (int) (Math.random() * 256);
    	  int b = (int) (Math.random() * 256);
    	  double x = Math.random() * 300;
    	  double y = Math.random() * 200;
    	  gc.setFill(Color.rgb(r, g, b, 1.0));

    	  xPoints[0] = x;
    	  xPoints[1] = x - 5;
    	  xPoints[2] = x - 10;
    	  yPoints[0] = y;
    	  yPoints[1] = y - 10;
    	  yPoints[2] = y;
    	  gc.fillPolygon(xPoints, yPoints, nPoints);
      }

      BorderPane bp = new BorderPane();

      bp.setCenter(cv);

      Scene sc = new Scene(bp, 300, 200);

      stage.setScene(sc);

      stage.setTitle("ƒTƒ“ƒvƒ‹");
      stage.show();
   }
}
