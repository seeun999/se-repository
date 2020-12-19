package com.example.myapplication

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val aids = ArrayList<String>()

        aids.add("심폐소생술")
        aids.add("하임리히법")
        aids.add("증상별 적정자세")
        aids.add("소독과 드레싱")
        aids.add("상황별 응급처치")
        aids.add("기타")

        val aidsAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, aids)
        listAid.adapter = aidsAdapter

        listAid.choiceMode = ListView.CHOICE_MODE_SINGLE


    }
}