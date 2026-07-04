package com.tarmux.zerocore.config.ztcommand.config;

import com.example.xh_lib.utils.UUtils;
import com.tarmux.R;

public abstract class BaseOkJsonConfig extends SimpleConfig {
    String getOkJson() {
        return getJson(0, UUtils.getString(R.string.成功), "");
    }
    String getJson(int code, String message, String title) {
        return "{\"message\": \"" + message + "\",\"code\": " + code + ",\"title\": \"" + title + "\"}";
    }
}
