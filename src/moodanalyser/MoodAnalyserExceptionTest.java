package moodanalyser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodAnalyserExceptionTest {
    @Test
    public void analyseMoodTest() throws Exception{
        MoodAnalyserException obj = new MoodAnalyserException();
        String mood = obj.analyseMood("I am sad today");
        Assert.assertEquals("sad", mood);
    }
}
