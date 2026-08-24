import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/collge",
                "root",
                "parth123");
        System.out.println(con);
        System.out.println("Connection established successfully!");
        con.close();
    }
}
