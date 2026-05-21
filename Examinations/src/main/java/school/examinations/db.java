package school.examinations;

import java.sql.Connection;
import java.sql.DriverManager;

public class db{

    private static final String URL =
            "jdbc:mysql://localhost:3306/school_db";

    private static final String USER =
            "root";

    private static final String PASSWORD =
            "rootpassword";

    public static Connection connect() {

        try {

            Connection conn =
                    DriverManager.getConnection(
                            URL,
                            USER,
                            PASSWORD
                    );

            System.out.println(
                    "DATABASE CONNECTED SUCCESSFULLY"
            );

            return conn;

        } catch (Exception e) {

            System.out.println(
                    "DATABASE CONNECTION FAILED"
            );

            e.printStackTrace();

            return null;
        }
    }
}