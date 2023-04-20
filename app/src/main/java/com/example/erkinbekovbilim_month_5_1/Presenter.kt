package com.example.erkinbekovbilim_month_5_1

class Presenter {

    var model = Model()
    lateinit var view: CounterView

    fun plus(){
        model.plus()
        view.showCount(model.getCount())
        if (model.getCount() == 10){
            view.showToast()
        }else if (model.getCount() == 15){
            view.changeColor()
        }
    }

    fun minus(){
        model.minus()
        view.showCount(model.getCount())
        if (model.getCount() == 10) {
            view.showToast()
        }
    }

    fun attachView(viewFromActivity: CounterView){
        view = viewFromActivity
    }
}