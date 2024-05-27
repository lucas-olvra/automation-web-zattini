package br.com.zattini.common;

import br.com.zattini.interfaces.AplicacaoWeb;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;

    protected void inicializarDriver(AplicacaoWeb aplicacaoWeb) {
        driver = aplicacaoWeb.getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

    }
}
