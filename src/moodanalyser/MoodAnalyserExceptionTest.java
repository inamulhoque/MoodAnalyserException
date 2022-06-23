package moodanalyser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodAnalyserExceptionTest {
    @Test
    public void analyseMoodTest() throws Exception{
        MoodAnalyserException obj = new MoodAnalyserException("I am in Happy mood");
        String mood = obj.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
}
