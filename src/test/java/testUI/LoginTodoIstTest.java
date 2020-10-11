package testUI;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.LoginMailPage;
import pages.LoginNamePwdPage;
import pages.MainPage;
import session.Session;

public class LoginTodoIstTest {
    MainPage mainPage = new MainPage();
    LoginMailPage loginMailPage = new LoginMailPage();
    LoginNamePwdPage loginNamePwdPage = new LoginNamePwdPage();
    
    @Before
    public void before(){
        Session.getInstance().getDriver().get("http://todoist.com/es");
    }
    @DisplayName("Verifi thel Login Using User And Password")
    @Description("This rest case is to verifiy the Login Using User And Password")
    @Owner("Hugo Aguirre")
    @Test
    public void verifyTheLoginUsingUserAndPassword() throws InterruptedException {
        mainPage.singUpFreeButton.click();
        loginMailPage.emailTextBox.type("Juanperez@hotmail.com");
        loginMailPage.signUpButton.click();
        loginNamePwdPage.fullNameTextBox.type("Francisco Castro");
        loginNamePwdPage.passwordTextBox.type("loro1234567");
        loginNamePwdPage.signupRegisterButton.click();
        
        // verificamos el logueo
        Thread.sleep(2000);
        Assert.assertFalse("ERROR, el proceso de logueo contiene errores",loginNamePwdPage.signupRegisterButton.isDisplayedOnPage());
    }

    @After
    public void after(){
        Session.getInstance().closeBrowser();
    }

}
