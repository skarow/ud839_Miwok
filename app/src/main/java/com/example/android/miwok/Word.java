package com.example.android.miwok;

/**
 * Created by default on 4/4/17.
 */

public class Word {

    private String englishWord;

    private String miwokWord;

    private int picResource;

    public Word(String enWord, String bgWord, int picRes) {
        englishWord = enWord;
        miwokWord = bgWord;
        picResource = picRes;
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
    public int getPicResource() {

        return picResource;
    }
}
