package db;

import java.sql.*;
import org.h2.jdbcx.JdbcConnectionPool;

public class Test {
    public static void main(String... args) throws Exception {
        JdbcConnectionPool cp = JdbcConnectionPool.create(
                "jdbc:h2:~/test", "sa", "sa");
        for (String sql : args) {
            Connection conn = cp.getConnection();
            conn.createStatement().execute("SELECT * FROM INFORMATION_SCHEMA.USERS");
            conn.close();
        }
        cp.dispose();
    }
}