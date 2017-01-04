package com.kubilaykocabal.android.kisilistesi;

/**
 * Created by user on 29.12.2016.
 */

public class person {
    public String mkisi_ad;
    public int mkisi_yas;

    public String getMkisi_ad() {
        return mkisi_ad;
    }

    public int getMkisi_yas() {
        return mkisi_yas;
    }
    public person(String ad,int yas){
        mkisi_ad=ad;
        mkisi_yas=yas;
    }
    public person(){

    }
}
