package com.tarmux.zerocore.config.mainmenu.config;

import static com.tarmux.zerocore.config.mainmenu.MainMenuConfig.CODE_ZT_FEATURES;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

import com.tarmux.R;
import com.tarmux.zerocore.dialog.SYFunBoomDialog;

public class ExperimentClickConfig extends BaseMenuClickConfig {
    @Override
    public int getType() {
        return CODE_ZT_FEATURES;
    }

    @Override
    public Drawable getIcon(Context context) {
        return context.getDrawable(R.mipmap.shiyan_fun);
    }

    @Override
    public String getString(Context context) {
        return context.getString(R.string.实验功能);
    }

    @Override
    public void onClick(View view, Context context) {
        SYFunBoomDialog syFunBoomDialog = new SYFunBoomDialog(context);
        syFunBoomDialog.show();
        syFunBoomDialog.setCancelable(true);
    }
}
