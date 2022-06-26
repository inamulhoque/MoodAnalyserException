package moodanalyser;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.testng.Assert;

public class MoodAnalyserTest {
    MoodAnalyser obj;

    @Before
    public void setUP() {
        obj = new MoodAnalyser();
    }

    @Test
    public void analyseMood() {
        try {
            ExpectedException e = ExpectedException.none();
            obj.analyseMood();
        }
        catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.NullMessage, e.type);
        }
    }
}