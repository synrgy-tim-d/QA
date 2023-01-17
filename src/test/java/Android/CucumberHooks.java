package Android;

import io.cucumber.java.*;

import java.net.MalformedURLException;

public class CucumberHooks {

    @Before
    public static void beforeAll() throws MalformedURLException, InterruptedException {
        androidMain.setupDriver();
    }

    @After
    public static void afterAll(){
        androidMain.tearDown();
    }


}
