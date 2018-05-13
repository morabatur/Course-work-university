package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

public class LoadPojo {
    private   String  teacher_load;
     
    private   String  subject_load;
     
    private   String  group_load;
     
    private   String  year_load;

    public LoadPojo(String teacher_load, String subject_load, String group_load, String year_load) {
        this.teacher_load = teacher_load;
        this.subject_load = subject_load;
        this.group_load = group_load;
        this.year_load = year_load;
    }


    public String getTeacher_load() {
        return teacher_load;
    }

    public void setTeacher_load(String teacher_load) {
        this.teacher_load = teacher_load;
    }

    public String getSubject_load() {
        return subject_load;
    }

    public void setSubject_load(String subject_load) {
        this.subject_load = subject_load;
    }

    public String getGroup_load() {
        return group_load;
    }

    public void setGroup_load(String group_load) {
        this.group_load = group_load;
    }

    public String getYear_load() {
        return year_load;
    }

    public void setYear_load(String year_load) {
        this.year_load = year_load;
    }
}
