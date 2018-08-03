package weatherForecast;

import org.junit.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class accuWeather {

//make the web driver obj
WebDriver accuDriver;

    public accuWeather(WebDriver accuDriver) {

        this.accuDriver = accuDriver;
    }


List<WebElement> elements;


//create constructor

public void findingElements(){
    elements = accuDriver.findElements(By.xpath("//*[@id=\"panel-main\"]/div[2]/div/div/div[2]/ul/li"));
}

public String subHigh(String str){
    return str.substring(0,str.length()-1);
}

public String subLow(String str){
    return str.substring(1, str.length()-1);
}

public String getHigh(int day){
    String dailyHigh = elements.get(day).findElement(By.className("large-temp")).getAttribute("innerHTML");
    return subHigh(dailyHigh);
}

public String getLow(int day){
    String dailyLow = elements.get(day).findElement(By.className("small-temp")).getAttribute("innerHTML");
    return subLow(dailyLow);
}

//make the methods to get the temp
    /*
public void firstDay(){
    // Get day 1 html
    String day1H =
    String day1L = elements.get(1).findElement(By.className("small-temp")).getAttribute("innerHTML");
    String high1 = day1H.substring(0,day1H.length()-1);
    String low1 = day1L.substring(1, day1L.length()-1);
    System.out.println(high1);
    System.out.println(low1);


}

    public void secondDay(){

        // Get day 2 html
        String day2H = elements.get(2).findElement(By.className("large-temp")).getAttribute("innerHTML");
        String day2L = elements.get(2).findElement(By.className("small-temp")).getAttribute("innerHTML");
        String high2 = day2H.substring(0,day2H.length()-1);
        String low2 = day2L.substring(1, day2L.length()-1);
        System.out.println(high2);
        System.out.println(low2);
    }

    public void thirdDay(){

        // Get day 3 html
        String day3H = elements.get(3).findElement(By.className("large-temp")).getAttribute("innerHTML");
        String day3L = elements.get(3).findElement(By.className("small-temp")).getAttribute("innerHTML");
        String high3 = day3H.substring(0,day3H.length()-1);
        String low3 = day3L.substring(1, day3L.length()-1);
        System.out.println(high3);
        System.out.println(low3);
    }

    public void fourthDay(){

        // Get day 4 html
        String day4H = elements.get(4).findElement(By.className("large-temp")).getAttribute("innerHTML");
        String day4L = elements.get(4).findElement(By.className("small-temp")).getAttribute("innerHTML");
        String high4 = day4H.substring(0,day4H.length()-1);
        String low4 = day4L.substring(1, day4L.length()-1);
        System.out.println(high4);
        System.out.println(low4);
    }

*/

}
