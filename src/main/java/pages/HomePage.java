package pages;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        setDriver(driver);
        driver.get("https://telranedu.web.app/home");

        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10))
    }

    @FindBy(xpath="//button[text()='LOGIN']")
    
}
