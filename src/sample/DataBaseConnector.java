package sample;

import java.sql.*;
import java.util.ArrayList;

public class DataBaseConnector {
    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/ekk-15120";
    private static final String user = "ekk-15120@localhost";
    private static final String password = "";

    // JDBC variables for opening and managing connection
    private static Connection connection = null;
    private static Statement stmt;
    private static ResultSet rs;

    public static void startConnection() throws SQLException {
        System.out.println("-------- MySQL JDBC Connection Testing ------------");

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;
        }

        System.out.println("MySQL JDBC Driver Registered!");


        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/ekk-15120", "ekk-15120", "");

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }


    }

    public static void test(){
        try {
            stmt = connection.createStatement();
            // executing SELECT query
            rs = stmt.executeQuery("SELECT `name` FROM `group`");

            int i = 0;
            while (rs.next()) {
                String name = rs.getString(1);
                System.out.println(name);
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<TeascherPojo> getTeacher() {
        ArrayList<TeascherPojo> vcpj = new ArrayList<>();
        try {
            stmt = connection.createStatement();
            // executing SELECT query
            rs = stmt.executeQuery("SELECT lecturer.name, lecturer.point, degree.name, post.name, lecturer.salary, lecturer.experience\n" +
                    "FROM lecturer\n" +
                    "JOIN degree ON degree.id=lecturer.id_degree\n" +
                    "JOIN post ON post.id=lecturer.id_post");

            int i = 0;
            while (rs.next()) {
                String name = rs.getString(1);
                String poin = rs.getString(2);
                String degree = rs.getString(3);
                String post = rs.getString(4);
                String salary1 = rs.getString(5);
                //String salary = Integer.toString(salary1);
                String expiriens = rs.getString(6);

                vcpj.add(new TeascherPojo(name, poin, degree, post, salary1, expiriens));
                System.out.println(vcpj.get(i).toString());
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vcpj;
    }

    public static ArrayList<LoadPojo> getLoad(){

            ArrayList<LoadPojo> vcpj = new ArrayList<>();
            try {
                stmt = connection.createStatement();
                // executing SELECT query
                rs = stmt.executeQuery("SELECT lecturer.name, subjects.name, `group`.name, `load`.year\n" +
                        "FROM `load`\n" +
                        "JOIN lecturer ON lecturer.id=`load`.id_lecturer\n" +
                        "JOIN subjects ON subjects.id=`load`.id_subjects\n" +
                        "JOIN `group` ON `group`.`id`=`load`.`id_group`");

                int i = 0;
                while (rs.next()) {
                    String name = rs.getString(1);
                    String sub = rs.getString(2);
                    String group = rs.getString(3);
                    String year = rs.getString(4);


                    vcpj.add(new LoadPojo(name, sub, group, year));
                    System.out.println(vcpj.get(i).toString());
                    i++;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return vcpj;

    }

    public static ArrayList<SubjectPojo> getSubject(){

        ArrayList<SubjectPojo> vcpj = new ArrayList<>();
        try {
            stmt = connection.createStatement();
            // executing SELECT query
            rs = stmt.executeQuery("SELECT subjects.name, type.type, type.time FROM type JOIN subjects ON subjects.id=type.id_subjects");

            int i = 0;
            while (rs.next()) {
                String name = rs.getString(1);
                String sub = rs.getString(2);
                String group = rs.getString(3);



                vcpj.add(new SubjectPojo(name, sub, group));
                System.out.println(vcpj.get(i).toString());
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vcpj;

    }

    public static ArrayList<Group2017Pojo> getGroup2017(){

        ArrayList<Group2017Pojo> vcpj = new ArrayList<>();
        try {
            stmt = connection.createStatement();
            // executing SELECT query
            rs = stmt.executeQuery("SELECT * FROM `group_2017`\n");

            int i = 0;
            while (rs.next()) {
                String name = rs.getString(1);
                String sub = rs.getString(2);



                vcpj.add(new Group2017Pojo(name, sub));
                System.out.println(vcpj.get(i).toString());
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vcpj;

    }

    public static ArrayList<LectureDegreePojo> getLectureDegree(){

        ArrayList<LectureDegreePojo> vcpj = new ArrayList<>();
        try {
            stmt = connection.createStatement();
            // executing SELECT query
            rs = stmt.executeQuery("SELECT * FROM `lecturer_degree`\n");

            int i = 0;
            while (rs.next()) {
                String name = rs.getString(1);
                String sub = rs.getString(2);



                vcpj.add(new LectureDegreePojo(name, sub));
                System.out.println(vcpj.get(i).toString());
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vcpj;

    }

    public static ArrayList<LectureReadPojo> getLectureRead(){

        ArrayList<LectureReadPojo> vcpj = new ArrayList<>();
        try {
            stmt = connection.createStatement();
            // executing SELECT query
            rs = stmt.executeQuery("SELECT * FROM `lecturer_read`");

            int i = 0;
            while (rs.next()) {
                String name = rs.getString(1);
                String sub = rs.getString(2);
                String res = rs.getString(3);



                vcpj.add(new LectureReadPojo(name, sub, res));
                System.out.println(vcpj.get(i).toString());
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vcpj;

    }

    public static ArrayList<SubjectNullPojo> getSubjectNull(){

        ArrayList<SubjectNullPojo> vcpj = new ArrayList<>();
        try {
            stmt = connection.createStatement();
            // executing SELECT query
            rs = stmt.executeQuery("SELECT * FROM `subjects_null`");

            int i = 0;
            while (rs.next()) {
                String name = rs.getString(1);




                vcpj.add(new SubjectNullPojo(name));
                System.out.println(vcpj.get(i).toString());
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vcpj;

    }




}
