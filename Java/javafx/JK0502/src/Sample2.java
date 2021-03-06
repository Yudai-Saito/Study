import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.collections.*;
import javafx.geometry.Pos;
import javafx.beans.value.*;

public class Sample2 extends Application
{
	private Label lb;
	private ListView<String> lv1, lv2;
	private String item;
	private String price;

	public static void main(String[] args)
	{
		launch(args);
	}

	public void start(Stage stage)throws Exception
	{
		lb = new Label("いらっしゃいませ。");
		lv1 = new ListView<String>();
		lv2 = new ListView<String>();

		ObservableList<String> ol1 = 
				FXCollections.observableArrayList("10000円〜30000円", "31000円〜100000円", "110000円〜300000円");
		lv1.setItems(ol1);

		ObservableList<String> ol2 = 
				FXCollections.observableArrayList("トランペット", "ホルン", "ドラム");
		lv2.setItems(ol2);

		BorderPane bp = new BorderPane();

		bp.setLeft(lb);
		bp.setCenter(lv1);
		bp.setRight(lv2);
		
		BorderPane.setAlignment(lb, Pos.CENTER);

		lv1.getSelectionModel().selectedItemProperty().addListener(new SampleChangeListener());
		lv2.getSelectionModel().selectedItemProperty().addListener(new SampleChangeListener2());

		Scene sc = new Scene(bp, 300, 200);

		stage.setScene(sc);

		stage.setTitle("サンプル");
		stage.show();
	}

	class SampleChangeListener implements ChangeListener<String>
	{
		public void changed(ObservableValue ob, String bs, String as)
		{
			price = as;
			if(item == null) {
				lb.setText("商品を選択してください。");
			}else {
				lb.setText(price + "の" + item + "ですね");
			}
		}
	}

	class SampleChangeListener2 implements ChangeListener<String>
	{
		public void changed(ObservableValue ob, String bs, String as)
		{
			item = as;
			if(price == null) {
				lb.setText(item + "ですね。");
			}else {
				lb.setText(price + "の" + item + "ですね");
			}
		} 
	}
}
