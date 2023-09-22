package com.amdocs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2001 {
	public static String browser = "Firefox";
	public static WebDriver dr;

	public static void main(String[] args) {
		if(browser.equals("Chrome")) {
			dr=new ChromeDriver();
		}
		else if (browser.equals("Firefox")) {
			dr=new FirefoxDriver();
		}
		else if (browser.equals("Edge")) {
			dr=new EdgeDriver();
		}
		
		dr.get("https://www.google.com");
		dr.manage().window().maximize();
		dr.findElement(By.id("APjFqb")).sendKeys("JR NTR Images");
		dr.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		dr.findElement(By.xpath("/html/body/div[5]/div/div[12]/div/div[2]/div[2]/div/div/div[4]/div/div/div[1]/div/div/span/a/h3")).click();
		dr.findElement(By.xpath("/html/body/main/section/ul/li[16]/figure/a/img")).click();
		dr.findElement(By.cssSelector("a.rtags:nth-child(13)"));
	}

	}

