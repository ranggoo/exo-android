package com.ranggoo.exo

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn1 = findViewById<ImageView>(R.id.member1)
        val btn2 = findViewById<ImageView>(R.id.member2)
        val btn3 = findViewById<ImageView>(R.id.member3)
        val btn4 = findViewById<ImageView>(R.id.member4)
        val btn5 = findViewById<ImageView>(R.id.member5)
        val btn6 = findViewById<ImageView>(R.id.member6)


        btn1.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "디오")
            startActivity(intent)
        }

        btn2.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "백현")
            startActivity(intent)
        }

        btn3.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "오세훈o서세훈아님")
            startActivity(intent)
        }

        btn4.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "수호")
            startActivity(intent)
        }

        btn5.setOnClickListener {

            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data", "밍밍")
            startActivity(intent)
        }

        btn6.setOnClickListener {
            val intent = Intent(this, ImageInsideActivity::class.java)
            intent.putExtra("data","카이")
            startActivity(intent)
        }
    }

}
