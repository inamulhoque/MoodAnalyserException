package moodanalyser;

public class MoodAnalyserException extends Exception{
    public enum ExceptionType{
        NullMessage,EmptyMessage;
    }
    public ExceptionType type;
    public MoodAnalyserException(ExceptionType type, String message){
        super(message);
        this.type = type;
    }
}
