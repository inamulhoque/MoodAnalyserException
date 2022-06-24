package moodanalyser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodAnalyserExceptionTest {
    @Test
    public void analyseMoodTest(){
        MoodAnalyserException obj = new MoodAnalyserException();
        String mood = obj.analyseMood("I am in Sad mood");
        Assert.assertEquals("SAD", mood);
    }
}
