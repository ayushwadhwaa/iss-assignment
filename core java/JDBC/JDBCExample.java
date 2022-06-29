import java.sql.*;
 
public class JDBCExample {
    public static void main(String arg[])
    {
        Connection connection = null;
        try {
            String dbUrl = "jdbc:mysql://localhost:3306/testdb";
            String userName = "ayush";
            String password = "abcd1234";
            String dbDriver = "com.mysql.jdbc.Driver";
            // below two lines are used for connectivity.
            Class.forName(dbDriver);
            connection = DriverManager.getConnection(dbUrl, userName, password);
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                "select * from users");
            int code;
            String title;
            while (resultSet.next()) {
                code = resultSet.getInt("id");
                title = resultSet.getString("name").trim();
                System.out.println("id : " + code
                                   + " name : " + title);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
    } 
} 