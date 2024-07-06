package chapter_21.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    private static Connection connection = null;

    private static Properties loadProperties(){
        try(FileInputStream fileInputStream = new FileInputStream("db.properties")){
            Properties properties = new Properties();
            properties.load(fileInputStream);
            return properties;
        }
        catch (IOException ioException){
            throw new DbException(ioException.getMessage());
        }
    }

    public static Connection getConnection() {
        if(connection == null){
            Properties properties = loadProperties();
            String url = properties.getProperty("dburl");

            try {
                connection = DriverManager.getConnection(url, properties);
            }
            catch (SQLException sqlException){
                throw new DbException(sqlException.getMessage());
            }
        }

        return connection;
    }

    public static void closeConnection(){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException exception) {
                throw new DbException(exception.getMessage());
            }
        }
    }
}
