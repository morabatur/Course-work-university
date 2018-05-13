package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;

public class ControllerLectureDegree {
    @FXML
    private TableView table_lecture_degree;
    @FXML
    private TableColumn<LectureDegreePojo, String> teacher;
    @FXML
    private TableColumn<LectureDegreePojo, String> degree;

    @FXML
    private void initialize() throws SQLException {

        // устанавливаем тип и значение которое должно хранится в колонке

        teacher.setCellValueFactory(new PropertyValueFactory<LectureDegreePojo, String>("teacher"));
        degree.setCellValueFactory(new PropertyValueFactory<LectureDegreePojo, String>("degree"));

        setTableDegree();
    }

    private ObservableList<LectureDegreePojo> groupData = FXCollections.observableArrayList();


    private  void setTableDegree(){
        for (int i = 0; i < DataBaseConnector.getLectureDegree().size(); i++) {
            groupData.add(DataBaseConnector.getLectureDegree().get(i));
        }
        table_lecture_degree.setItems(groupData);
    }
}
