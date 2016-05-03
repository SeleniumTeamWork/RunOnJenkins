package navigate;

import base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by Shahida Lucky on 4/29/2016.
 */
public class Login extends CommonAPI {

    @Test
    public void test() throws InterruptedException {
        Thread.sleep(2000);
        clickById("username","kawsar184");
        Thread.sleep(2000);
        clickById("pwd","mdkHH101");
       // Thread.sleep(2000);
        clickByXpath(".//*[@id='find-submit']");
        Thread.sleep(4000);


    }
}
