package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

public class TeascherPojo {
    private   String  teacher_teachers;
     
    private   String  sex_teachers;
     
    private   String  degree_teachers;
     
    private   String  position_teachers;
     
    private   String  salary_teachers;
     
    private   String  expiriens_teachers;

    public TeascherPojo(String teacher_teachers, String sex_teachers, String degree_teachers, String position_teachers, String salary_teachers, String expiriens_teachers) {
        this.teacher_teachers = teacher_teachers;
        this.sex_teachers = sex_teachers;
        this.degree_teachers = degree_teachers;
        this.position_teachers = position_teachers;
        this.salary_teachers = salary_teachers;
        this.expiriens_teachers = expiriens_teachers;
    }

    public String getTeacher_teachers() {
        return teacher_teachers;
    }

    public void setTeacher_teachers(String teacher_teachers) {
        this.teacher_teachers = teacher_teachers;
    }

    public String getSex_teachers() {
        return sex_teachers;
    }

    public void setSex_teachers(String sex_teachers) {
        this.sex_teachers = sex_teachers;
    }

    public String getDegree_teachers() {
        return degree_teachers;
    }

    public void setDegree_teachers(String degree_teachers) {
        this.degree_teachers = degree_teachers;
    }

    public String getPosition_teachers() {
        return position_teachers;
    }

    public void setPosition_teachers(String position_teachers) {
        this.position_teachers = position_teachers;
    }

    public String getSalary_teachers() {
        return salary_teachers;
    }

    public void setSalary_teachers(String salary_teachers) {
        this.salary_teachers = salary_teachers;
    }

    public String getExpiriens_teachers() {
        return expiriens_teachers;
    }

    public void setExpiriens_teachers(String expiriens_teachers) {
        this.expiriens_teachers = expiriens_teachers;
    }
}
