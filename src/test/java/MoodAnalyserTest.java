import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenIAmInSadMood_MessageShouldReturnSad(){
        MoodAnalyser analyser=new MoodAnalyser();
        String mood= analyser.analyseMood("I am in sad mood");
        Assert.assertEquals("SAD", mood);
    }
}
