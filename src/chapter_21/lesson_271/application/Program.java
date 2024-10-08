package chapter_21.lesson_271.application;

import chapter_21.db.DB;
import chapter_21.db.DbException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DB.getConnection();

            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM department");

            while (resultSet.next()){
                System.out.println(resultSet.getInt("Id") + " - " + resultSet.getString("Name"));
            }
        }
        catch(SQLException sqlException){
            throw new DbException(sqlException.getMessage());
        }
        finally {
            DB.closeResultSet(resultSet);
            DB.closeStatement(statement);
            DB.closeConnection();
        }
    }

}
