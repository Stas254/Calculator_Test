package ru.astondevs;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTests extends BaseTest{
    @Test
    public void additionTest() {
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='2']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"сложить\"]")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='3']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"равно\"]")).click();
        String result = driver.findElement(By.className("android.widget.TextView")).getText();

        Assert.assertEquals(result, "5");
    }

    @Test
    public void subtractionTest() {
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='9']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"вычесть\"]")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='4']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"равно\"]")).click();
        String result = driver.findElement(By.className("android.widget.TextView")).getText();

        Assert.assertEquals(result, "5");
    }

    @Test
    public void divisionTest() {
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='9']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"разделить\"]")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='3']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"равно\"]")).click();
        String result = driver.findElement(By.className("android.widget.TextView")).getText();

        Assert.assertEquals(result, "3");
    }

    @Test
    public void multiplicationTest() {
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='9']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"умножение\"]")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='9']")).click();
        driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"равно\"]")).click();
        String result = driver.findElement(By.className("android.widget.TextView")).getText();

        Assert.assertEquals(result, "81");
    }
}