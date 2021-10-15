import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Sample3 extends Application
{
	private Button[][] bt = new Button[3][4];

	public static void main(String[] args)
	{
		launch(args);
	}
	public void start(Stage stage)throws Exception
	{
		char c = 'A';
		for(int i=0; i<bt.length; i++){
			for(int j=0; j<bt[i].length; j++){
				bt[i][j] = new Button("" + Character.valueOf(c));
				c++;
			}
		}

		GridPane gp = new GridPane();

		for(int i=0; i<bt.length; i++){
			for(int j=0; j<bt[i].length; j++){
				gp.add(bt[i][j], j,i);
			}
		}

		Scene sc = new Scene(gp, 300, 200);

		stage.setScene(sc);

		stage.setTitle("ƒTƒ“ƒvƒ‹");
		stage.show();
	}
}