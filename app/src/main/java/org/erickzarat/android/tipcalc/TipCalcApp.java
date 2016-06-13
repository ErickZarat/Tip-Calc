package org.erickzarat.android.tipcalc;

import android.app.Application;

/**
 * Created by erick on 1/06/16.
 */
public class TipCalcApp extends Application {

    private final String ABOUT_URL = "https://about.me/erickzarat";

    public String getAboutUrl() {
        return ABOUT_URL;
    }


}
