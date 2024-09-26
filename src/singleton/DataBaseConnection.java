package singleton;

import java.sql.DriverManager;
import java.sql.Connection;

public class DataBaseConnection {

    private static String URL = "jdbc:mysql://localhost:3306/shallwe_db?serverTimezone=Asia/Seoul";
    private static String name = "root";
    private static String password = "asd123";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = null;
            connection = DriverManager.getConnection(URL,name,password);
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}