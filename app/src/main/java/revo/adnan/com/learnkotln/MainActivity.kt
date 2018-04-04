package revo.adnan.com.learnkotln

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.adnan.com.learnkotln.R

class MainActivity : AppCompatActivity() {
    val TAG: String = "TAG";

//    var listview: ListView? = null;
//    var editText: EditText? = null;
//    var add: Button? = null;
//   var list:ArrayList<String>?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.title = "Welcome To Learn Kotlin"


        ///////////////Object Of Practice Class and method overloading////////////////////
        var practice: PracticeClass = PracticeClass();

        practice.getPrice()
        practice.getPrice(23)
        practice.getPrice("Employed")
        practice.getPrice("Adnan", "Ahmed")
        var returnType: String = practice.returnTypeFuction()
        Log.d("TAG", "The Value Returned Is " + returnType);
        practice.baap(3);
        practice.baap();

        var simpleListView = findViewById(R.id.simpleListView) as Button
        simpleListView.setOnClickListener(View.OnClickListener {
            var i = Intent(this, SimpleListView::class.java)
            startActivity(i)
        })


        var customListView = findViewById(R.id.customListView) as Button
        customListView.setOnClickListener(View.OnClickListener {
            var i = Intent(this, CustomListView::class.java)
            startActivity(i)
        })

//        var a: Int = 10;
//        val b: Int = 20;
//        var c: Int = 30;
//        Log.d("TAG", "Value Of A" + a);
//        Log.d("TAG", "Value Of B" + b);
//        Log.d("TAG", "Value Of C" + c);
//        c = 40898;
//        Log.d("TAG", "Value Of C added" + c);


//        var a: Int = 10
//        val b = 20.5
//        var c = false
//        var d = "Adnan"
//
//        Log.d("TAG", "Value Of A " + a)
//        Log.d("TAG", "Value Of B " + b)
//        Log.d("TAG", "Value Of C " + c)
//        Log.d("TAG", "Value Of D " + d)
//
//
//        if (d is String) {
//            Log.d(TAG,"This is String !")
//        }


//var a:Int?=43
//        a=null
//if(a == null){
//            Log.d(TAG,"This is Null !")
//}


//        var a: Int=32
//        var b:Int = 32
//        Log.d(TAG,"This is equal::"+a.compareTo(b))

//        var a: Int=3
//        var b:Int = 32
//        Log.d(TAG,"A is Greater Than B::"+a.compareTo(b))
//

//        var a: Int=320
//        var b:Int = 32
//        Log.d(TAG,"A is Greater Than B::"+a.compareTo(b))


//        var a: Int = 320
//        var b: Int = 32
//        Log.d(TAG, "A plus B::" + a.plus(b))

//        var a: Int = 3
//        var b: Int = 9
//        Log.d(TAG, "A times B::" + a.times(b))

//        var a: Int = 3
//        var b: Int = 2
//        Log.d(TAG, "A times B::" + a.times(b))

//        var a: Char = 'C'
//        Log.d(TAG, "Char ::" + a)

//                var a: String = "String"
//        Log.d(TAG, "This is string ::" + a)


//        var a=arrayOf(13,43,342,34)
//        Log.d(TAG, "Array index 1 ::" + a[0])

//        var a=arrayOf(13,43,342,34)
//        for(i in a){
//            Log.d(TAG, "Array  ::" +i)
//        }

//        var a=arrayOfNulls<Int>(5)
//        a.set(0,12)
//        a.set(3,4)
//        for(i in a){
//            Log.d(TAG, "Array  ::" +i)
//        }

//        var a = arrayOfNulls<Int>(5)
//        a.set(0, 23)
//        a = emptyArray()
//
//        for (i in a) {
//            Log.d(TAG, "Array  ::" + i)
//        }

//        var array= IntArray(5)
//        array.set(0,555)
//        for(i in array){
//            Log.d(TAG,"int array "+i)
//        }

//        var array = IntArray(5)
//        array.set(0, 555)
//        array.set(1, 55)
//        array.set(2, 5)
//        array.set(3, 55)
//        var ite = array.iterator();
//        while (ite.hasNext()) {
//            Log.d(TAG, "int array " + ite.next())
//        }

//        var i=90;
//        var c=""
//        if(i==90) c="I am good"
//            Log.d(TAG, c)


//        var i=90;
//        var c=""
//        if(i==90) c="I am good" else c="I am not good"
//        Log.d(TAG, c)

//Array List
//        val list = arrayListOf<String>()
//        list.add("Sumbal")
//        list.add("Ayesha")
//        list.add("Kanwal")
//        list.add("Erum")
//        list.add("Emman")
//        list.add("Alia")
//
//        for(i in list){
//            Log.d("TAG","i"+i);
//        }

//        var list = arrayListOf("Ayesha","<3","ADnan")
//        for(i in list){
//            Log.d("TAG","i"+i);
//        }


/////////switch/Case

//        var sheIs = "Kutti"
//        when (sheIs) {
//            "Bitch" -> Log.d("TAG", "She is bitch")
//            "Sweet" -> Log.d("TAG", "She is sweet")
//            else -> {
//                Log.d("TAG", "she is neither bitch nor sweet")
//            }
//        }

    }


}

