package com.example.android.miwok;

/**
 * Created by default on 4/4/17.
 */

public class Word {

    private String englishWord;

    private String miwokWord;

    public Word(String enWord, String bgWord) {
        englishWord = enWord;
        miwokWord = bgWord;
    }

    /**
     * get
     */
    public String getEnglishWord() {
        return englishWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }
}
