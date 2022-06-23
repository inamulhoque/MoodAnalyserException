package moodanalyser;

public class MoodAnalyserException extends Throwable {
    String message;

    public MoodAnalyserException(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (message.contains(("sad")) || message.contains(("Sad")) || message.contains(("SAD")))
                return "Sad";
            else
                return "Happy";
        } catch (NullPointerException e) {
            return null;
        }
    }
}