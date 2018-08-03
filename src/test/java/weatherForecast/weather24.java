package weatherForecast;

import org.junit.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class weather24 {

    //make the web driver obj
    WebDriver weather24Driver;

    public weather24(WebDriver weather24Driver) {

        this.weather24Driver = weather24Driver;
    }

    public String highSub(String str){
        return str.substring(str.lastIndexOf('-')+2, str.length()-2);
    }

    public String lowSub(String str){
       return str.substring(str.lastIndexOf('y')+2, str.indexOf('C')-1);
    }

    public String getHigh(int day){

        day+=2;
        WebElement element = weather24Driver.findElement(By.xpath("//*[@id='div7DayForecast']/div/div/div["+day+"]"));
        String highDay = element.getText();
        return highSub(highDay);

          }


    public String getLow(int day){

        day+=2;
        WebElement element = weather24Driver.findElement(By.xpath("//*[@id='div7DayForecast']/div/div/div["+day+"]"));
        String lowDay = element.getText();
        return lowSub(lowDay);

    }
}
