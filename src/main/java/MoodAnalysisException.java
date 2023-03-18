public class MoodAnalysisException extends Exception{

    enum MoodExceptionType{
        NULL, EMPTY;
    }
    MoodExceptionType type;

    public MoodAnalysisException(MoodExceptionType type, String message){
        super(message);
        this.type=type;
    }
}
