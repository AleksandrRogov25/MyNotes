package com.example.mynotes;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NotesDetailFragment extends Fragment {
    private long notesId;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            notesId = savedInstanceState.getLong("workoutId");
        }
        return inflater.inflate(R.layout.fragment_notes_detail, container, false);
    }
    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Notes notes = Notes.note[(int) notesId];
            title.setText(notes.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(notes.getDescription());
            TextView date = (TextView) view.findViewById(R.id.textDate);
            date.setText(notes.getDate());
        }
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("workoutId", notesId);
    }
    public void setNotes(long id) {
        this.notesId = id;
    }
}