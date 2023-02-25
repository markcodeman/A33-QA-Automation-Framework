import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// The following are our test cases
public class LoginTests extends BaseTest  {


    @Test(enabled = true, description = "This is our very first test for A33 class the best in the west")
    public void LoginEmptyEmailPasswordTest() {
        setUpBrowser();
        openLoginUrl();
        provideEmail("beststudent@testpro.io");
        tearDownBrowser();

        //Assert.assertEquals(driver.getCurrentUrl(), url);

    }

}
