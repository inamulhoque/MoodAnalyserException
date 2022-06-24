package moodanalyser;

public class MoodAnalyserException extends Throwable {
    String message;

    public MoodAnalyserException(String message) {
        this.message = message;
    }

    public void MoodAnalyserException(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalyserException{
        try {
            if (this.message.contains(("SAD")) || this.message.contains(("Sad")) || this.message.contains(("sad")))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyserException("Enter valid message, your message is empty");
        }
    }
}