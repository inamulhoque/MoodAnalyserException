package moodanalyser;

public class MoodAnalyserException {
    public String analyseMood(String message){
        if (message.contains(("sad")) || message.contains(("Sad")) || message.contains(("SAD"))){
            return "Sad";
        } else {
            return "HAPPY";
        }
    }
}
