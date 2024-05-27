package br.com.zattini.enums;

import br.com.zattini.interfaces.AplicacaoWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public enum Web implements AplicacaoWeb {

    CHROME {
        @Override
        public WebDriver getDriver() {
            return new ChromeDriver();
        }
    },
    ;
}
