package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by default on 4/5/17.
 */

public class WordAdaptor extends ArrayAdapter<Word> {

    public WordAdaptor(Activity context, ArrayList<Word> words) {
        super(context, 0,  words);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null ) {
            listItemView = LayoutInflater.from(getContext()).inflate( R.layout.word_list_view, parent, false );
        }

        // get {@link Word} object located at this position on the list
        Word currentWord = getItem(position);

        // miwok word in the layout
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_word);
        miwokTextView.setText(currentWord.getMiwokWord());

        // english word in layout
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_word);
        englishTextView.setText(currentWord.getEnglishWord());

        return listItemView;
    }
}
