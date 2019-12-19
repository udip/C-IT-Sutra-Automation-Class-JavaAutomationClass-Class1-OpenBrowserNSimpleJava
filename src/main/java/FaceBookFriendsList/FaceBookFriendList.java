package FaceBookFriendsList;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FaceBookFriendList {
    @Test
    public void Facebook() throws IOException, InterruptedException{
       /* String email = "";
        String pwd = "";
        int expectedFriendsList = 806;

        InputStream input = new FileInputStream("config.properties");
        Properties prop = new Properties();
        prop.load(input);

        email = prop.getProperty("facebook_email");
        pwd = prop.getProperty("facebook_pwd");*/

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable.notifications");
        WebDriver wd = new ChromeDriver(options);
        wd.manage().window().maximize();
        wd.get("https://www.facebook.com");

    }
}
