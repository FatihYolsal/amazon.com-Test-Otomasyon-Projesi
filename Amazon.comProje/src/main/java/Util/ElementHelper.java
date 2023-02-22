package Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementHelper {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    public ElementHelper(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.actions = new Actions(driver);
    }

    public WebElement mevcutEleman(By key){
        return
                wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }

    public WebElement elemanBul(By key){
        WebElement element = mevcutEleman(key);
        return element;
    }
    public void click(By key){
        elemanBul(key).click();
    }
    public void anahtarGonder(By key,String text){
        elemanBul(key).sendKeys(text);
    }
    public void Kontrolet(By key){
        wait.until(ExpectedConditions.visibilityOf(elemanBul(key)));
    }

}
