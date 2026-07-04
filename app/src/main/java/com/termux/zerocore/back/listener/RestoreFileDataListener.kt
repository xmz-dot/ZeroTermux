package com.termux.ai.ai.zerocore.back.listener

import com.termux.ai.ai.zerocore.back.bean.DataBean
import java.io.File

interface RestoreFileDataListener {
    fun file(mDataBean: DataBean)
}
