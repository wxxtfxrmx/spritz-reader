package com.wxxtfxrmx.spritzreader.data.progress

import android.content.SharedPreferences

//TODO Add SQL support for progress storage
interface ProgressDataSource {

    fun get(book: String): String?

    fun set(book: String, progress: String)
}

class ProgressDataSourceImpl(
    private val sharedPreferences: SharedPreferences
): ProgressDataSource {

    override fun get(book: String): String? {
        TODO("Not yet implemented")
    }

    override fun set(book: String, progress: String) {
        TODO("Not yet implemented")
    }
}