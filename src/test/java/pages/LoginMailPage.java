package pages;

import control.Button;
import control.CheckBox;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginMailPage {

    public TextBox emailTextBox= new TextBox(By.id("email"),"[email] textbox on Login Mail Page");
    public Button signUpButton= new Button(By.id("step_one_submit"),"[signup] button on Login Mail Page");
    public LoginMailPage(){}

}

