package com.testingacademy.ex_21092024.testngexaples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG006 {
    @Test(groups = {"sanity", "qa","prepod"})
    public void sanityRun() {
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }

    @Test(groups = {"qa","prepod","reg"})
    public void RegRun() {
        System.out.println("Reg");
        Assert.assertTrue(false);
    }

    @Test(groups = {"dev", "stage"})
    public void SmokeRun() {
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }
}
