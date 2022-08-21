/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tvservis1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
/**
 *
 * @author TOMAS
 */
public class MySelenium {

    //class atributes
    private String website = "https://servis.tvservis.mk/login.php";
    private String myDriver = "webdriver.chrome.driver";
    private String driverPath = "C:\\Users\\TOMAS\\Desktop\\chromedriver.exe";
    WebDriver driver;

    //constructor
    public MySelenium() {
        System.setProperty(this.myDriver, this.driverPath);
        this.driver = new ChromeDriver();
        this.driver.navigate().to(this.website);
    }

    public void inputFieldById(String selector, String txt) {
        this.driver.findElement(By.id(selector)).sendKeys(txt);
    }

    public void inputFieldByName(String selector, String txt) {
        this.driver.findElement(By.name(selector)).sendKeys(txt);
    }

    public void inputFieldByXpath(String selector, String txt) {
        this.driver.findElement(By.xpath(selector)).sendKeys(txt);
    }

    public void buttonByName(String selector) {
        this.driver.findElement(By.name(selector)).click();
    }

    public void buttonById(String selector) {
        this.driver.findElement(By.id(selector)).click();
    }

    public void buttonByXpath(String selector) {
        this.driver.findElement(By.xpath(selector)).click();
    }

    public void checkboxByName(String selector) {
        this.driver.findElement(By.name(selector)).click();
    }

    public void checkboxById(String selector) {
        this.driver.findElement(By.id(selector)).click();
    }

    public void checkboxByXpath(String selector) {
        this.driver.findElement(By.xpath(selector)).click();
    }

    public void radiobuttonByName(String selector) {
        this.driver.findElement(By.name(selector)).click();
    }

    public void radiobuttonById(String selector) {
        this.driver.findElement(By.id(selector)).click();
    }

    public void radiobuttonByXpath(String selector) {
        this.driver.findElement(By.xpath(selector)).click();
    }

    public void dropdownSelectorIdByVisibleText(String selector, String label) {
        Select dropdown = new Select(this.driver.findElement(By.id(selector)));
        dropdown.selectByVisibleText(label);
    }

    public void dropdownSelectorNameByVisibleText(String selector, String label) {
        Select dropdown = new Select(this.driver.findElement(By.name(selector)));
        dropdown.selectByVisibleText(label);
    }

    public void dropdownSelectorXpathByVisibleText(String selector, String label) {
        Select dropdown = new Select(this.driver.findElement(By.xpath(selector)));
        dropdown.selectByVisibleText(label);
    }

    public void dropdownSelectorIdByIndex(String selector, int index) {
        Select dropdown = new Select(this.driver.findElement(By.id(selector)));
        dropdown.selectByIndex(index);
    }

    public void dropdownSelectorNameByIndex(String selector, int index) {
        Select dropdown = new Select(this.driver.findElement(By.name(selector)));
        dropdown.selectByIndex(index);
    }

    public void dropdownSelectorXpathByIndex(String selector, int index) {
        Select dropdown = new Select(this.driver.findElement(By.xpath(selector)));
        dropdown.selectByIndex(index);
    }

    public String getElementTextById(String selector) {
        return this.driver.findElement(By.id(selector)).getText();
    }

    public String getElementTextByName(String selector) {
        return this.driver.findElement(By.name(selector)).getText();
    }

    public String getElementTextByXpath(String selector) {
        return this.driver.findElement(By.xpath(selector)).getText();
    }
    public void getDataFromTableByXpath(String selector){
        List<WebElement> listOfElements = this.driver.findElements(By.xpath(selector));
        System.out.println("dolzina "+listOfElements.size());
    }
    public void getDataFromTableByName(String selector){
        List<WebElement> listOfElements = this.driver.findElements(By.name(selector));
        System.out.println("dolzina "+listOfElements.size());
    }
    public void getDataFromTableById(String selector){
        List<WebElement> listOfElements = this.driver.findElements(By.id(selector));
        System.out.println("dolzina "+listOfElements.size());
    }
    public void getDataFromTableByClassName(String selector){
        List<WebElement> listOfElements = this.driver.findElements(By.className(selector));
        System.out.println("dolzina "+listOfElements.size());
        //izmenuvanje
        for (WebElement element : listOfElements) {
            System.out.println("Paragraph text:" + element.getText());
        }
    }
    public void getDataFromTableByCompare(String selector,String findme){
        List<WebElement> listOfElements = this.driver.findElements(By.className(selector));
        System.out.println("dolzina "+listOfElements.size());
        //izmenuvanje
        for (WebElement element : listOfElements) {
            if (findme.equals(element.getText()))
            {
                System.out.println("Success:" + element.getText());
            }
        }
    }
    public void getDataFromTableByid(String selector){
        List<WebElement> listOfElements = this.driver.findElements(By.id(selector));
        System.out.println("dolzina "+listOfElements.size());
        //izmenuvanje
        for (WebElement element : listOfElements) {
            System.out.println("Paragraph text:" + element.getText());
        }
    }
    public void getDataFromTableByxpath(String selector){
        List<WebElement> listOfElements = this.driver.findElements(By.xpath(selector));
        System.out.println("dolzina "+listOfElements.size());
        //izmenuvanje
        for (WebElement element : listOfElements) {
            System.out.println("Paragraph text:" + element.getText());
        }
    }
    public void alertBoxAcceptByName(String selector){
        this.driver.findElement(By.name(selector)).click();
        Alert alert = (Alert) this.driver.switchTo().alert();
        alert.accept();   
    }
    public void alertBoxAcceptById(String selector){
        this.driver.findElement(By.id(selector)).click();
        Alert alert = (Alert) this.driver.switchTo().alert();
        alert.accept();   
    }
    public void alertBoxAcceptByXpath(String selector){
        this.driver.findElement(By.xpath(selector)).click();
        Alert alert = (Alert) this.driver.switchTo().alert();
        alert.accept();   
    }
    public void alertBoxDismissByName(String selector){
        this.driver.findElement(By.name(selector)).click();
        Alert alert = (Alert) this.driver.switchTo().alert();
        alert.dismiss();   
    }
    public void alertBoxDismissById(String selector){
        this.driver.findElement(By.id(selector)).click();
        Alert alert = (Alert) this.driver.switchTo().alert();
        alert.dismiss();   
    }
    public void alertBoxDismissByXpath(String selector){
        this.driver.findElement(By.xpath(selector)).click();
        Alert alert = (Alert) this.driver.switchTo().alert();
        alert.dismiss();   
    }
    public void confirmBoxDismissByName(String selector){
        this.driver.findElement(By.name(selector)).click();
        Alert confirm = (Alert) this.driver.switchTo().alert();
        confirm.dismiss();   
    }
    public void confirmBoxDismissById(String selector){
        this.driver.findElement(By.id(selector)).click();
        Alert confirm = (Alert) this.driver.switchTo().alert();
        confirm.dismiss();   
    }
    public void confirmBoxDismissByXpath(String selector){
        this.driver.findElement(By.xpath(selector)).click();
        Alert confirm = (Alert) this.driver.switchTo().alert();
        confirm.dismiss();   
    }
    public void maximize(){
        driver.manage().window().maximize();
    
}
    
   

}
