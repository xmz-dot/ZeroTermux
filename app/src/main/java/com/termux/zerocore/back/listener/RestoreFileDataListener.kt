package com.termux.ai.zerocore.back.listener

import com.termux.ai.zerocore.back.bean.DataBean
import java.io.File

interface RestoreFileDataListener {
    fun file(mDataBean: DataBean)
}
