package Week6.Sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class JdbcUygulama {
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/employees";
    public static final String DB_USERNAME = "postgres";
    public static final String DB_PASSWORD = "8690mos40";

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            st = conn.createStatement();
            ResultSet resultSet = st.executeQuery("SELECT * FROM employees");
            while (resultSet.next()) {
                System.out.println("ID : " + resultSet.getInt("id"));
                System.out.println("Adı : " + resultSet.getString("name"));
                System.out.println("Soyadı : " + resultSet.getString("position"));
                System.out.println("Salary : " + resultSet.getInt("salary"));
                System.out.println("#################");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}
