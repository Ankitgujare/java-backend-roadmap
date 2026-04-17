package org.example;
import java.sql.*;

public class demojdbc {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        String url="jdbc:postgresql://localhost:5432/mydb";
        String username="postgres";
        String password="1551";
        String query="select name from studentinfo where rollnumber=102";
        //Load the Driver->Optional
        Class.forName("org.postgresql.Driver");
        //Create a connection
        Connection connection=DriverManager.getConnection(url,
                username,
                password);
        Statement st=connection.createStatement();
        System.out.println("Connection Established");
        //to get the data we will use the executeQuery
       ResultSet rs= st.executeQuery(query);
       //we will move the cursor in the current row because its not there currently
        //its residing before the current row
        rs.next();
        String name=rs.getString("name");
        System.out.println(name);
        connection.close();
        System.out.println("Connection closed!");



        //test are we connected
    }
}