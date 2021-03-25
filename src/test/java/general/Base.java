package general;

import org.openga.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    protected WebDriver driver; //objeto do Selenium WebDriver, vulgo bola
    // Ao usar PageFactory mudar de public para protected
    // criar um construtor e inicializar os elementos do PageFactory

    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, page: this);


    }
}