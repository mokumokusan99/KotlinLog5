package jp.techacademy.shunsuke.kino.kotlinlog5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // クラス
        val human1 = Human("ポチ", 3, "食事")

        human1.say()

        human1.think()

        val human2 = Human("ハチ", 10, "散歩")    // 名前をハチ、年齢10歳

        human2.say()

        human2.think()


    }
}