package maven_sleneium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoginTest {

	public static void main(String[] args) {
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.gmail.com");

	}

}
