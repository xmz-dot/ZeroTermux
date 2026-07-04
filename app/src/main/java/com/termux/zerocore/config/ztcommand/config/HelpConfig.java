package com.termux.ai.zerocore.config.ztcommand.config;

import static com.termux.ai.zerocore.config.ztcommand.config.ZTKeyConstants.ZT_ID_HELP;

import android.content.Context;

import com.example.xh_lib.utils.UUtils;
import com.termux.ai.R;

public class HelpConfig extends SimpleConfig {
    @Override
    public String getCommand(Context context, String command) {
        return UUtils.getString(R.string.zt_command_help);
    }

    @Override
    public int getId() {
        return ZT_ID_HELP;
    }
}
