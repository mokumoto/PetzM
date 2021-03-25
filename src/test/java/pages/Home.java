package pages;

import org.openqa.selenium.support.FindBy;

public class Home extends Base {
// 1- Mapeamento de Elementos
    @FindBy(id="search")
    private WebElement txtInputSearch;

    @FindBy(css = "button-search")
    private WebElement btnSearch;

// 2- Construtor

public Home(WebDriver driver){

    super(driver);
}
// 3 - Ações dos Elementos
    public void search(String product) {
        txtInputSearch.click(); // clicar na caixa de pesquisa
        txtInputSearch.clear(); //limpar o conteúdo da caixa de texto
        txtInputSearch.sendKeys(product); //ESCREVE na caixa de texto
    }
    public void searchWithMagnifierButton(String product){
       search(product);
       btnSearch.click();

    public void searchWithEnter(String product){
            search(product);
            txtInputSear.sendKeys(Keys.ENTER);
    }

}
