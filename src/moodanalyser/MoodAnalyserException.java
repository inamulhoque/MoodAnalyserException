package moodanalyser;

public class MoodAnalyserException {
    String message;
    public MoodAnalyserException(String message) {
        super();
        this.message = message;
    }

    public String analyseMood(){
        if (message.contains(("sad")) || message.contains(("Sad")) || message.contains(("SAD"))){
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}
