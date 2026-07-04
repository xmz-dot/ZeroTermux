package com.tarmux.zerocore.config.mainmenu.config;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

import com.example.xh_lib.utils.UUtils;
import com.tarmux.R;
import com.tarmux.app.TermuxActivity;
import com.tarmux.zerocore.code.CodeString;
import com.tarmux.zerocore.config.mainmenu.MainMenuConfig;
import com.tarmux.zerocore.dialog.SwitchDialog;
import com.tarmux.zerocore.utermux_windows.qemu.dialog.EndDialog;

// MOE全能
public class MoeClickConfig extends BaseMenuClickConfig {
    @Override
    public int getType() {
        return MainMenuConfig.CODE_COMMON_FUNCTIONS;
    }

    @Override
    public Drawable getIcon(Context context) {
        return context.getDrawable(R.mipmap.moe_ico);
    }

    @Override
    public String getString(Context context) {
        return context.getString(R.string.MOE全能);
    }

    @Override
    public void onClick(View view, Context context) {
        SwitchDialog switchDialog = switchDialogShow(UUtils.getString(R.string.警告), UUtils.getString(R.string.zt_moe_remove), context);
        switchDialog.getCancel().setOnClickListener(v1 -> switchDialog.dismiss());
        switchDialog.getOk().setOnClickListener(v12 -> {
            switchDialog.dismiss();
            com.tarmux.zerocore.utils.SingletonCommunicationUtils.getInstance().getmSingletonCommunicationListener().sendTextToTerminal(CodeString.INSTANCE.getRunMoeSh());
        });
    }
}
