package weatherForecast;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    WebDriver accuDriver;
    WebDriver weather24Driver;


    @Before
    public void setUp() throws Exception {

        //set up accuweather
        System.setProperty("webdriver.chrome.driver", "C:/Users/Student01/Downloads/chromeDriver/chromedriver.exe");
        accuDriver = new ChromeDriver();

        accuDriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        String accuBaseUrl = "https://www.accuweather.com/en/za/cape-town/306633/daily-weather-forecast/306633";
        accuDriver.get(accuBaseUrl);


        //set up weather 24
        System.setProperty("webdriver.chrome.driver", "C:/Users/Student01/Downloads/chromeDriver/chromedriver.exe");
        weather24Driver = new ChromeDriver();
        weather24Driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        String w24BaseUrl = "http://weather.news24.com/sa/cape-town";
        weather24Driver.get(w24BaseUrl);



    }
/*
    @Test
    public void runA(){

        accuWeather accuObj;
        accuObj = new accuWeather(accuDriver);
        accuObj.findingElements();
        accuObj.getHigh(1);
        accuObj.getLow(1);
    }
*/

    public void runCompare(int testDay){
        accuWeather accuObj;
        accuObj = new accuWeather(accuDriver);
        accuObj.findingElements();

        weather24 obj24;
        obj24 = new weather24(weather24Driver);

        Assert.assertEquals(accuObj.getHigh(testDay), obj24.getHigh(testDay));
    }

    @Test
    public void doTheThing(){
        runCompare(1);
    }

    /*
    @Test
    public void runB(){
        weather24 obj24;
        obj24 = new weather24(weather24Driver);
        System.out.println(obj24.getHigh(1));
        System.out.println(obj24.getLow(1));
    }*/

}
