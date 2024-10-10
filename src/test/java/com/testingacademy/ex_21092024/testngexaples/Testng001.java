package com.testingacademy.ex_21092024.testngexaples;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testng001 {

    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that true  == true ")
    @Test
    public void testcase01(){
        Assert.assertEquals("true","true");
    }


    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify that true ! == false ")
    @Test
    public void testcase02(){
  Assert.assertEquals("true","false");
    }
}