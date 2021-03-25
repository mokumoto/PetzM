package general;

import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {


public Hooks(Base base){
    super(base.driver);
    this.base = base;
}
//before
    @Before
public void setup() {
        //onde está o driver do browser
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/88/chromedriver.exe");
        //Instanciar o driver do Chrome
        base.driver = new ChromeDriver();

        //maximizar a tela
        base.driver.manage().timeouts().implicityWait(60000, TimeUnit.MILLISECONDS);

    }

@after
public void tearDown(){
    base.driver.quit();
}