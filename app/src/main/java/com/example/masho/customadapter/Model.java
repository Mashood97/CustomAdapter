package com.example.masho.customadapter;

import android.view.Display;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Masho on 7/24/2018.
 */

public class Model {
    private String mTextName;
    private String mTextAge;
    private int mImgRes;

    public Model(String name,String age,int img)
    {
        mTextName = name;
        mTextAge = age;
        mImgRes = img;
    }
    public String getmTextName() {
        return mTextName;
    }

    public String getmTextAge() {
        return mTextAge;
    }

    public int getmImgRes() {
        return mImgRes;
    }
}
