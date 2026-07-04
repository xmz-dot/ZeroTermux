package com.termux.ai.zerocore.config.ztcommand.config;

import android.content.Context;

import com.termux.ai.zerocore.config.ztcommand.ZTSocketService;

public abstract class SimpleConfig implements ZTConfig {
    @Override
    public boolean isForWard() {
        return false;
    }

    @Override
    public String getCommandForWard(Context context, String command) {
        return "";
    }

    @Override
    public void sendSocketMessage(ZTSocketService.ClientHandler clientHandler, Context context) {

    }
}
