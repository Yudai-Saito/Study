import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.control.cell.*;
import javafx.collections.*;
import javafx.beans.property.*;

public class Sample3 extends Application
{
   private Label lb;
   private TableView<RowData> tv;

   public static void main(String[] args)
   {
      launch(args);
   }
   public void start(Stage stage)throws Exception
   {
      lb = new Label("��������Ⴂ�܂��B");
      tv = new TableView<RowData>();
      
      TableColumn<RowData, String> tc1 = new TableColumn<RowData, String>("�Ԗ�");
      TableColumn<RowData, String> tc2 = new TableColumn<RowData, String>("���i");
      TableColumn<RowData, String> tc3 = new TableColumn<RowData, String>("����");
      TableColumn<RowData, String> tc4 = new TableColumn<RowData, String>("�^�]��");

      tc1.setCellValueFactory(new PropertyValueFactory<RowData, String>("name"));
      tc2.setCellValueFactory(new PropertyValueFactory<RowData, String>("price"));
      tc3.setCellValueFactory(new PropertyValueFactory<RowData, String>("date"));
      tc4.setCellValueFactory(new PropertyValueFactory<RowData, String>("driver"));

      ObservableList<RowData> ol = FXCollections.observableArrayList();
      ol.add(new RowData("��p��", 1200,"10-01", "�얼"));
      ol.add(new RowData("�g���b�N", 2400,"10-05", "��"));
      ol.add(new RowData("�I�[�v���J�[", 3600,"10-06", "���{"));
      ol.add(new RowData("�^�N�V�[", 2500,"10-10", "����"));
      ol.add(new RowData("�X�|�[�c�J�[", 2600,"10-11", "��t"));
      ol.add(new RowData("�~�j�J�[", 300,"10-12", "���X��"));
      ol.add(new RowData("���]��", 800,"10-15", "�Έ�"));
      ol.add(new RowData("�O�֎�", 600,"10-18", "���J"));

      tv.getColumns().add(tc1);
      tv.getColumns().add(tc2);
      tv.getColumns().add(tc3);
      tv.getColumns().add(tc4);
   
      tv.setItems(ol);

      BorderPane bp = new BorderPane();

      bp.setTop(lb);
      bp.setCenter(tv);

      Scene sc = new Scene(bp, 300, 200);

      stage.setScene(sc);

      stage.setTitle("�T���v��");
      stage.show();
   }

   public class RowData
   {
      private final SimpleStringProperty name;
      private final SimpleIntegerProperty price;
      private final SimpleStringProperty date;
      private final SimpleStringProperty driver;

      public RowData(String n, Integer p, String d, String g)
      {
         this.name = new SimpleStringProperty(n);
         this.price = new SimpleIntegerProperty(p);
         this.date = new SimpleStringProperty(d);
         this.driver = new SimpleStringProperty(g);
      }
       public StringProperty nameProperty(){return name;}
       public IntegerProperty priceProperty(){return price;}
       public StringProperty dateProperty(){return date;}
       public StringProperty driverProperty(){return driver;}
   }
}
