package com.example.kotlinyoutubebeta

class HomeFeed(val videos:List<Video>)

class Video(val id: Int, val name:String,val link:String,
            val imageUrl:String,val numberofViews:Int,val channel: Channel)

class Channel(val name:String, val profileImageUrl:String)