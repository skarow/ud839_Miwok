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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // create numbers array
        ArrayList<Word > words = new ArrayList<>();

        words.add(new Word("Yes", "Да", 0));
        words.add(new Word("No", "Не", 0));
        words.add(new Word("Hello!", "Здавейте!",0));
        words.add(new Word("How are you?", "Как сте?",0));
        words.add(new Word("What are you doing?", "Какво правите?",0));
        words.add(new Word("What are you feeling?", "Как се чувстваш?",0));
        words.add(new Word("I am feeling good?", "Добре съм.",0));
        words.add(new Word("Are you comming?", "Идваш ли?",0));
        words.add(new Word("Yes, I'm coming!", "Да, идвам",0));
        words.add(new Word("What is your name?", "Как се казваш?",0));
        words.add(new Word("My name is ...", "Казвам се ...",0));
        words.add(new Word("How old are you?", "На колко си години?",0));
        words.add(new Word("May I order?", "Може ли да поръчам?",0));
        words.add(new Word("How much does it cost", "Колко струва?",0));
        words.add(new Word("How do I get to ...?", "Как да стигна до ...?",0));
        words.add(new Word("Can you help me find ...?", "Можете ли да ми помогнете да стигна до ...",0));
        words.add(new Word("How far away is ...", "Колко е далеч ...",0));

        WordAdaptor adaptor = new WordAdaptor(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adaptor);
        int color = getResources().getColor(R.color.category_phrases);
        listView.setBackgroundColor(color);
    }
}
