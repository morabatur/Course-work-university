package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;

public class ControllerSubjectNull {
    @FXML
    private TableView table_subject;
    @FXML
    private TableColumn<SubjectNullPojo, String> subject;



    @FXML
    private void initialize() throws SQLException {

        // устанавливаем тип и значение которое должно хранится в колонке

        subject.setCellValueFactory(new PropertyValueFactory<SubjectNullPojo, String>("subject"));


        setTableDegree();
    }

    private ObservableList<SubjectNullPojo> groupData = FXCollections.observableArrayList();


    private  void setTableDegree(){
        for (int i = 0; i < DataBaseConnector.getSubjectNull().size(); i++) {
            groupData.add(DataBaseConnector.getSubjectNull().get(i));
        }
        table_subject.setItems(groupData);
    }
}
