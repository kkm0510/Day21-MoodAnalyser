import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenIAmInSadMood_MessageShouldReturnSad(){
        MoodAnalyser analyser=new MoodAnalyser("I am in sad mood");
        try{
            String mood= analyser.analyseMood();
            Assert.assertEquals("SAD", mood);
        }
        catch (MoodAnalysisException e){
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void givenIAmInAnyMood_MessageShouldReturnHappy(){
        MoodAnalyser analyser=new MoodAnalyser("I am in any mood");
        try{
            String mood= analyser.analyseMood();
            Assert.assertEquals("HAPPY", mood);
        }
        catch (MoodAnalysisException e){
            System.out.println(e.getMessage());
        }
    }

    @Test(expected = Exception.class)
    public void givenNullMood_MessageShouldRThrowMoodAnalysisException(){
        MoodAnalyser analyser=new MoodAnalyser(null);
        try{
            analyser.analyseMood();
        }
        catch (MoodAnalysisException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenEmptyMood_MessageShouldRThrowMoodAnalysisException(){
        MoodAnalyser analyser=new MoodAnalyser("");
        try{
            analyser.analyseMood();
        }
        catch (MoodAnalysisException e){
            Assert.assertEquals(MoodAnalysisException.MoodExceptionType.EMPTY, e.type);
        }
    }
}
