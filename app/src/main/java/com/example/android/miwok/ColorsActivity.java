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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

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

        words.add(new Word("red", "червено", R.drawable.color_red, R.raw.color_red));
        words.add(new Word("green", "зелено", R.drawable.color_green, R.raw.color_green));
        words.add(new Word("black", "черно", R.drawable.color_black, R.raw.color_black));
        words.add(new Word("gray", "сиво", R.drawable.color_gray, R.raw.color_gray));
        words.add(new Word("yellow", "жълто", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        words.add(new Word("white", "бяло", R.drawable.color_white, R.raw.color_white));
        words.add(new Word("dusty yellow", "мръсно жълто", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        words.add(new Word("brown", "кафяво", R.drawable.color_brown, R.raw.color_brown));

        WordAdaptor adaptor = new WordAdaptor(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adaptor);
        int color = getResources().getColor(R.color.category_colors);
        listView.setBackgroundColor(color);

        listView.setOnItemClickListener(clickListener );
    }
}
