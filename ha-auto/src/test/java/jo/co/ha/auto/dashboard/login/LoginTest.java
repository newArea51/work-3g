package jo.co.ha.auto.dashboard.login;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import jo.co.ha.auto.BaseAutoTest;

/**
 * Login処理の自動テストクラス
 *
 */
public class LoginTest extends BaseAutoTest {

	@Test
	public void test() throws InterruptedException {

		LOG.info("#test");
		driver.get(BASE_URL + "/ha-dashboard/login/index");
		WebElement loginIdElement = driver.findElement(By.id("userId"));
		loginIdElement.sendKeys("master");
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("master");
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
		Thread.sleep(3000);
	}

}
