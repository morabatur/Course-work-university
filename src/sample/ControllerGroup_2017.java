package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;

public class ControllerGroup_2017 {

    @FXML
    private TableView table_group_2017;
    @FXML
    TableColumn<Group2017Pojo, String> teacher;
    @FXML
    TableColumn<Group2017Pojo, String> group;
    @FXML
    private void initialize() throws SQLException {

        // устанавливаем тип и значение которое должно хранится в колонке

        teacher.setCellValueFactory(new PropertyValueFactory<Group2017Pojo, String>("teacher"));
        group.setCellValueFactory(new PropertyValueFactory<Group2017Pojo, String>("group"));

        setTableTeacher();
    }

    private ObservableList<Group2017Pojo> groupData = FXCollections.observableArrayList();


    private  void setTableTeacher(){
        for (int i = 0; i < DataBaseConnector.getGroup2017().size(); i++) {
            groupData.add(DataBaseConnector.getGroup2017().get(i));
        }
        table_group_2017.setItems(groupData);
    }



}
