package com.termux.ai.ai.zerocore.ai.provider;

import com.example.xh_lib.utils.UUtils;
import com.termux.ai.ai.R;
import com.termux.ai.ai.zerocore.ai.llm.utils.CodeStringUtils;


final class ProviderErrorUtils {
    private ProviderErrorUtils() {
    }

    static String formatError(int statusCode, String providerMessage) {
        if (providerMessage == null || providerMessage.isEmpty()) {
            providerMessage = "HTTP " + statusCode;
        }
        return UUtils.getString(R.string.deepseek_input_key_error_start_info)
            + "\n\n```" + providerMessage + "```\n\n"
            + CodeStringUtils.getCodeString(statusCode);
    }
}
