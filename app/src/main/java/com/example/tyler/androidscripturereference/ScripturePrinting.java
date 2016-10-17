package com.example.tyler.androidscripturereference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ScripturePrinting extends AppCompatActivity {

    TextView printedScripture, printedScripture2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scripture_printing);

        Bundle extras = getIntent().getExtras();
        String scripture = extras.getString("SCRIPTURE");
        String chapter = extras.getString("CHAPTER");
        String verse = extras.getString("VERSE");
        printedScripture = (TextView) findViewById(R.id.Script);
        printedScripture2 = (TextView) findViewById(R.id.Script2);
        printedScripture2.setText(scripture + " " + chapter + ":" + verse);
    }
}
