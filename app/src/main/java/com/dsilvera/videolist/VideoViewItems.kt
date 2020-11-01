package com.dsilvera.videolist

sealed class VideoViewItem(val viewType: Int) {
    data class TitleItem(val title: String) : VideoViewItem(ITEM_VIEW_TYPE_TITLE)
    data class VideoItem(val video: VideoInfo) : VideoViewItem(ITEM_VIEW_TYPE_VIDEO)
    companion object {
        const val ITEM_VIEW_TYPE_TITLE = 1
        const val ITEM_VIEW_TYPE_VIDEO = 2

        fun buildItems(videos: List<VideoInfo>): ArrayList<VideoViewItem> {
            return arrayListOf<VideoViewItem>().apply {
                add(TitleItem("Video List"))
                videos.map { add(VideoItem(it)) }
            }
        }
    }
}


