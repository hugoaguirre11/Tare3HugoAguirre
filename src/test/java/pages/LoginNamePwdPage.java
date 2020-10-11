package pages;

import control.Button;
import control.CheckBox;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginNamePwdPage {

    public TextBox fullNameTextBox= new TextBox(By.id("full_name"),"[fullname] textbox on Login Confirm Page");
    public TextBox passwordTextBox= new TextBox(By.id("pwd"),"[password] textbox on Login Confirm Page");
    public Button signupRegisterButton= new Button(By.id("step_two_submit"),"[signup] button on Login Confirm Page");

    public LoginNamePwdPage(){}
}
