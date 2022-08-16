package com.example.mynotes;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NotesDetailFragment extends Fragment {
    static private final String ARG_INDEX = "index";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_notes_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null){
            int index = arguments.getInt(ARG_INDEX);
            Notes notes = Notes.note[index];
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            title.setText(notes.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(notes.getDescription());
            TextView date = (TextView) view.findViewById(R.id.textDate);
            date.setText(notes.getDate());
        }
    }
    public static NotesDetailFragment newInstance (int index) {
        NotesDetailFragment fragment = new NotesDetailFragment();
        Bundle args = new Bundle ();
        args.putInt(ARG_INDEX, index);
        fragment.setArguments(args);
        return fragment;
    }
}