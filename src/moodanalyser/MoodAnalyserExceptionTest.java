package moodanalyser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodAnalyserExceptionTest {
    @Test
    public void analyseMoodTest(){
        MoodAnalyserException obj = new MoodAnalyserException("I am in sad mood");
        String mood = obj.analyseMood();
        Assert.assertEquals("SAD",mood);
    }
}
