public class MoodAnalyser {

    public String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {

    }

    public String analyseMood() {
        try{
            if (message.equals("I am in sad mood"))
                return "SAD";
            return "HAPPY";
        }
        catch(Exception e){
            return "HAPPY";
        }

    }
}
