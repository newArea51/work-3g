package jp.co.ha.auto.dashboard.login;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import jp.co.ha.auto.BaseAutoTest;

/**
 * Login処理の自動テストクラス
 *
 * @since 1.0
 */
public class LoginTest extends BaseAutoTest {

	/**
	 * ログインテスト
	 *
	 * @throws InterruptedException
	 */
	@Test
	public void test() throws InterruptedException {

		LOG.info("#test");
		WebDriver driver = conf.getDriver();
		driver.get(conf.getBaseUrl() + "/login/index");
		WebElement loginIdElement = driver.findElement(By.id("userId"));
		loginIdElement.sendKeys("master");
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("master");
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
		Thread.sleep(3000);
	}

}
