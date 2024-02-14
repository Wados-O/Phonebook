package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

  @Test
  public void registerExistedUerNegativeTest() {

    click(By.cssSelector("[href='/login"));
    type(By.name("email"), "mezhin@gma.com");

    type(By.name("password"), "manue1234$");

    click(By.name("registration"));

    Assert.assertTrue(isAlertPresent());
  }

}
