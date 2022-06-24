package moodanalyser;

public class MoodAnalyserException extends Throwable {
    String message;

    public MoodAnalyserException(String message) {
        this.message = message;
    }
    public MoodAnalyserException(){
        this.message = null;
    }

    public String analyseMood() {
        if (message.contains(("sad")) || message.contains(("Sad")) || message.contains(("SAD")))
            return "SAD";
        else
            return "HAPPY";
    }
}