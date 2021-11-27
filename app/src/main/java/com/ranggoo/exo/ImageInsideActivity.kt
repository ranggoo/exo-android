package com.ranggoo.exo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.Toast

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mb1)

        val getData = intent.getStringExtra("data")

        val memberImage = findViewById<ImageView>(R.id.memberImageArea)

        Toast.makeText (this, getData, Toast.LENGTH_SHORT).show()

        if (getData == "디오") {

            memberImage.setImageResource(R.drawable.member_1)
        }

        if (getData == "백현") {

            memberImage.setImageResource(R.drawable.member_2)
        }

        if (getData == "오세훈o서세훈아님") {
            memberImage.setImageResource(R.drawable.member_3)
        }

        if (getData == "수호") {
            memberImage.setImageResource(R.drawable.member_4)
        }

        if (getData == "밍밍") {
            memberImage.setImageResource(R.drawable.member_5)
        }

        if (getData=="카이"){
            memberImage.setImageResource(R.drawable.member_6)
        }
    }

}