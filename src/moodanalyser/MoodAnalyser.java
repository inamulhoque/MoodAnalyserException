package moodanalyser;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {
        this.message = null;
    }

    public String analyseMood() throws MoodAnalyserException{
        try {
            if (message.length() == 0) {
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.EmptyMessage,"Please enter valid message. It's empty.");
            }
            if (this.message.contains(("SAD")) || this.message.contains(("Sad")) || this.message.contains(("sad"))){
                return "SAD";
            } else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.NullMessage,"Enter valid message, your message is null.");
        }
    }
}