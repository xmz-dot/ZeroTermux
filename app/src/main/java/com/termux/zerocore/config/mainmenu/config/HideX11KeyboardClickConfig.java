package com.termux.ai.ai.zerocore.config.mainmenu.config;

import static com.termux.ai.zerocore.config.mainmenu.MainMenuConfig.CODE_X11_FEATURES;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

import com.termux.ai.ai.R;
import com.termux.ai.ai.app.TermuxActivity;

public class HideX11KeyboardClickConfig extends BaseMenuClickConfig {
    @Override
    public int getType() {
        return CODE_X11_FEATURES;
    }

    @Override
    public Drawable getIcon(Context context) {
        return context.getDrawable(R.mipmap.x11_keyboard_gone);
    }

    @Override
    public String getString(Context context) {
        return context.getString(R.string.x11_boom_keyboard_gone);
    }

    @Override
    public void onClick(View view, Context context) {
        TermuxActivity termuxActivity = (TermuxActivity) context;
        termuxActivity.x11KeyboardGone();
    }
}
