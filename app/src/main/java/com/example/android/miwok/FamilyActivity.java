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

public class FamilyActivity extends AppCompatActivity {

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

        words.add(new Word("father", "баща", R.drawable.family_father, R.raw.family_father));
        words.add(new Word("mother", "майка", R.drawable.family_mother, R.raw.family_mother));
        words.add(new Word("grandfather", "дядо", R.drawable.family_grandfather, R.raw.family_grandfather));
        words.add(new Word("grandmother", "майка", R.drawable.family_grandmother, R.raw.family_grandmother));
        words.add(new Word("brother", "брат", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        words.add(new Word("sister", "сестра", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        words.add(new Word("uncle", "чичо", R.drawable.family_older_brother, R.raw.family_older_brother));
        words.add(new Word("aunt", "леля", R.drawable.family_older_sister, R.raw.family_older_brother));
        words.add(new Word("son", "син", R.drawable.family_son, R.raw.family_son));
        words.add(new Word("daughter", "дъщеря", R.drawable.family_daughter, R.raw.family_daughter));

        WordAdaptor adaptor = new WordAdaptor(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adaptor);
        int color = getResources().getColor(R.color.category_family);
        listView.setBackgroundColor(color);

        listView.setOnItemClickListener(clickListener );
    }
}
