import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;

public class Sample10 extends Application{
	private Canvas cv;
	private double[] xPoints;
	private double[] yPoints;
	private double[] xMouth;
	private double[] yMouth;
	private double[] xNose;
	private double[] yNose;
	private int nPoints = 9;
	
	public static void main(String[] args){
		launch(args);
	}
	
	public void start(Stage stage)throws Exception{
		
		xPoints = new double[nPoints];
		yPoints = new double[nPoints];
		
		cv = new Canvas(500, 500);

		GraphicsContext gc = cv.getGraphicsContext2D();
		
		//FACE
		xPoints[0] = 40; yPoints[0] = 40;
		xPoints[1] = 80; yPoints[1] = 80;
		xPoints[2] = 240; yPoints[2] = 80;
		xPoints[3] = 280; yPoints[3] = 40;
		xPoints[4] = 280; yPoints[4] = 280;
		xPoints[5] = 240; yPoints[5] = 320;
		xPoints[6] = 80; yPoints[6] = 320;
		xPoints[7] = 40; yPoints[7] = 280;
		xPoints[8] = 40; yPoints[8] = 40;

		gc.setFill(Color.rgb(255, 0, 0, 1.0));
		gc.fillPolygon(xPoints, yPoints, nPoints);

		
		//EYES
		gc.setFill(Color.rgb(0, 255, 255, 1.0)); 
		
		gc.fillOval(80, 120, 40, 40);
		gc.fillOval(200, 120, 40, 40);
		
		
		//MOUTH
		xMouth = new double[4];
		yMouth = new double[4];
		
		xMouth[0] = 110;  yMouth[0] = 260;
		xMouth[1] = 110;  yMouth[1] = 300;
		xMouth[2] = 200; yMouth[2] = 300;
		xMouth[3] = 200; yMouth[3] = 260;
		                 
		gc.setFill(Color.rgb(80, 0, 255, 1.0));
		gc.fillPolygon(xMouth, yMouth, 4);
		
		
		//NOSE
		xNose = new double[4];
		yNose = new double[4];
		
		xNose[0] = 150;  yNose[0] = 180;
		xNose[1] = 150;  yNose[1] = 220;
		xNose[2] = 170; yNose[2] = 220;
		xNose[3] = 170; yNose[3] = 180;
		                 
		gc.setFill(Color.rgb(80, 0, 255, 1.0));
		gc.fillPolygon(xNose, yNose, 4);
		

		BorderPane bp = new BorderPane();

		bp.setCenter(cv);

		Scene sc = new Scene(bp, 600, 500);

		stage.setScene(sc);

		stage.setTitle("ƒTƒ“ƒvƒ‹");
		stage.show();
	}
}