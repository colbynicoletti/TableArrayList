package sample;

import java.util.ArrayList;
import java.util.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Controller {

    @FXML
    private TableColumn<?, ?> numGearsCol;

    @FXML
    private TableView<Bike> bikeTable;

  public void initialize(){
    //One option
    ArrayList<Bike> bikesAL = new ArrayList<>();
//    ObservableList<Bike> bikesOL = FXCollections.observableArrayList();

    //Or the other option to create observable list
    ObservableList<Bike> bikes = FXCollections.observableArrayList(bikesAL);

    numGearsCol.setCellValueFactory(new PropertyValueFactory("numGears"));
      bikeTable.setItems(bikes);

    bikes.add(new Bike(12));

  }

}
