package sample;

public class LectureReadPojo {

    private String teacher;
    private String group;
    private String subject;

    public LectureReadPojo(String teacher, String group, String subject) {
        this.teacher = teacher;
        this.group = group;
        this.subject = subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
