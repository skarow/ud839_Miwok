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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // create numbers array
        ArrayList<Word > words = new ArrayList<>();

        words.add(new Word("father", "баща"));
        words.add(new Word("mother", "майка"));
        words.add(new Word("brother", "брат"));
        words.add(new Word("sister", "сестра"));
        words.add(new Word("uncle", "чичо"));
        words.add(new Word("aunt", "леля"));
        words.add(new Word("mother in law", "свекърва"));
        words.add(new Word("father in law", "свекър"));

        WordAdaptor adaptor = new WordAdaptor(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adaptor);
    }
}
