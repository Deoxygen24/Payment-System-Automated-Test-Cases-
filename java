import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PaymentTest {
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "peter/documents/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void successfulPaymentTest() {
        @Test
public void successfulPaymentTest() {
    // 1. Navigate to the payment page
    driver.get("https://your_payment_system_url");

    // 2. Login (if required)
 
    // 3. Add items to cart

    // 4. Proceed to checkout
    driver.findElement(By.id("checkout_button")).click();

    // 5. Fill payment details
    driver.findElement(By.id("card_number")).sendKeys("valid_card_number");
    driver.findElement(By.id("expiry_date")).sendKeys("12/25");
    driver.findElement(By.id("cvv")).sendKeys("123");

    // 6. Confirm payment
    driver.findElement(By.id("confirm_payment")).click();

    // 7. Verify successful payment
    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("success_message")));
    Assert.assertEquals(successMessage.getText(), "Payment Successful");
}
    }

    @Test
    public void failedPaymentTest() {
        @Test
public void failedPaymentTest() {
    // ... (Repeat steps for successful payment test, but with invalid card details)

    // Verify failed payment message
    WebDriverWait wait = new WebDriverWait(driver, 10);
    WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error_message")));
    Assert.assertEquals(errorMessage.getText(), "Invalid payment details");
}
    }
}
