package singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainTest {

    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/shallwe_db1?serverTimezone=Asia/Seoul";
        String name = "root";
        String password = "asd123";
        
        // 싱글톤 객체를 불러와보자!
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = null;
            connection = DriverManager.getConnection(URL,name,password);
            System.out.println("커넥션 완료...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
