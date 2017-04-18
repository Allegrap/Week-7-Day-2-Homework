package example.codeclan.com.wordcounter;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 18/04/2017.
 */

public class WordCounter {

    public void canGetWordCount(){
        assertEquals("This is my first sentence", wordCounter.getWordCount());
    }
}
