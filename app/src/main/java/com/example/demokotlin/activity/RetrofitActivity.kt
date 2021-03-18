package revo.adnan.com.learnkotln

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.demokotlin.R
import com.example.demokotlin.databinding.RetrofitClassBinding
import com.example.demokotlin.databinding.TabLayoutActivityBinding
import com.example.demokotlin.model.ModelClass
import com.example.demokotlin.network.Api
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitActivity : AppCompatActivity() {

    lateinit var binding: RetrofitClassBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.retrofit_class)
        supportActionBar!!.title = "Tab Layout"
        buildRetrofit()

    }

    private fun buildRetrofit() {
        val url = "https://www.blueappsoftware.in/"
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service = retrofit.create(Api::class.java)
        val call: Call<ModelClass> = service.model as Call<ModelClass>
        call.enqueue(object : Callback<ModelClass> {
            override fun onResponse(
                call: Call<ModelClass>,
                response: Response<ModelClass>
            ) {

                Toast.makeText(applicationContext, "Got Data", Toast.LENGTH_SHORT).show()
                binding.textView.setText(
                    response.body()!!.rom + "\n" + response.body()!!
                        .screenSize + "\n" + response.body()!!.backCamera
                )

            }

            override fun onFailure(call: Call<ModelClass>, t: Throwable) {
                Log.e("mainAction ", "  error $t")
                Toast.makeText(applicationContext, "Got Error", Toast.LENGTH_SHORT).show()

            }
        })

    }
}
