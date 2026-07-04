package com.tarmux.zerocore.config.mainmenu.config;

import static com.tarmux.zerocore.config.mainmenu.MainMenuConfig.CODE_X11_FEATURES;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

import com.tarmux.R;
import com.tarmux.app.TermuxActivity;

public class HideCommandClickConfig extends BaseMenuClickConfig {
    @Override
    public int getType() {
        return CODE_X11_FEATURES;
    }

    @Override
    public Drawable getIcon(Context context) {
        return context.getDrawable(R.mipmap.hide_command);
    }

    @Override
    public String getString(Context context) {
        return context.getString(R.string.x11_hide_terminal);
    }

    @Override
    public void onClick(View view, Context context) {
        TermuxActivity termuxActivity = (TermuxActivity) context;
        termuxActivity.hideTermuxView();
    }
}
