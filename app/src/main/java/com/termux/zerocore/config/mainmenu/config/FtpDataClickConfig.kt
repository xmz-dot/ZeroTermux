package com.termux.ai.zerocore.config.mainmenu.config

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.View
import com.example.xh_lib.utils.UUtils
import com.termux.ai.R
import com.termux.ai.zerocore.dialog.FtpWindowsDialog

class FtpDataClickConfig: BaseMenuClickConfig() {
    override fun getIcon(context: Context?): Drawable? {
        return context?.getDrawable(R.mipmap.ftp_web)
    }

    override fun getString(context: Context?): String? {
        return context?.getString(R.string.ftp)
    }

    override fun onClick(view: View?, context: Context?) {
        val popupFtpWindows = FtpWindowsDialog(mContext!!)
        popupFtpWindows.show()
    }
}
