package com.tarmux.zerocore.config.mainmenu.config;

import static com.tarmux.zerocore.config.mainmenu.MainMenuConfig.CODE_ONLINE_FEATURES;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

import com.tarmux.R;
import com.tarmux.app.TermuxActivity;
import com.tarmux.zerocore.http.HTTPIP;

public class DownLoadClickConfig extends BaseMenuClickConfig {
    @Override
    public int getType() {
        return CODE_ONLINE_FEATURES;
    }

    @Override
    public Drawable getIcon(Context context) {
        return context.getDrawable(R.mipmap.download_http);
    }

    @Override
    public String getString(Context context) {
        return context.getString(R.string.下载站);
    }

    @Override
    public void onClick(View view, Context context) {
        TermuxActivity termuxActivity = (TermuxActivity) context;
        termuxActivity.startHttp1(HTTPIP.IP + "/repository/main.json");
    }
}
