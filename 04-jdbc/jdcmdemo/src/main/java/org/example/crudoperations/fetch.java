package org.example.crudoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class fetch {
    public static void main(String[] args) throws Exception {
        String url="jdbc:postgresql://localhost:5432/mydb";
        String username="postgres";
        String password="1551";
        //to select multipleRecord
        String query="select name from studentinfo where rollnumber=102";
        //Load the Driver->Optional
        Class.forName("org.postgresql.Driver");
        //Create a connection
        Connection connection= DriverManager.getConnection(url,
                username,
                password);
        System.out.println("Connection created..");
        Statement st=connection.createStatement();
        ResultSet rs= st.executeQuery(query);
        rs.next();
        String name=rs.getString("name");
        System.out.println(name);
        System.out.println("Data inserted");
        connection.close();
    }
}
