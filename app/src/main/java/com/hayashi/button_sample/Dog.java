package com.hayashi.button_sample;

import android.util.Log;

// 犬クラス
public class Dog {

    // インスタンスが持っている変数 = メンバ変数（別名：フィールド）
    private String mName = "";
    private int age = 0;

    // インスタンス関係なくクラス共通の変数はstaticを付ける
    private final static String roar = "ワン";
    private final static String TAG = "----";

    // setter経由で年齢を設定
    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void setName(String name) {
        mName = name;
    }

    // 吠えるメソッド
    public void bark() {
        Log.d(TAG, roar);
    }

    // 自己紹介メソッド
    public void selfIntroduction() {
        Log.d(TAG, "ぼくは" + this.mName + roar + "。");
        Log.d(TAG, this.age + "歳です。");
    }
}
