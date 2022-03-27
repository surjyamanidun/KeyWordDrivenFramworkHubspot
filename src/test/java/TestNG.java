import com.KeywordDriven.engine.KeywordEngine;
import org.testng.annotations.Test;

public class TestNG {

    public KeywordEngine keywordEngine;

    @Test
    public void loginTest() {
        keywordEngine = new KeywordEngine();
        keywordEngine.startExecution("login");

    }
    @Test
    public void signUpTest() {
        keywordEngine = new KeywordEngine();
        keywordEngine.startExecution("signUp");
    }
}