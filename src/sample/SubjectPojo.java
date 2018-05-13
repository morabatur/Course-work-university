package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class SubjectPojo {


    private String subjects_subjects;

    private String type_subjects;

    private String time_subjects;

    public SubjectPojo(String subjects_subjects, String type_subjects, String time_subjects) {
        this.subjects_subjects = subjects_subjects;
        this.type_subjects = type_subjects;
        this.time_subjects = time_subjects;
    }

    public String getSubjects_subjects() {
        return subjects_subjects;
    }

    public void setSubjects_subjects(String subjects_subjects) {
        this.subjects_subjects = subjects_subjects;
    }

    public String getType_subjects() {
        return type_subjects;
    }

    public void setType_subjects(String type_subjects) {
        this.type_subjects = type_subjects;
    }

    public String getTime_subjects() {
        return time_subjects;
    }

    public void setTime_subjects(String time_subjects) {
        this.time_subjects = time_subjects;
    }
}
