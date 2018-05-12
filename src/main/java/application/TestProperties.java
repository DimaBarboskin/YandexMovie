package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Rogoza Dimity on 11.05.2018.
 */
public class TestProperties {
        private final Properties properties = new Properties();
        private static application.TestProperties INSTANCE = null;
        private TestProperties() {
            try {
                properties.load(new FileInputStream(new File("./application.properties")));
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static application.TestProperties getInstance() {
            if (INSTANCE == null){
                INSTANCE = new application.TestProperties();
            }
            return INSTANCE;

        }
        public Properties getProperties() {
            return properties;
        }
    }

