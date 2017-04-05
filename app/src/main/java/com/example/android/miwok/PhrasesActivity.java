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

        words.add(new Word("Yes", "Да"));
        words.add(new Word("No", "Не"));
        words.add(new Word("Hello!", "Здавейте!"));
        words.add(new Word("How are you?", "Как сте?"));
        words.add(new Word("What are you doing?", "Какво правите?"));
        words.add(new Word("What are you feeling?", "Как се чувстваш?"));
        words.add(new Word("I am feeling good?", "Добре съм."));
        words.add(new Word("Are you comming?", "Идваш ли?"));
        words.add(new Word("Yes, I'm coming!", "Да, идвам"));
        words.add(new Word("What is your name?", "Как се казваш?"));
        words.add(new Word("My name is ...", "Казвам се ..."));
        words.add(new Word("How old are you?", "На колко си години?"));
        words.add(new Word("May I order?", "Може ли да поръчам?"));
        words.add(new Word("How much does it cost", "Колко струва?"));
        words.add(new Word("How do I get to ...?", "Как да стигна до ...?"));
        words.add(new Word("Can you help me find ...?", "Можете ли да ми помогнете да стигна до ..."));
        words.add(new Word("How far away is ...", "Колко е далеч ..."));

        WordAdaptor adaptor = new WordAdaptor(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adaptor);
    }
}
