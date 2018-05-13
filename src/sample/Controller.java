package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class Controller {
    @FXML
    private TableView table_teacher;
    @FXML
    private TableColumn<TeascherPojo, String> teacher_teachers;
    @FXML
    private TableColumn<TeascherPojo, String> sex_teachers;
    @FXML
    private TableColumn<TeascherPojo, String> degree_teachers;
    @FXML
    private TableColumn<TeascherPojo, String> position_teachers;
    @FXML
    private TableColumn<TeascherPojo, String> salary_teachers;
    @FXML
    private TableColumn<TeascherPojo, String> expiriens_teachers;
    /*
    ===============================================================
     */
    @FXML
    private TableView table_subject;
    @FXML
    private TableColumn<SubjectPojo, String> subjects_subjects;
    @FXML
    private TableColumn<SubjectPojo, String> type_subjects;
    @FXML
    private TableColumn<SubjectPojo, String> time_subjects;
    /*
    =================================================================
    */
    @FXML
    private TableView table_load;
    @FXML
    private TableColumn<LoadPojo, String> teacher_load;
    @FXML
    private TableColumn<LoadPojo, String> subject_load;
    @FXML
    private TableColumn<LoadPojo, String> group_load;
    @FXML
    private TableColumn<LoadPojo, String> year_load;


    @FXML
    private void initialize() throws SQLException {

        // устанавливаем тип и значение которое должно хранится в колонке

        teacher_teachers.setCellValueFactory(new PropertyValueFactory<TeascherPojo, String>("teacher_teachers"));
        sex_teachers.setCellValueFactory(new PropertyValueFactory<TeascherPojo, String>("sex_teachers"));
        degree_teachers.setCellValueFactory(new PropertyValueFactory<TeascherPojo, String>("degree_teachers"));
        position_teachers.setCellValueFactory(new PropertyValueFactory<TeascherPojo, String>("position_teachers"));
        salary_teachers.setCellValueFactory(new PropertyValueFactory<TeascherPojo, String>("salary_teachers"));
        expiriens_teachers.setCellValueFactory(new PropertyValueFactory<TeascherPojo, String>("expiriens_teachers"));

        /*
        ==============================
         */
        subjects_subjects.setCellValueFactory(new PropertyValueFactory<SubjectPojo, String>("subjects_subjects"));
        type_subjects.setCellValueFactory(new PropertyValueFactory<SubjectPojo, String>("type_subjects"));
        time_subjects.setCellValueFactory(new PropertyValueFactory<SubjectPojo, String>("time_subjects"));

        /*
        ==============================
         */

        teacher_load.setCellValueFactory(new PropertyValueFactory<LoadPojo, String>("teacher_load"));
        subject_load.setCellValueFactory(new PropertyValueFactory<LoadPojo, String>("subject_load"));
        group_load.setCellValueFactory(new PropertyValueFactory<LoadPojo, String>("group_load"));
        year_load.setCellValueFactory(new PropertyValueFactory<LoadPojo, String>("year_load"));


        DataBaseConnector.startConnection();
        try {
            Thread.sleep(100);
            setTableTeacher();
            setLoad();
            setSubject();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       //DataBaseConnector.test();

    }
    private  void setTableTeacher(){
        for (int i = 0; i < DataBaseConnector.getTeacher().size(); i++) {
            teacherData.add(DataBaseConnector.getTeacher().get(i));
        }
        table_teacher.setItems(teacherData);
    }


    private  void setLoad(){
        for (int i = 0; i < DataBaseConnector.getLoad().size(); i++) {
            loadData.add(DataBaseConnector.getLoad().get(i));
        }
        table_load.setItems(loadData);
    }

    private  void setSubject(){
        for (int i = 0; i < DataBaseConnector.getSubject().size(); i++) {
            subjectData.add(DataBaseConnector.getSubject().get(i));
        }
        table_subject.setItems(subjectData);
    }

    private ObservableList<LoadPojo> loadData = FXCollections.observableArrayList();
    private ObservableList<TeascherPojo> teacherData = FXCollections.observableArrayList();
    private ObservableList<SubjectPojo> subjectData = FXCollections.observableArrayList();




    public void callGroup(ActionEvent actionEvent) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("group_2017.fxml"));
            Stage stg = new Stage();
            stg.setScene(new Scene(root, 600, 400));
            stg.setTitle("Group");
            stg.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void callPredmets(ActionEvent actionEvent) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("subjects_null.fxml"));
            Stage stg = new Stage();
            stg.setScene(new Scene(root, 600, 400));
            stg.setTitle("Subjects");
            stg.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void callStage(ActionEvent actionEvent) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("lecturer_degree.fxml"));
            Stage stg = new Stage();
            stg.setScene(new Scene(root, 600, 400));
            stg.setTitle("Degree");
            stg.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void teacherRead(ActionEvent actionEvent) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("lecturer_read.fxml"));
            Stage stg = new Stage();
            stg.setScene(new Scene(root, 600, 400));
            stg.setTitle("Read");
            stg.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void callAuthor(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Автор проекту");
        alert.setHeaderText("Бондар Анастасія Владиславівна");
        alert.setContentText("Національний університет біоресурсів і природокористування України \n " +
                "Факультет інформаційних технологоій\n" +
                "Група ЕКК-1507\n" +
                "3 курс");

        alert.showAndWait();

    }


}
