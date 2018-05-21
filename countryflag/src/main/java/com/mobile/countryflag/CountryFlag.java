package com.mobile.countryflag;

import android.content.Context;
import android.text.TextUtils;

/**
 * Created by joão on 09/02/17.
 */

public class CountryFlag {
    private Context context;

    public CountryFlag(Context context){
        this.context = context;
    }

    public int getFlagByCountryCode(String countrycode){
        if (TextUtils.isEmpty(countrycode))
            return -1;

        String countryCode = countrycode.toLowerCase();

        if (TextUtils.equals(countryCode, "do")) {
            return context.getResources().getIdentifier("do_" , "drawable", context.getPackageName());
        } else if (TextUtils.equals(countryCode, "uk")) {
            return context.getResources().getIdentifier("gb", "drawable", context.getPackageName());
        } else if (TextUtils.equals(countryCode, "gb-eng") || TextUtils.equals(countryCode, "gb_eng")) {
            return context.getResources().getIdentifier("gb_eng", "drawable", context.getPackageName());
        } else if (TextUtils.equals(countryCode, "gb-nir") || TextUtils.equals(countryCode, "gb_nir")) {
            return context.getResources().getIdentifier("gb_nir", "drawable", context.getPackageName());
        } else if (TextUtils.equals(countryCode, "gb-sct") || TextUtils.equals(countryCode, "gb_sct")) {
            return context.getResources().getIdentifier("gb_sct", "drawable", context.getPackageName());
        } else if (TextUtils.equals(countryCode, "gb-wls") || TextUtils.equals(countryCode, "gb_wls")) {
            return context.getResources().getIdentifier("gb_wls", "drawable", context.getPackageName());
        }

        return context.getResources().getIdentifier(countryCode.toLowerCase() , "drawable", context.getPackageName());


    }
}
