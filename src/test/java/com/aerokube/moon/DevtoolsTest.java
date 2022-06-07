package com.aerokube.moon;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.HasDevTools;
import org.openqa.selenium.devtools.NetworkInterceptor;
import org.openqa.selenium.devtools.v95.log.Log;
import org.openqa.selenium.devtools.v95.runtime.Runtime;
import org.openqa.selenium.devtools.v95.network.Network;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.http.HttpResponse;
import org.openqa.selenium.remote.http.Route;


import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.util.Optional.empty;
import static org.openqa.selenium.remote.http.Contents.utf8String;

class DevtoolsTest {

    private WebDriver driver;

    @BeforeEach
    void setUp() throws Exception {
        ChromeOptions capabilities = new ChromeOptions();
        capabilities.setBrowserVersion("95.0");
        driver = new RemoteWebDriver(new URL("http://ae237c6ca107348b4b5abfd82048e0ce-557739715.us-east-2.elb.amazonaws.com:4444/wd/hub"), capabilities);
        driver = new Augmenter().augment(driver);
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    @Test
    void Test1() {
		driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Tsoft");
        driver.findElement(By.name("q")).submit();


		
		
	
	}


    
    }
