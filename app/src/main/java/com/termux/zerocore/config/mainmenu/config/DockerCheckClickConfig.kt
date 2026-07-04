package com.tarmux.zerocore.config.mainmenu.config

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.View
import com.example.xh_lib.utils.UUtils
import com.tarmux.R
import com.tarmux.app.TermuxActivity
import com.tarmux.zerocore.code.CodeString
import com.tarmux.zerocore.url.FileUrl
import java.io.File

class DockerCheckClickConfig: BaseMenuClickConfig() {
    override fun getIcon(context: Context?): Drawable? {
        return context?.getDrawable(R.mipmap.docker)
    }

    override fun getString(context: Context?): String? {
        return context?.getString(R.string.docker_check)
    }

    override fun onClick(view: View?, context: Context?) {
        UUtils.writerFile("runcommand/check-config.sh", File(FileUrl.mainHomeUrl, "/check-config.sh"))
        com.tarmux.zerocore.utils.SingletonCommunicationUtils.getInstance().getmSingletonCommunicationListener().sendTextToTerminal(CodeString.runDocker)
    }
}
