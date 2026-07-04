package com.tarmux.zerocore.dialog.adapter

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.xh_lib.utils.UUtils
import com.tarmux.R
import com.tarmux.app.TermuxActivity
import com.tarmux.zerocore.bean.ZeroRunCommandBean
import com.tarmux.zerocore.dialog.LoadingDialog
import com.tarmux.zerocore.dialog.view_holder.BoomZeroTermuxViewHolder
import com.tarmux.zerocore.url.FileUrl.mainHomeUrl
import java.io.File

class BoomZeroTermuxAdapter : RecyclerView.Adapter<BoomZeroTermuxViewHolder> {

    private var mList:ArrayList<ZeroRunCommandBean>? = null

    private var mActivity:Activity? = null


    constructor(mList:ArrayList<ZeroRunCommandBean>?,mActivity:Activity) : super(){

        this.mList = mList
        this.mActivity = mActivity

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoomZeroTermuxViewHolder {
       return BoomZeroTermuxViewHolder(UUtils.getViewLayViewGroup(R.layout.item_boom_zero_termux,parent))
    }

    override fun onBindViewHolder(holder: BoomZeroTermuxViewHolder, position: Int) {

        val zeroRunCommandBean = mList!![position]

        if(zeroRunCommandBean.type == 0){

            if(zeroRunCommandBean.isShow){
                //标题
                holder.msg_card!!.visibility = View.GONE
                holder.title!!.visibility = View.VISIBLE
                holder.title!!.text = zeroRunCommandBean.title
            }else{

                holder.msg_card!!.visibility = View.GONE
                holder.title!!.visibility = View.GONE
            }


        }else{
            //内容

            holder.msg_card!!.visibility = View.VISIBLE
            holder.title!!.visibility = View.GONE
            holder.msg!!.text = zeroRunCommandBean.name

            holder.msg_card!!.setOnClickListener {

                mDissListener?.close()

                if(zeroRunCommandBean.isHttpCommand){

                    com.tarmux.zerocore.utils.SingletonCommunicationUtils.getInstance().getmSingletonCommunicationListener().sendTextToTerminal(zeroRunCommandBean.runCommand)

                }else{

                    val loadingDialog = LoadingDialog(mActivity!!)
                    loadingDialog.show()

                    UUtils.runOnThread {


                        UUtils.writerFile(zeroRunCommandBean.assetsName, File(mainHomeUrl, "/${zeroRunCommandBean.fileName}"))

                        mActivity!!.runOnUiThread {

                            loadingDialog.dismiss()

                            com.tarmux.zerocore.utils.SingletonCommunicationUtils.getInstance().getmSingletonCommunicationListener().sendTextToTerminal(zeroRunCommandBean.runCommand)

                            if(zeroRunCommandBean.runCommit != null){
                                zeroRunCommandBean.runCommit.run()
                            }



                        }

                    }

                }







            }

            holder.msg_card!!.setOnLongClickListener {


                val intent = Intent()
                intent.data = Uri.parse(zeroRunCommandBean.address) //Url 就是你要打开的网址
                intent.action = Intent.ACTION_VIEW
                mActivity!!.startActivity(intent) //启动浏览器


                true
            }


        }


    }

    override fun getItemCount(): Int {
        return mList!!.size
    }

    private var mDissListener:DissListener? = null

    public fun setDissListener(mDissListener:DissListener){

        this.mDissListener = mDissListener

    }

    public interface DissListener{


        fun close()


    }
}
