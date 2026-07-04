package com.tarmux.zerocore.config.mainmenu.config

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.View
import com.tarmux.R
import com.tarmux.zerocore.ai.config.ZtBeautifyClearHelper

class ClearStyleClickConfig: BaseMenuClickConfig() {
    override fun getIcon(context: Context?): Drawable? {
        return context?.getDrawable(R.mipmap.clear_style)
    }

    override fun getString(context: Context?): String? {
        return context?.getString(R.string.clear_style_dialog)
    }

    override fun onClick(view: View?, context: Context?) {
        ZtBeautifyClearHelper.clearAndApplyUi()
    }
}
