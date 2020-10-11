package pages;

import control.Button;
import org.openqa.selenium.By;

public class MainPage {

    public Button singUpFreeButton= new Button(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/header/nav/div/ul[2]/li[2]/a"),"[singUp Free] Button on Main Page");

    public MainPage(){}


}
