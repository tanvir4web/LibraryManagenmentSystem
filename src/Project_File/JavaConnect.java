package Project_File;


/**
 *
 * @author Tanvir
 */

import java.sql.*;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaConnect {
    Connection conn;
    
public static Connection GetConnection()
    {
        try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarymanagementdb", "root","");
    return conn;
    } 
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
        
}
}

    
 