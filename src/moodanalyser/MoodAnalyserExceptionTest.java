package moodanalyser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoodAnalyserExceptionTest {
    @Test
    public void analyseMoodTest(){
        MoodAnalyserException obj = new MoodAnalyserException();
        String message= obj.analyseMood("I am in any mood");
        Assert.assertEquals("HAPPY", message);
    }
}
