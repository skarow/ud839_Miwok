package com.example.android.miwok;

/**
 * Created by default on 4/4/17.
 */

public class Word {

    private String englishWord;

    private String miwokWord;

    private final int NO_ITEM= -1;

    private int picResource = NO_ITEM;

    private int soundResource = NO_ITEM;

    public Word(String enWord, String bgWord) {
        englishWord = enWord;
        miwokWord = bgWord;
    }

    public Word(String enWord, String bgWord, int picRes) {
        englishWord = enWord;
        miwokWord = bgWord;
        picResource = picRes;

    }

    public Word(String enWord, String bgWord, int picRes, int soundRes) {
        englishWord = enWord;
        miwokWord = bgWord;
        picResource = picRes;
        soundResource = soundRes;
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

    public int getSoundResource() {
        return soundResource;
    }

    public boolean qImageSet() {
        return picResource != NO_ITEM;
    }

    public boolean qSoundSet() {
        return soundResource != NO_ITEM;
    }
}
