package Core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    public static final String STAGING_URL = "";

    public static String navigateTimeout;
    public static String headless;

    static {
        Properties props = new Properties();
        try (InputStream input = new FileInputStream("src/main/resources/config.properties")) {
            props.load(input);
            navigateTimeout = props.getProperty("navigateTimeout");
            headless = props.getProperty("headless");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String user_email;
    public static String user_password;


    static {
        Properties props = new Properties();
        try (InputStream input = new FileInputStream("src/main/resources/credentials.properties")) {
            props.load(input);
            user_email = props.getProperty("USER_EMAIL");
            user_password = props.getProperty("USER_PASSWORD");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
