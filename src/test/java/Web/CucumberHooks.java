package Web;

import Web.webMain;
import io.cucumber.java.*;

import java.net.MalformedURLException;

public class CucumberHooks {

    @Before
    public static void beforeAll() throws MalformedURLException, InterruptedException {
        webMain.setupDriver();
    }

    @After
    public static void afterAll(){
        webMain.tearDown();
    }


}
