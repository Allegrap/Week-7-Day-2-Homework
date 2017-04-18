package example.codeclan.com.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 18/04/2017.
 */

public class WordCounterTest {

    WordCounter wordCounter;

    @Before
    public void before(){
        wordCounter = new WordCounter("This is my first sentence");
    }

    @Test
    public void canReturnSentenceTest(){
        assertEquals("This is my first sentence", wordCounter.getSentence());
    }

    @Test
    public void canReturnWordCountTest(){
        assertEquals(5, wordCounter.getWordCount());
    }
}
