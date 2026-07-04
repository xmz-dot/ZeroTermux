package com.tarmux.zerocore.config.mainmenu.config;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

import com.tarmux.R;
import com.tarmux.app.TermuxActivity;
import com.tarmux.zerocore.back.BackRestoreDialog;
import com.tarmux.zerocore.back.listener.CreateConversationListener;
import com.tarmux.zerocore.config.mainmenu.MainMenuConfig;

// 备份/ 恢复
public class BackupRestoreClickConfig extends BaseMenuClickConfig {
    @Override
    public int getType() {
        return MainMenuConfig.CODE_COMMON_FUNCTIONS;
    }

    @Override
    public Drawable getIcon(Context context) {
        return context.getDrawable(R.mipmap.beifen_ico);
    }

    @Override
    public String getString(Context context) {
        return context.getString(R.string.备份恢复);
    }

    @Override
    public void onClick(View view, Context context) {
//  startActivity(new Intent(this, BackNewActivity.class));
        BackRestoreDialog backRestoreDialog = new BackRestoreDialog(context);
        backRestoreDialog.setCreateConversationListener(new CreateConversationListener() {
            @Override
            public void create() {
                if (context instanceof TermuxActivity) {
                    ((TermuxActivity) context).mTermuxTerminalSessionActivityClient.addNewSession(false, "Zero session");
                }
            }
        });
        backRestoreDialog.initData();
        backRestoreDialog.show();
        backRestoreDialog.setCancelable(true);
        backRestoreDialog.createStoragePath();
    }
}
