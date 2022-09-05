package generic;

public class CommonSteps extends BrowserSpecification{

    public static void navigateToPage(String url) {
        getDriver();
        driver.navigate().to(url);
    }
}
