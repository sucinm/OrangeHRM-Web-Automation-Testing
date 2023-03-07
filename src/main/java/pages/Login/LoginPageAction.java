package pages.Login;

import context.TestContext;

public class LoginPageAction extends LoginPage {
    public LoginPageAction(TestContext testContext) {
        super(testContext);
    }

    public void setUsername(String username){
        inputUsername.sendKeys(username);
    }

    public String getUsername(){
        return inputUsername.getAttribute("value");
    }

    public void setPassword(String password){
        inputPassword.sendKeys(password);
    }

    public String getPassword(){
        return inputPassword.getAttribute("value");
    }

    public void clickLogin(){
        buttonlogin.click();
    }
}