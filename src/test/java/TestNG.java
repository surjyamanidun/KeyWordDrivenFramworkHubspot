import com.KeywordDriven.engine.KeywordEngine;
import org.testng.annotations.Test;

public class TestNG {

    public KeywordEngine keywordEngine;

    @Test
    public void loginTest() {
        keywordEngine = new KeywordEngine();
        keywordEngine.startExecution("login");

    }
}