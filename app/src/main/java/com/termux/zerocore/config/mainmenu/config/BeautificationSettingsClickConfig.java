package com.tarmux.zerocore.config.mainmenu.config;

import static com.tarmux.zerocore.config.mainmenu.MainMenuConfig.CODE_BEAUTIFICATION_FUNCTION;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

import com.tarmux.R;
import com.tarmux.app.TermuxActivity;

public class BeautificationSettingsClickConfig extends BaseMenuClickConfig {
    @Override
    public int getType() {
        return CODE_BEAUTIFICATION_FUNCTION;
    }

    @Override
    public Drawable getIcon(Context context) {
        return context.getDrawable(R.mipmap.meihua_all);
    }

    @Override
    public String getString(Context context) {
        return context.getString(R.string.美化设置);
    }

    @Override
    public void onClick(View view, Context context) {
        TermuxActivity termuxActivity = (TermuxActivity) context;
        termuxActivity.beautifySettings();
    }
}
