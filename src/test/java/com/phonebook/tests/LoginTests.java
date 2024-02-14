package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests  extends TestBase{
  @Test
  public void loginRegisterUserPositiveTest(){
    click(By.cssSelector("[href='/login']"));
    type(By.name("email"), "mezhin@gma.com");

    type(By.name("password"), "Manue1234$");
    click(By.name("login"));
    Assert.assertTrue(isElementPresent(By.cssSelector("button")));
  }

}
