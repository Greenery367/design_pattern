package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingle {

    private static Connection instance;

    private ConnectionSingle() {}

    public static synchronized Connection getInstance(String url, String user, String password) {
 
        if (instance == null) {
            try {
                instance = DriverManager.getConnection(url, user, password);
                 System.out.println("MySQL 데이터베이스에 성공적으로 연결되었습니다!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return instance;
    }
}
