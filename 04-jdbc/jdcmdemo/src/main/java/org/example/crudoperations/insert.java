package org.example.crudoperations;
import javax.swing.plaf.nimbus.State;
import java.security.spec.ECField;
import java.sql.*;
public class insert {
    public static void main(String[] args) throws Exception {
        String url="jdbc:postgresql://localhost:5432/mydb";
        String username="postgres";
        String password="1551";
        String query="insert into studentinfo values(104,'MCA','Aman')";
        //Load the Driver->Optional
        Class.forName("org.postgresql.Driver");
        //Create a connection
        Connection connection=DriverManager.getConnection(url,
                username,
                password);
        System.out.println("Connection created..");
        Statement st=connection.createStatement();
        st.execute(query);
        System.out.println("Data inserted");
        connection.close();
    }
}
