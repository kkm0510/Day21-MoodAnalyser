public class MoodAnalyser {

    public String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {

    }

    public String analyseMood() throws MoodAnalysisException {
        if(message.length()==0)
            throw new MoodAnalysisException(MoodAnalysisException.MoodExceptionType.EMPTY, "Mood is empty");
        try{
            if (message.equals("I am in sad mood"))
                return "SAD";
            return "HAPPY";
        }
        catch(NullPointerException e){
            throw new MoodAnalysisException(MoodAnalysisException.MoodExceptionType.NULL, "Entered invalid mood");
        }
    }
}
