package com.example.toanbnguyen.appiumlearn;

import android.widget.EditText;
import android.widget.RadioButton;

import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Created by toanbnguyen on 4/26/2016.
 */

public class AppiumTest {
    AppiumDriver driver;

    @Before
    public void testCaseSetup()throws  Exception
    {
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
        cap.setCapability(MobileCapabilityType.APP, "C://Users/toanbnguyen/AndroidStudioProjects/SampleTest/app/build/outputs/apk/app-debug.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }

    @Test
    public void testcase1() throws  Exception
    {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        MobileElement buttonGo = (MobileElement) driver.findElementById("btnTestEdt");
        buttonGo.click();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        MobileElement edtUser = (MobileElement) driver.findElementById("edtUsername");
        edtUser.clear();
        edtUser.sendKeys("Toan Nguyen");
        MobileElement edtPass = (MobileElement) driver.findElementById("edtPassword");
        edtPass.clear();
        edtPass.sendKeys("toannguyen");

        // Assert.assertEquals(edtPass.getText(), "toannguyen");

        MobileElement buttonLog = (MobileElement) driver.findElementById("btnLogIn");
        buttonLog.click();

        MobileElement buttonBack = (MobileElement) driver.findElementById("btnBack");
        buttonBack.click();
    }

    @Test
    public void testcase2() throws  Exception
    {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        MobileElement buttonGo = (MobileElement) driver.findElementById("btnTestBtn");
        buttonGo.click();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        MobileElement btn1 = (MobileElement) driver.findElementById("btnNum1");
        MobileElement btn2 = (MobileElement) driver.findElementById("btnNum2");
        MobileElement btn3 = (MobileElement) driver.findElementById("btnNum3");

        btn1.click(); // +1
        btn2.click(); // +2
        btn3.click(); // +3
        btn2.click(); // +2
        btn1.click(); // +1
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        MobileElement tvNum = (MobileElement) driver.findElementById("tvNum");
        int result = Integer.parseInt(tvNum.getText());
        Assert.assertEquals(result, 9);

        MobileElement buttonBack = (MobileElement) driver.findElementById("btnBack");
        buttonBack.click();
    }

    @Test
    public void testcase3() throws  Exception
    {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        MobileElement buttonGo = (MobileElement) driver.findElementById("btnTestRdb");
        buttonGo.click();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        MobileElement rdb1 = (MobileElement) driver.findElementById("rdb1");
        MobileElement rdb2 = (MobileElement) driver.findElementById("rdb2");
        MobileElement rdb3 = (MobileElement) driver.findElementById("rdb3");

        MobileElement buttonChoose = (MobileElement) driver.findElementById("btnChoose");
        buttonChoose.click();

        rdb2.click();
        buttonChoose.click();

        rdb3.click();
        buttonChoose.click();

        MobileElement buttonBack = (MobileElement) driver.findElementById("btnBack");
        buttonBack.click();
    }

    @Test
    public void testcase4() throws  Exception
    {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        MobileElement buttonGo = (MobileElement) driver.findElementById("btnTestChb");
        buttonGo.click();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        MobileElement chb1 = (MobileElement) driver.findElementById("chb1");
        MobileElement chb2 = (MobileElement) driver.findElementById("chb2");
        MobileElement chb3 = (MobileElement) driver.findElementById("chb3");
        MobileElement chb4 = (MobileElement) driver.findElementById("chb4");

        MobileElement buttonChoose = (MobileElement) driver.findElementById("btnChoose");

        chb1.click();
        buttonChoose.click();

        chb2.click();
        buttonChoose.click();

        chb1.click();
        chb4.click();
        buttonChoose.click();

        chb1.click();
        chb3.click();
        buttonChoose.click();

        MobileElement buttonBack = (MobileElement) driver.findElementById("btnBack");
        buttonBack.click();
    }

    @Test
    public void testcase5() throws  Exception
    {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        MobileElement buttonGo = (MobileElement) driver.findElementsById("btnTestSpn").get(0);
        buttonGo.click();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        AndroidElement spin = (AndroidElement) driver.findElementById("spinner");
        spin.click();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        AndroidElement drop = (AndroidElement) driver.findElementsByName("Toan");
        drop.click();

        MobileElement buttonBack = (MobileElement) driver.findElementById("btnBack");
        buttonBack.click();
    }

    @After
    public void testCaseTearDown()
    {
        driver.quit();
    }
}
