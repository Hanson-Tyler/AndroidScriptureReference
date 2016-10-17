package com.example.tyler.androidscripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText scripture, chapter, verse;
    Button shareButton;
    Intent shareButtonIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    public void initialize(){
        scripture = (EditText) findViewById(R.id.editText);
        chapter = (EditText) findViewById(R.id.editText2);
        verse = (EditText) findViewById(R.id.editText3);
        shareButton = (Button)findViewById(R.id.button1);
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String scriptureName = scripture.getText().toString();
                String chapterName = chapter.getText().toString();
                String verseName = verse.getText().toString();
                shareButtonIntent = new Intent(MainActivity.this, ScripturePrinting.class);
                shareButtonIntent.putExtra("SCRIPTURE", scriptureName);
                shareButtonIntent.putExtra("CHAPTER", chapterName);
                shareButtonIntent.putExtra("VERSE", verseName);
                startActivity(shareButtonIntent);
            }
        });
    }
}
