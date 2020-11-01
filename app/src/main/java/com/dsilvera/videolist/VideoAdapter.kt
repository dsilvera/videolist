package com.dsilvera.videolist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class VideoAdapter :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var data = ArrayList<VideoViewItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            VideoViewItem.ITEM_VIEW_TYPE_TITLE -> TitleViewHolder(inflater, parent)
            VideoViewItem.ITEM_VIEW_TYPE_VIDEO -> VideoViewHolder(inflater, parent)
            else -> throw IllegalArgumentException()
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val value = data[position]
        when (holder) {
            is TitleViewHolder -> holder.bind(value as VideoViewItem.TitleItem)
            is VideoViewHolder -> holder.bind(value as VideoViewItem.VideoItem)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun getItemViewType(position: Int): Int {
        return data[position].viewType
    }

    fun setData(videos: List<VideoInfo>) {
        data.clear()
        data.addAll(VideoViewItem.buildItems(videos))
        notifyDataSetChanged()
    }
}