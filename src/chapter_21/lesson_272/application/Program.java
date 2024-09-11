package chapter_21.lesson_272.application;

import chapter_21.db.DB;
import chapter_21.db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB.getConnection();

            preparedStatement = connection.prepareStatement(
            "INSERT INTO seller " +
                "(Name, Email, BirthDate, BaseSalary, DepartmentId)" +
                "VALUES " +
                "(?, ?, ?, ?, ?)",
                Statement.RETURN_GENERATED_KEYS
            );

            preparedStatement.setString(1, "Carl Purple");
            preparedStatement.setString(2, "carl@gmail.com");
            preparedStatement.setDate(3, new java.sql.Date(simpleDateFormat.parse("22/04/1985").getTime()));
            preparedStatement.setDouble(4, 3000.0);
            preparedStatement.setInt(5, 4);

            int rowsAffected = preparedStatement.executeUpdate();

            if(rowsAffected > 0){
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                while(resultSet.next()){
                    int id = resultSet.getInt(1);
                    System.out.println("Done! Id = " + id);
                }
            }
            else {
                System.out.println("No rows affected!");
            }
        }
        catch (SQLException | ParseException exception){
            throw new DbException(exception.getMessage());
        }
        finally {
            DB.closeStatement(preparedStatement);
            DB.closeConnection();
        }
    }
}
