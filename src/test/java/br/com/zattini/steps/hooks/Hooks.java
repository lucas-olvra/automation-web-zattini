package br.com.zattini.steps.hooks;

import br.com.zattini.common.BaseTest;
import br.com.zattini.enums.Web;
import org.junit.After;
import org.junit.Before;

public class Hooks extends BaseTest {

    @Before
    public void beforeTest(){
        super.inicializarDriver(Web.CHROME);
    }

    @After
    public void afterTest(){
        driver.quit();
    }
}
