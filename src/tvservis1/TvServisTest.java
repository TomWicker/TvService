/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tvservis1;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;

/**
 *
 * @author TOMAS
 */
public class TvServisTest extends MySelenium {

    public void Login() {
        super.inputFieldById("username", "test");
        super.inputFieldById("password", "test");
        super.buttonByXpath("/html/body/main/section/div/div/div/div/form/div[3]/button");
        super.maximize();
        String expected = "Здраво, Test";
            String actual = super.getElementTextByXpath("/html/body/main/div[1]/h1");
            System.out.println(actual);
            Assert.assertEquals(actual, expected);
            System.out.println("Login succsess");

    }
    public void newServiceForm(){
        try{
        this.Login();
        Thread.sleep(2000);
        super.buttonById("forms-tab");
        Thread.sleep(2000);
        super.buttonByXpath("/html/body/nav[2]/div[1]/div[2]/div/div/div/div/ul/li[2]/div[1]/ul/li/a");
        super.inputFieldById("name", "Tomi");
        super.inputFieldById("tel", "078292128");
        super.inputFieldById("address", "zagrebska 7a");
        super.buttonById("dataPriemDenes");
        super.dropdownSelectorIdByVisibleText("product", "ТВ");
        super.inputFieldById("serialNO", "007");
        super.inputFieldById("defekt", "glasa za francuskiot predlog");
        super.radiobuttonById("kabel");
        super.buttonByXpath("/html/body/main/div/form/div/div[3]/div/button");
        Thread.sleep(2000);
        String expected = "Налогот е креиран!";
            String actual = super.getElementTextByXpath("/html/body/div/div/h2");
            System.out.println(actual);
            Assert.assertEquals(actual, expected);
            System.out.println("New service form succsess");
            Thread.sleep(2000);
            super.buttonByXpath("/html/body/div/div/div[6]/button[1]");
            Thread.sleep(2000);
            super.buttonById("forms-tab");
            Thread.sleep(1000);
            super.buttonByXpath("/html/body/nav[2]/div[1]/div[2]/div/div/div/div/ul/li[2]/div[2]/ul/li/a");
            super.getDataFromTableByXpath("/html/body/main/div/div[2]/table/tbody/tr[1]");
            System.out.println("New warrant exists");
        
        }
        catch (InterruptedException ex) 
        {
            Logger.getLogger(TvServisTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void new_contact(){
        try{
        this.Login();
        this.buttonByXpath("/html/body/nav[2]/div[1]/div[2]/div/div/div/div/ul/li[5]/span");
        Thread.sleep(2000);
        this.buttonByXpath("/html/body/nav[2]/div[1]/div[2]/div/div/div/div/ul/li[5]/div[1]/ul/li/a/span");
        this.inputFieldById("new_name", "Tomi");
        this.inputFieldById("new_full_name", "Tomi QA majstor eFtino");
        this.inputFieldById("new_person", "Tomislav Karovski");
        this.inputFieldById("new_address", "Zagrebska 7a");
        this.inputFieldById("new_city", "Skopje");
        this.inputFieldById("new_state", "Makedonija");
        this.inputFieldById("new_tel", "078292128");
        this.inputFieldById("new_emdb", "007");
        this.buttonByXpath("/html/body/main/div/div/div/div/form/button");
        Thread.sleep(2000);
        super.getDataFromTableById("5");
        System.out.println("New contact success");
        
        }
        catch (InterruptedException ex) 
        {
            Logger.getLogger(TvServisTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void New_part_in_stock(){
        try{
        this.Login();
        super.buttonByXpath("/html/body/nav[2]/div[1]/div[2]/div/div/div/div/ul/li[4]/span");
        Thread.sleep(2000);
        super.buttonByXpath("/html/body/nav[2]/div[1]/div[2]/div/div/div/div/ul/li[4]/div[2]/ul/li/a");
        Thread.sleep(2000);
        super.inputFieldById("name", "ekran");
        super.dropdownSelectorIdByVisibleText("type", "ТВ");
        super.inputFieldById("location", "daleku");
        super.inputFieldById("stock", "1");
        super.buttonByXpath("/html/body/main/div/div/div/form/div[7]/button");
        Thread.sleep(2000);
        super.buttonByXpath("/html/body/div/div/div[6]/button[1]");
        Thread.sleep(2000);
        String expected = "Успешно!";
            String actual = super.getElementTextById("swal2-title");
            System.out.println(actual);
            Assert.assertEquals(actual, expected);
            System.out.println("New part in tock succsess");
        Thread.sleep(2000);
        super.buttonByXpath("/html/body/div/div/div[6]/button[1]");
        Thread.sleep(2000);
        super.buttonByXpath("/html/body/main/div/div/div/form/div[7]/a");
        Thread.sleep(2000);
        super.getDataFromTableByxpath("/html/body/main/div/div/div[5]/div/div[2]/table/tbody/tr[2]/td[1]");
        System.out.println("New part in stock exists");
        }
        catch (InterruptedException ex) 
        {
            Logger.getLogger(TvServisTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
