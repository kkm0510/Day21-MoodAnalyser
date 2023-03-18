import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenIAmInSadMood_MessageShouldReturnSad(){
        MoodAnalyser analyser=new MoodAnalyser("I am in sad mood");
        String mood= analyser.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenIAmInAnyMood_MessageShouldReturnHappy(){
        MoodAnalyser analyser=new MoodAnalyser("I am in any mood");
        String mood= analyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNullMood_MessageShouldReturnHappy(){
        MoodAnalyser analyser=new MoodAnalyser(null);
        String mood= analyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}
