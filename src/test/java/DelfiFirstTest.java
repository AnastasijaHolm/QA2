import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DelfiFirstTest {
    private final By HOME_PAGE_ARTICLE = By.xpath(".//h1[contains(@class, 'headline__title')]");
    private final By ARTICLE_PAGE_TITLE = By.xpath(".//h1[contains(@class, 'd-inline')]");
  //  private final By COMMENT_count = By.xpath()
    private final Logger LOGGER = LogManager.getLogger(DelfiFirstTest.class);
    @Test
    public void delfiFirstTitleTest() {
        System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        LOGGER.info("Maximazing window");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        LOGGER.info("Opening Delfi home page");
        driver.get("http://delfi.lv");
        driver.findElements(HOME_PAGE_ARTICLE);
        List<WebElement> arcticles = driver.findElements(HOME_PAGE_ARTICLE);
        for (int i = 0; i < arcticles.size(); i++) {
            if (arcticles.get(i).getText().length() != 0) {
                System.out.println(i + ": " + arcticles.get(i).getText());
             //   List<WebElement> arcticles = arcticles.get(1);
              //arcticles.findElement + (TITLE)
            }

        }
    }
}