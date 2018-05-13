package sample;

public class LectureDegreePojo {

    private String teacher;
    private String degree;

    public LectureDegreePojo(String teacher, String degree) {
        this.teacher = teacher;
        this.degree = degree;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
