package com.tarmux.zerocore.config.mainmenu.config;

import static com.tarmux.zerocore.config.mainmenu.MainMenuConfig.CODE_COMMON_FUNCTIONS;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

import com.example.xh_lib.utils.UUtils;
import com.tarmux.R;
import com.tarmux.app.TermuxActivity;
import com.termux.x11.MainActivity;
import com.tarmux.zerocore.bean.ZTUserBean;
import com.tarmux.zerocore.ftp.utils.UserSetManage;

public class ShowCommandClickConfig extends BaseMenuClickConfig {
    @Override
    public int getType() {
        return CODE_COMMON_FUNCTIONS;
    }

    @Override
    public Drawable getIcon(Context context) {
        return context.getDrawable(R.mipmap.show_command);
    }

    @Override
    public String getString(Context context) {
        return context.getString(R.string.x11_display_terminal);
    }

    @Override
    public void onClick(View view, Context context) {
        TermuxActivity termuxActivity = (TermuxActivity) context;
        termuxActivity.showTermuxView();
    }

}
