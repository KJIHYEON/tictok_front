package com.tictok.tictok_category3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.category_item_list.*

class MainActivity : AppCompatActivity() {

    private var detailsList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postToList()

        category_recycler.layoutManager = LinearLayoutManager(this)
        category_recycler.adapter = CategoryAdapter(detailsList)



    }

    private fun addToList(details:String,image:Int){
        detailsList.add(details)
    }

    private fun postToList(){
        for(i in 1..25){
            addToList("카테고리 $i",R.mipmap.ic_launcher_round)
        }
    }



}

