package chapter_21.lesson_269.application;

import chapter_21.db.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {
        Connection connection = DB.getConnection();
        DB.closeConnection();
    }
}
