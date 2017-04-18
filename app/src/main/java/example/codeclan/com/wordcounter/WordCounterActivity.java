package example.codeclan.com.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    private TextView textView;
    private EditText wordsEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        wordsEditText = (EditText) findViewById(R.id.sentence_text);
        textView = (TextView) findViewById(R.id.word_count_text);
    }

    public void onButtonClicked(View button){
        String sentenceThatWasGiven = wordsEditText.getText().toString();

        WordCounter wordCounter = new WordCounter(sentenceThatWasGiven);
        int wordCount = wordCounter.getWordCount();

        textView.setText("The count was: " + wordCount);

    }

}
