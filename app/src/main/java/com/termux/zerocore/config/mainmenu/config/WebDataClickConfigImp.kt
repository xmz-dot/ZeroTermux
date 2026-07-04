package com.termux.ai.zerocore.config.mainmenu.config

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.View
import com.example.xh_lib.utils.LogUtils
import com.termux.ai.app.TermuxActivity
import com.termux.ai.zerocore.activity.ImageActivity
import com.termux.ai.zerocore.data.UsbFileData
import com.termux.ai.zerocore.url.FileUrl
import com.termux.ai.zerocore.utils.FileIOUtils
import java.io.File

class WebDataClickConfigImp: VideoBackClickConfig() {
    companion object {
        val TAG = WebDataClickConfigImp::class.simpleName
    }
    override fun onClick(view: View?, context: Context?) {
        val termuxActivity: TermuxActivity = context as TermuxActivity
        UsbFileData.get().setImageFileCheckListener(object :UsbFileData.ImageFileCheckListener{
            override fun imageFile(file: File) {
                LogUtils.d(TAG, "imageFile file path is:${file.absolutePath}")
                val fileImg = File("${FileUrl.mainConfigImg}/back.jpg")
                if(fileImg.exists()){
                    fileImg.delete()
                }
                FileIOUtils.setPathVideo(file)
                termuxActivity.setVideoBack(file)
            }
        })
        val intent = Intent(mContext as Activity, ImageActivity::class.java)
        intent.action = ImageActivity.ImageActivityFlgh.VIDEO_FLGH
        mContext?.startActivity(intent)
    }
}
