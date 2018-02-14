/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionBuilder {

    public static Connection getConnection() {
        Connection conn = null;
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream input = classLoader.getResourceAsStream("config.properties");
        Properties prop = new Properties();
        try {
            prop.load(input);
            String dbIp = prop.getProperty("DB_IP");
            String dbName = prop.getProperty("DB_NAME");
            String dbUsername = prop.getProperty("DB_USER");
            String dbPassword = prop.getProperty("DB_PASS");
            String dbPort = prop.getProperty("DB_PORT");
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://" + dbIp + ":" + dbPort + "/" + dbName + "?user=" + dbUsername + "&password="+ dbPassword);
        } catch (SQLException | ClassCastException | ClassNotFoundException | IOException err) {
            System.err.println(err);
        }
        return conn;
    }
}
