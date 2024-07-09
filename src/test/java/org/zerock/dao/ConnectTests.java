package org.zerock.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConnectTests {

//    @Test
//    public void test1() {
//        int v1 = 10;
//        int v2 = 20;
//
//        Assertions.assertEquals(v1, v2);
//    }

    @Test
    public void testConnection() throws Exception {
        Class.forName("org.mariadb.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mariadb://localhost:3306/webdb",
                "webuser",
                "webuser"
        );

//        PreparedStatement statement = connection.prepareStatement("select * from tbl_todo");

        Assertions.assertNotNull(connection);

        connection.close();
    }
}
