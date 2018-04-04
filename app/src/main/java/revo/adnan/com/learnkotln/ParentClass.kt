package revo.adnan.com.learnkotln

import android.util.Log

/**
 * Created by AdnanAhmed on 4/4/2018.
 */
open class ParentClass {



    fun baap() {
        Log.d("TAG", "Baap Ko Call");
    }

    open fun baap(age: Int) {}
}