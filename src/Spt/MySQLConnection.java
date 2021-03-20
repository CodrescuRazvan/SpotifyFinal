package Spt;

import java.sql.*;

public class MySQLConnection {

    public MySQLConnection() {
    }

    public void  initConnection(String text, int ok) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            System.err.println("An Exception occured during JDBC Driver loading." + " Details are provided below:");
            ex.printStackTrace(System.err);
        }

        Connection connection = null;
        Statement callStatement = null;
        Statement selectStatement = null;
        ResultSet rs = null;
        ResultSetMetaData rsmd = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/Spotify?user=root&password=davidnoob1999");
            if (ok == 1) {
                callStatement = connection.createStatement();
                callStatement.execute(text);
            } else if (ok == 2) {
                selectStatement = connection.createStatement();
                selectStatement.execute("select * from Song;");
                rs = selectStatement.getResultSet();
                rsmd = rs.getMetaData();
                System.out.println("There are " + rsmd.getColumnCount() + " columns in the result set:");
                for (int i = 1; i <= rsmd.getColumnCount(); i++)
                    System.out.println("\t Column " + (i) + " is " + rsmd.getColumnName(i));
                int rowCount = 0;
                while(rs.next()){
                    System.out.println((++rowCount) + " " + rs.getString("ID") + " " + rs.getString("Title") + " " + rs.getString("Artist ID") + " " + rs.getString("Song URL") + " " + rs.getString("Album Name"));
                }
            }
        }
        catch(SQLException sqlex) {
            System.err.println("An SQL Exception occured. Details are provided below:");
            sqlex.printStackTrace(System.err);
        }
        finally {
            if (callStatement != null) {
                try {
                    callStatement.close();
                }
                catch (SQLException e) {}
                callStatement = null;
            }

            if (connection != null) {
                try {
                    connection.close();
                }
                catch(SQLException e) {}
                connection = null;
            }
        }
    }
}
