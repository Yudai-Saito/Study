import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.scene.image.*;

public class Sample6 extends Application
{
	private Label lb;
	private Button[] bt = new Button[5];
	private ToolBar tb;
	private Image im;
	private int num = 0;
	private int num_pre = 0;
	private int num_prepre = 0;

	public static void main(String[] args)
	{
		launch(args);
	}
	
	public void start(Stage stage)throws Exception
	{
		lb = new Label("いらっしゃいませ。");
		tb = new ToolBar();
		im = new Image(getClass().getResourceAsStream("car.jpg"));

		for(int i=0; i<bt.length; i++){
			bt[i] = new Button(); 
			bt[i].setGraphic(new ImageView(im));
		}

		for(int i=0; i<bt.length; i++){
			bt[i].setTooltip(new Tooltip((i+1) + "号車")); 
		}

		tb.getItems().addAll(bt[0], bt[1], new Separator(), bt[2], bt[3], bt[4]);


		BorderPane bp = new BorderPane();

		bp.setTop(tb);
		bp.setCenter(lb);

		for(int i=0; i<bt.length; i++){
			bt[i].setOnAction(new SampleEventHandler()); 
		}

		Scene sc = new Scene(bp, 300, 200);

		stage.setScene(sc);

		stage.setTitle("サンプル");
		stage.show();
	}

	class SampleEventHandler implements EventHandler<ActionEvent>
	{
		public void handle(ActionEvent e)
		{
			Button tmp = (Button) e.getSource();
			
			if(num_pre != 0) {
				num_prepre = num_pre;
				num_pre = num;
			}else if(num != 0){
				num_pre = num;
			}

			if(tmp == bt[0]) {
				num = 1;
			}else if(tmp == bt[1]) {
				num = 2;
			}else if(tmp == bt[2]) {
				num = 3;
			}else if(tmp == bt[3]) {
				num = 4;
			}else if(tmp == bt[4]) {
				num = 5;
			}	

			if(num_prepre != 0){
				lb.setText(num_prepre + "と" + num_pre + "と" + num + "号車ですね。");
			}else if(num_pre != 0){
				lb.setText(num_pre + "と" + num + "号車ですね。");
			}else {
				lb.setText(num + "号車ですね。");
			}
		}
	}
}
