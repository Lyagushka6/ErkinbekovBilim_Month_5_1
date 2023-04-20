package com.example.erkinbekovbilim_month_5_1

class Model {

    private var count = 0

    fun plus(){
        count++
    }

    fun minus(){
        count--
    }

    fun getCount() : Int{
        return count
    }
}