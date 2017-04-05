package TestNGtests;


import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.github.bonigarcia.wdm.ChromeDriverManager.*;

/**
 * Created by Marchenko on 31.03.2017.
 */
public class CorrectLogin {

    ChromeDriverManager.
    @Test
    public void login(){
        open(ConfigPage.baseUrl+"/");
    }
}
