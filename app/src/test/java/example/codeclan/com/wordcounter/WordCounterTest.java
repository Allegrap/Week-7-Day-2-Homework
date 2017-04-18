package example.codeclan.com.wordcounter;

import org.junit.Before;

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

    public void canGetWordCount(){
        assertEquals("This is my first sentence", wordCounter.getWordCount());
    }
}
