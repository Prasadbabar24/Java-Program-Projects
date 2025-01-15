import java.sql.*;

public class JDBC_Demo {
    public static void main(String[] args) throws SQLException {
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
        if (! connection.isClosed()){
            System.out.println("connected to demo database in mysql server");
        }

        // creating a sql statement  and excute
        Statement statement = connection.createStatement();
        statement.execute("insert into empone values(3,'rohit')");
        statement.execute("delete from empone where id=2");

        ResultSet rset = statement.executeQuery("select id,name from empone");
        while (rset.next()){
            int eid = rset.getInt("id");
            String ename = rset.getString("name");
            System.out.println(eid +" "+ ename);
        }

        connection.close();
        if (connection.isClosed()){
            System.out.println("connected to demo database in mysql server is closed");
        }
    }
}
