package revo.adnan.com.learnkotln

import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.demokotlin.utils.ApplicationUtils
import com.example.demokotlin.R
import com.example.demokotlin.activity.ParentActivity
import com.example.demokotlin.databinding.RetrofitClassBinding
import com.example.demokotlin.model.ModelClass
import com.example.demokotlin.network.Api
import com.example.demokotlin.utils.NetworkClass
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitActivity : ParentActivity() {

    lateinit var binding: RetrofitClassBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.retrofit_class)
        supportActionBar!!.title = "Tab Layout"
        buildRetrofit()

    }

    private fun buildRetrofit() {
        val service = NetworkClass.getRetrofit()
        val call: Call<ModelClass> = service!!.model as Call<ModelClass>
        call.enqueue(object : Callback<ModelClass> {
            override fun onResponse(
                call: Call<ModelClass>,
                response: Response<ModelClass>
            ) {
                ApplicationUtils.showToast("Got Data", applicationContext)
                binding.textView.setText(
                    response.body()!!.rom + "\n" + response.body()!!
                        .screenSize + "\n" + response.body()!!.backCamera
                )
            }
            override fun onFailure(call: Call<ModelClass>, t: Throwable) {
                Log.e("mainAction ", "  error $t")
                ApplicationUtils.showToast("Got Error",applicationContext)

            }
        })

    }
}
