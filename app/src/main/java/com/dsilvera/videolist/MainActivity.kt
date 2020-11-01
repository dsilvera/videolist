package com.dsilvera.videolist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var videoAdapter: VideoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        videoAdapter = VideoAdapter()
        videoRecyclerView.apply {
            adapter = videoAdapter
        }

        videoAdapter.setData(
            listOf(
                VideoInfo(
                    url = "https://vod-progressive.akamaized.net/exp=1604253738~acl=%2Fvimeo-prod-skyfire-std-us%2F01%2F1960%2F18%2F459802291%2F2032938172.mp4~hmac=ad2ad6f1569a7383122f9f78a29796b789bb267a487950a5a45d682fbebf8fb7/vimeo-prod-skyfire-std-us/01/1960/18/459802291/2032938172.mp4?filename=Forest+-+49981.mp4",
                    thumbnailUrl = "https://i.vimeocdn.com/video/960599690_640x360.jpg",
                    title = "Trees"
                ),
                VideoInfo(
                    url = "https://vod-progressive.akamaized.net/exp=1604253840~acl=%2Fvimeo-prod-skyfire-std-us%2F01%2F1519%2F16%2F407595474%2F1746069517.mp4~hmac=c5ed6f147caa8763ab344f17e83098cfebd341bfad164705c293e3718584fedf/vimeo-prod-skyfire-std-us/01/1519/16/407595474/1746069517.mp4?filename=Clouds+-+35573.mp4",
                    thumbnailUrl = "https://i.vimeocdn.com/video/878250122_640x360.jpg",
                    title = "Sky"
                ),
                VideoInfo(
                    url = "https://vod-progressive.akamaized.net/exp=1604253875~acl=%2Fvimeo-prod-skyfire-std-us%2F01%2F4924%2F17%2F449623829%2F1976335119.mp4~hmac=27c8f088623e0c1b799241279c8054863200ca260bc8806a770e31ee028df65e/vimeo-prod-skyfire-std-us/01/4924/17/449623829/1976335119.mp4?filename=Coffee+-+46989.mp4",
                    thumbnailUrl = "https://i.vimeocdn.com/video/943343110_640x360.jpg",
                    title = "Coffee"
                ),
                VideoInfo(
                    url = "https://vod-progressive.akamaized.net/exp=1604254361~acl=%2Fvimeo-prod-skyfire-std-us%2F01%2F3260%2F17%2F441301097%2F1930591083.mp4~hmac=b7e8de002cc9c9c8eefbc9e763a0db6556ce5ce0a22faa3ea352fed3a7e61c67/vimeo-prod-skyfire-std-us/01/3260/17/441301097/1930591083.mp4?filename=Creux+De+Van+-+45150.mp4",
                    thumbnailUrl = "https://i.vimeocdn.com/video/929345531_640x362.jpg",
                    title = "Nature"
                ),
                VideoInfo(
                    url = "https://vod-progressive.akamaized.net/exp=1604243615~acl=%2Fvimeo-prod-skyfire-std-us%2F01%2F888%2F18%2F454440518%2F2002743472.mp4~hmac=2f4accf0f2ba9133470a4689c339c3a053490f86010d47c756b4e56dade89ff7/vimeo-prod-skyfire-std-us/01/888/18/454440518/2002743472.mp4?filename=Cateye+-+48441.mp4",
                    thumbnailUrl = "https://i.vimeocdn.com/video/951412296_640x360.jpg",
                    title = "Eye"
                ),
                VideoInfo(
                    url = "https://vod-progressive.akamaized.net/exp=1604254484~acl=%2Fvimeo-prod-skyfire-std-us%2F01%2F2645%2F16%2F413229662%2F1776913801.mp4~hmac=16a9f4923f4a578dfde90ce4d25e5750d8e8d8305031535d7e393ef1125c3b95/vimeo-prod-skyfire-std-us/01/2645/16/413229662/1776913801.mp4?filename=Waterfall+-+37088.mp4",
                    thumbnailUrl = "https://i.vimeocdn.com/video/885893632_640x360.jpg",
                    title = "Cascade"
                ),
                VideoInfo(
                    url = "https://vod-progressive.akamaized.net/exp=1604254539~acl=%2Fvimeo-prod-skyfire-std-us%2F01%2F965%2F18%2F454825064%2F2004922060.mp4~hmac=19ab3345c30527f146c621130b0873efeacac24216083b66b71ee4b097dc4ab9/vimeo-prod-skyfire-std-us/01/965/18/454825064/2004922060.mp4?filename=Golden+-+48569.mp4",
                    thumbnailUrl = "https://i.vimeocdn.com/video/952064476_640x360.jpg",
                    title = "Spectacle"
                )
            )
        )
    }

    override fun onPause() {
        super.onPause()
        videoRecyclerView.changePlayingState(false)
    }

    override fun onResume() {
        super.onResume()
        videoRecyclerView.changePlayingState(true)
    }
}