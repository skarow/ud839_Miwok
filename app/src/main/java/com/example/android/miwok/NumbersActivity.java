/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.IOException;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onStop() {
        super.onStop();
        clickListener.freePlayer();
    }

    WordItemClickListener clickListener = new WordItemClickListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);



        // create numbers array
        ArrayList<Word > words = new ArrayList<>();

        words.add(new Word("one", "едно", R.drawable.number_one, R.raw.number_one));
        words.add(new Word("two", "две", R.drawable.number_two, R.raw.number_two));
        words.add(new Word("three", "три", R.drawable.number_three, R.raw.number_three));
        words.add(new Word("four", "четири", R.drawable.number_four, R.raw.number_four));
        words.add(new Word("five", "пет", R.drawable.number_five, R.raw.number_five));
        words.add(new Word("six", "шест", R.drawable.number_six, R.raw.number_six));
        words.add(new Word("seven", "седем", R.drawable.number_seven, R.raw.number_seven));
        words.add(new Word("eight", "осем", R.drawable.number_eight, R.raw.number_eight));
        words.add(new Word("nine", "девет", R.drawable.number_nine, R.raw.number_nine));
        words.add(new Word("ten", "десет", R.drawable.number_ten, R.raw.number_ten));

        WordAdaptor adaptor = new WordAdaptor(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adaptor);
        int color = getResources().getColor(R.color.category_numbers);
        listView.setBackgroundColor(color);


        listView.setOnItemClickListener(clickListener );
    }
}
