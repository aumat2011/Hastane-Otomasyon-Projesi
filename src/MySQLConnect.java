
import java.sql.*;
import javax.swing.*;

public class MySQLConnect {
    Connection conn =null;
    public static Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:2306/hto", "root", "Obi2020.");
            //JOptionPane.showMessageDialog(null, "Yönlendiriliyorsunuz");
            return conn;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}

