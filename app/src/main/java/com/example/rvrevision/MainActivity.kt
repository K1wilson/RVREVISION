package com.example.rvrevision

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var newRecyclerView :RecyclerView
    private lateinit var arrayList : ArrayList <ProgrammingLanguage>
    lateinit var imageId : Array <Int>
    lateinit var heading : Array <String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     imageId = arrayOf(
     R.drawable.asm,
     R.drawable.c,
     R.drawable.chash,
     R.drawable.css,
     R.drawable.cplus,
     R.drawable.js,
     R.drawable.dart,
     R.drawable.java,
     R.drawable.kotlin,
     R.drawable.swift,)
    heading = arrayOf(
            "icon for assembly language",
            "icon for c language",
            "icon for c# language",
            "icon for css language",
            "icon for c++ language",
            "icon for javascript language",
            "icon for dart language",
            "icon for java language",
            "icon for kotlin language",
            "icon for swift language",

        )
     newRecyclerView = findViewById(R.id.rvm)
        newRecyclerView . layoutManager = LinearLayoutManager( this)
        newRecyclerView.setHasFixedSize(true)
        arrayList = arrayListOf<ProgrammingLanguage>()
        getUserData()
    }

    private fun getUserData() {
     for ( i in imageId.indices){
         val pl = ProgrammingLanguage(imageId[i], heading[i])
         arrayList.add(pl)
     }
        newRecyclerView.adapter = MyAdapter(arrayList)
    }
}