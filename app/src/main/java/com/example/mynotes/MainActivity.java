package com.example.mynotes;

import androidx.appcompat.app.AppCompatActivity;
import android.content.res.Configuration;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NotesFragment notesFragment = new NotesFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, notesFragment)
                .commit();

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            NotesDetailFragment notesDetailFragment = NotesDetailFragment.newInstance(0);
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.notes_detail, notesDetailFragment)
                    .commit();
        }
    }
}