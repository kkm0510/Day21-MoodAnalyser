public class MoodAnalyser {

    public String analyseMood(String message){
        if (message.equals("I am in sad mood"))
            return "SAD";
        return "HAPPY";
    }
}
