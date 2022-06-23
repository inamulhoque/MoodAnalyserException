package moodanalyser;

public class MoodAnalyserException {
    public String analyseMood(String message){
        if (message.contains(("sad"))){
            return "sad";
        } else {
            return "happy";
        }
    }
}
