import java.net.MalformedURLException;

import org.junit.runner.JUnitCore;


public class Runner {
    public static void main(String[] args) throws MalformedURLException {
        try{
            Driver.createDriver();
            JUnitCore.runClasses(BaseTest.class);
        }finally {
            Driver.killDriver();
        }
    }
}
