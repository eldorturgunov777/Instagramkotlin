package com.example.instagramkotlin.model


/**
 * Created by Eldor Turgunov on 14.06.2022.
 * Instagram kotlin
 * eldorturgunov777@gmail.com
 */
class Feed {
    var post: Post? = null
    var stories: ArrayList<Story> = ArrayList<Story>()

    constructor(post: Post) {
        this.post = post
    }

    constructor(stories: ArrayList<Story>) {
        this.stories = stories
    }
}