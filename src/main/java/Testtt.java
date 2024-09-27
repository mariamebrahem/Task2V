import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Testtt {

    WebDriver driver;

    Testtt (WebDriver driver){
        this.driver=driver;
    }

    By selectdepartmentButton = By.xpath("//*[@id=\"fromCity_chosen\"]/a/span");
    By searchbox =By.xpath("//*[@id=\"fromCity_chosen\"]/div/div[1]/input");
    By choosecity = By.cssSelector(".active-result");
    By selectdestination =By.xpath("//*[@id=\"toCity_chosen\"]/a/span");
    By searchboxx =By.xpath("//*[@id=\"toCity_chosen\"]/div/div[1]/input");
    By selectcity = By.xpath("//*[@id=\"toCity_chosen\"]/div/ul/li");
    By choosedateButton =By.xpath("//*[@id=\"departDate\"]");
    By choosedate =By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[2]/td[1]/a");
    By searchBusesbutton =By.xpath("//*[@id=\"submitSearch\"]");
    By selectseatButton =By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div/div/div[5]/div[7]/div");
    By numberofSeat =By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div/div[4]/div[7]");
    By Boardingpoint =By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div");

    By DroppingpointDropdown =By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]");

    By Droppingpoint =By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div");

    By providepassengeDetails =By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]");

    By mobileNo =By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/div[2]/input[2]");
    By EmailID =By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[1]/div[1]/div/div[1]/div[2]/div[3]/input[2]");
    By proceedpassengerDetaios =By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[1]/div[2]");
    By Name =By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[2]/input[2]");
    By genderdropdown = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[3]/input");
    By gender =By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[3]/div/div[3]/div");
    By Age =By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[4]/input[2]");
    By cocessiondropdown =By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[5]/input");
    By concessionkey =By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[5]/div/div[2]/div");
    By idcarddropdown= By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[6]/input");
    By idcard =By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[6]/div/div[2]/div");
    By idcardNo =By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[7]/input[2]");
    By countrydropdown =By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[8]/input");
    By country = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[2]/div[1]/div[2]/div[8]/div/div[2]/div");

    By checkoutButton =By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[4]/section/div/div[2]/div[2]/div[2]");
    By okbutton =By.id("okayButton");
    By checkbox =By.xpath("//*[@id=\"root\"]/div/section/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div");
    By proceedtopass =By.xpath("//*[@id=\"root\"]/div/section/div[2]/div/div/div[2]/div[2]/div[2]");
    public void clickonselect (){
    driver.findElement(selectdepartmentButton).click();
    }

    public void sendkey(String key){
        driver.findElement(searchbox).sendKeys(key);
    }
    public void clickonkey (){
        driver.findElement(choosecity).click();
    }

    public void clickondestination (){
        driver.findElement(selectdestination).click();
    }
    public void sendkeyy(String key){
        driver.findElement(searchboxx).sendKeys(key);
    }
    public void selectcityy (){
        driver.findElement(selectcity).click();
    }
    public void clickonselectdate(){
        driver.findElement(choosedateButton).click();
    }
    public void selectdate(){
        driver.findElement(choosedate).click();
    }
    public void clickonsearchBuses(){
        driver.findElement(searchBusesbutton).click();
    }
    public void clickonselectseat(){
        driver.findElement(selectseatButton).click();
    }
    public void selectnumberofSeat(){
        driver.findElement(numberofSeat).click();
    }
    public void selectBoardingpoint(){
        driver.findElement(Boardingpoint).click();
    }
    public void selectdroppingpoint(){
        driver.findElement(DroppingpointDropdown).click();
    }
    public void choosedroppingpoint(){
        driver.findElement(Droppingpoint).click();
    }
    public void clickonpassengeDeatilsbutton(){
        driver.findElement(providepassengeDetails).click();
    }
    public void enterMobileNo(String number){
        driver.findElement(mobileNo).sendKeys(number);
    }
    public void enteremailID(String emailID){
        driver.findElement(EmailID).sendKeys(emailID);
    }
    public void clickonproceedpassengerButton (){
        driver.findElement(proceedpassengerDetaios).click();
    }
    public void entername(String name){
        driver.findElement(Name).sendKeys(name);
    }
    public void clickongenderdropdown(){
        driver.findElement(genderdropdown).click();
    }
    public void selectgender(){
        driver.findElement(gender).click();
    }
    public void enterage (String age){
        driver.findElement(Age).sendKeys(age);
    }
    public void clickonconcessiondropdown(){
        driver.findElement(cocessiondropdown).click();
    }
    public void selectconcession(){
        driver.findElement(concessionkey).click();
    }
    public void clickonidcard(){
        driver.findElement(idcarddropdown).click();
    }
    public void selectidcard(){
        driver.findElement(idcard).click();
    }
    public void enteridcardNo (String no){
        driver.findElement(idcardNo).sendKeys(no);
    }
    public void clickoncountry(){
        driver.findElement(countrydropdown).click();
    }
    public void selectcountry(){
        driver.findElement(country).click();
    }
    public void clickoncheckoutButton(){
        driver.findElement(checkoutButton).click();
    }
    public void clickonOk(){
        driver.findElement(okbutton).click();
    }
    public void clickoncheckbox (){
        driver.findElement(checkbox).click();
    }
    public void clickonProceedtoPass(){
        driver.findElement(proceedtopass).click();
    }
}

