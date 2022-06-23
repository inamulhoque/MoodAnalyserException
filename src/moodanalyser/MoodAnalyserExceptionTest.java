package moodanalyser;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MoodAnalyserExceptionTest {
    MoodAnalyserException obj;
    @BeforeClass
    public void setUP(){
        obj = new MoodAnalyserException("");
    }
    @Test
    public void analyseMoodTest(){
        String mood = obj.analyseMood();
        Assert.assertEquals("Happy",mood);
    }
}
