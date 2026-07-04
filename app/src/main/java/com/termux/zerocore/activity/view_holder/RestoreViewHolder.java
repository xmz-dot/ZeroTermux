package com.tarmux.zerocore.activity.view_holder;

import android.view.View;
import android.widget.TextView;

import com.tarmux.R;

public class RestoreViewHolder extends ViewHolder {


    public TextView msg_title;
    public TextView msg_message;

    public RestoreViewHolder(View mView) {
        super(mView);
        msg_title = (TextView) findViewById(R.id.msg_title);
        msg_message = (TextView) findViewById(R.id.msg_message);
    }
}
