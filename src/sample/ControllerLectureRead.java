package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;

public class ControllerLectureRead {
    @FXML
    private TableView table_lecture_read;
    @FXML
    private TableColumn<LectureReadPojo, String> teacher;
    @FXML
    private TableColumn<LectureReadPojo, String> group;
    @FXML
    private TableColumn<LectureReadPojo, String> subject;
    

    @FXML
    private void initialize() throws SQLException {

        // устанавливаем тип и значение которое должно хранится в колонке

        teacher.setCellValueFactory(new PropertyValueFactory<LectureReadPojo, String>("teacher"));
        group.setCellValueFactory(new PropertyValueFactory<LectureReadPojo, String>("group"));
        subject.setCellValueFactory(new PropertyValueFactory<LectureReadPojo, String>("subject"));

        setTableDegree();
    }

    private ObservableList<LectureReadPojo> groupData = FXCollections.observableArrayList();


    private  void setTableDegree(){
        for (int i = 0; i < DataBaseConnector.getLectureRead().size(); i++) {
            groupData.add(DataBaseConnector.getLectureRead().get(i));
        }
        table_lecture_read.setItems(groupData);
    }
}
