package com.x1n9.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.x1n9.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sum1(a: Int, b: Int) = a + b

    public fun sum2(a: Int, b: Int): Int = a + b

    fun printSum(a: Int, b: Int): Unit {
        print(a + b)
    }

    public fun printSum1(a: Int, b: Int) {
        print(a + b)
    }

    fun vars(vararg v: Int) {
        for (vt in v) {
            print(vt)
        }
    }

    fun main(args: Array<String>) {
        vars(1, 2, 3, 4, 5)
    }

    fun main1(args: Array<String>) {
        val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
        println(sumLambda(1, 2))
    }

    val a: Int = 1
    val b = 1

    //    val c: Int
    //    c = 1
    /*var x = 5
    x += 1*/
}