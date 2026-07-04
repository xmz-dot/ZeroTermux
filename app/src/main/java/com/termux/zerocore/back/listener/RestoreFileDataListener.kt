package com.tarmux.zerocore.back.listener

import com.tarmux.zerocore.back.bean.DataBean
import java.io.File

interface RestoreFileDataListener {
    fun file(mDataBean: DataBean)
}
