package edu.dp.sau.lukashevych_daryna.lab_5;

import java.sql.*;
import java.util.Scanner;

public class StudentDatabase {

    private static final String URL = "jdbc:sqlite:C:/Users/Admin/IdeaProjects/Lukashevych_labs_java/src/main/resources/database/mydb.db";

    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection(URL);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter month for student search (1-12): ");
            int monthInput = scanner.nextInt();

            System.out.print("Choose filtering method (1 - SQL, 2 - Java): ");
            int filterMethod = scanner.nextInt();

            if (filterMethod == 1) {
                String query = "SELECT * FROM lab5 WHERE strftime('%m', birth_date) = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, String.format("%02d", monthInput)); // Місяць у двоцифровому форматі
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String lastName = resultSet.getString("last_name");
                    String firstName = resultSet.getString("first_name");
                    String middleName = resultSet.getString("middle_name");
                    String birthDateStr = resultSet.getString("birth_date");
                    java.sql.Date birthDate = java.sql.Date.valueOf(birthDateStr);
                    String studentBookNumber = resultSet.getString("student_book_number");
                    System.out.println(id + ": " + lastName + " " + firstName + " " + middleName +
                            ", Birth Date: " + birthDate + ", Student Book Number: " + studentBookNumber);
                }
                resultSet.close();
                preparedStatement.close();
            } else if (filterMethod == 2) {
                String query = "SELECT * FROM lab5";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String lastName = resultSet.getString("last_name");
                    String firstName = resultSet.getString("first_name");
                    String middleName = resultSet.getString("middle_name");
                    String birthDateStr = resultSet.getString("birth_date");
                    java.sql.Date birthDate = java.sql.Date.valueOf(birthDateStr);
                    String studentBookNumber = resultSet.getString("student_book_number");

                    int month = birthDate.toLocalDate().getMonthValue();

                    if (month == monthInput) {
                        System.out.println(id + ": " + lastName + " " + firstName + " " + middleName +
                                ", Birth Date: " + birthDate + ", Student Book Number: " + studentBookNumber);
                    }
                }
                resultSet.close();
                preparedStatement.close();
            } else {
                System.out.println("Invalid filtering method.");
            }

            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
