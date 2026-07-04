package com.tarmux.zerocore.fragment

import android.view.View
import com.example.xh_lib.utils.UUtils
import com.tarmux.R

class SettingFragment : BaseFragment {
    constructor() : super()

    override fun getFragmentView(): View {

        return UUtils.getViewLay(R.layout.dialog_switch)
    }

    override fun initFragmentView(mView: View?) {

    }
}
