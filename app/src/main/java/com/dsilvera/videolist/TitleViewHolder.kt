package com.dsilvera.videolist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_title.view.*


class TitleViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_title, parent, false)) {
    fun bind(item: VideoViewItem.TitleItem) {
        itemView.itemTitle.text = item.title
    }
}
