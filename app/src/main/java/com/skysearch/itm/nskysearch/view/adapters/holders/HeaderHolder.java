package com.skysearch.itm.nskysearch.view.adapters.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.skysearch.itm.nskysearch.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HeaderHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.header_text)
    public TextView date;

    public HeaderHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
