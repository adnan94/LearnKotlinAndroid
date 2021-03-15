package revo.adnan.com.learnkotln

import android.util.Log

/**
 * Created by AdnanAhmed on 4/4/2018.
 */
class PracticeClass :ParentClass(){


    ///////////////////////Method Overloading//////////////////////////////
    fun getPrice() {
        Log.d("TAG", "Running Get Price")
    }

    fun getPrice(name: String, last: String) {
        Log.d("TAG", "My name is " + name + " " + last)
    }

    fun getPrice(employed: String) {
        Log.d("TAG", "I am " + employed)
    }

    fun getPrice(age: Int) {
        Log.d("TAG", "I am " + age + " old")
    }
    override fun baap(age: Int) {
        Log.d("TAG","Baap method in chiild class")
    }

    fun returnTypeFuction():String {
    return "Fuck You "
    }

}