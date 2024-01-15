package baseAdmin;

import com.aventstack.extentreports.Status;
import user.helpers.ReportManager;
import user.helpers.ScreenshotHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;


public class BaseTestAdmin {

    protected WebDriver driver;
    private String url = "http://localhost:3001";
    private String browser = "chrome";
    private static final Logger log = LogManager.getLogger(BaseTestAdmin.class);

    @BeforeSuite
    public static void setupSuite() throws Exception {
        ReportManager.init("Reports", "Suite de pruebas de administrador");
    }

    @BeforeMethod
    public void setup(ITestResult iTestResult) throws Exception {
        log.info("Starting the configuration method for the test case: " + iTestResult.getMethod().getDescription());
        ReportManager.getInstance().startTest(iTestResult.getMethod().getDescription());
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                throw new Exception(browser + " no soportado");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);
        log.info("Navigate to {}", url);
        ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.INFO, "Redireccionando a login de administrador");
    }

    @AfterMethod
    public void tearDown(ITestResult iTestResult) throws InterruptedException {
        try {
            switch (iTestResult.getStatus()) {
                case ITestResult.FAILURE:
                    ReportManager.getInstance().getTest().log(Status.FAIL, "Test failes");
                    break;
                case ITestResult.SUCCESS:
                    ReportManager.getInstance().getTest().log(Status.PASS, "Test passes");
                    break;
                case ITestResult.SKIP:
                    ReportManager.getInstance().getTest().log(Status.SKIP, "Test skipped");
                    break;
                default:
                    ReportManager.getInstance().getTest().log(Status.FAIL, "Test incomplete");
            }

            if (iTestResult.getStatus() != ITestResult.SUCCESS && iTestResult.getThrowable() != null) {
                ReportManager.getInstance().getTest().log(Status.FAIL, iTestResult.getThrowable().getMessage());
                ScreenshotHelper.takeScreenShotAndAdToHTMLReport(driver, Status.FAIL, "Failure Image");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(driver != null)
                driver.quit();
            log.info("Closing the driver");
            Thread.sleep(1000);
        }
    }

    @AfterSuite
    public static void tearDownSuite() {
        ReportManager.getInstance().flush();
    }



}
