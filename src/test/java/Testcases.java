import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Testcases {


    WebDriver driver;
    Testtt Testobj;


    @BeforeMethod
    public void setup(){
        driver =new ChromeDriver();
        Dimension dimension = new Dimension(1024, 768);
        driver.manage().window().setSize(dimension);
        driver.manage().window().maximize();
        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
        Testobj =new Testtt(driver);
    }

    @Test
    public void testcase(){
        Testobj.clickonselect();
        Testobj.sendkey("CHIKKAMAGALURU");
        Testobj.clickonkey();
        Testobj.clickondestination();
        Testobj.sendkeyy("BENGALURU");
        Testobj.selectcityy();
        Testobj.clickonselectdate();
        Testobj.selectdate();
        Testobj.clickonsearchBuses();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Testobj.clickonselectseat();
        Testobj.selectnumberofSeat();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Testobj.selectBoardingpoint();
        Testobj.selectdroppingpoint();
        Testobj.choosedroppingpoint();
        Testobj.clickonpassengeDeatilsbutton();
        Testobj.enterMobileNo("6789125987");
        Testobj.enteremailID("marioma132@gmail.com");
        Testobj.clickonproceedpassengerButton();
        Testobj.entername("mariem");
        Testobj.clickongenderdropdown();
        Testobj.selectgender();
        Testobj.enterage("25");
        Testobj.clickonconcessiondropdown();
        Testobj.selectconcession();
        Testobj.clickonidcard();
        Testobj.selectidcard();
        Testobj.enteridcardNo("1234");
        Testobj.clickoncountry();
        Testobj.selectcountry();
        Testobj.clickoncheckoutButton();
        Testobj.clickonOk();
        Testobj.clickoncheckbox();
        Testobj.clickonProceedtoPass();



    }

    @AfterMethod
    public void quit(){

    }







}
