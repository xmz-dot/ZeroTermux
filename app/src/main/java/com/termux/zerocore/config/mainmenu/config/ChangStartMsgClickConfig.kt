package com.tarmux.zerocore.config.mainmenu.config

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.view.View
import com.example.xh_lib.utils.UUtils
import com.tarmux.R
import com.tarmux.app.TermuxActivity
import com.tarmux.zerocore.activity.EditTextActivity
import com.tarmux.zerocore.code.CodeString
import com.tarmux.zerocore.url.FileUrl
import java.io.File

class ChangStartMsgClickConfig: BaseMenuClickConfig() {
    override fun getIcon(context: Context?): Drawable? {
        return context?.getDrawable(R.mipmap.start_msg_ico)
    }

    override fun getString(context: Context?): String? {
        return context?.getString(R.string.start_msg)
    }

    override fun onClick(view: View?, context: Context?) {
        val intent = Intent(mContext, EditTextActivity::class.java)
        intent.putExtra("edit_path", FileUrl.smsMotdFile)
        mContext?.startActivity(intent)
    }
}
