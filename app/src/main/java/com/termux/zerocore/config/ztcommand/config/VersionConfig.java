package com.tarmux.zerocore.config.ztcommand.config;

import android.content.Context;

import com.example.xh_lib.utils.UUtils;
import com.tarmux.R;

public class VersionConfig extends SimpleConfig {
    @Override
    public String getCommand(Context context, String command) {
        return UUtils.getString(R.string.zt_command_version);
    }

    @Override
    public int getId() {
        return ZTKeyConstants.ZT_ID_VERSION;
    }
}
