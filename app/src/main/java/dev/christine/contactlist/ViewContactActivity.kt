package dev.christine.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import dev.christine.contactlist.databinding.ActivityMainBinding
import dev.christine.contactlist.databinding.ActivityViewContactBinding

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityViewContactBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        getExtras()
    }

    fun getExtras() {
        val extras = intent.extras
        var name = extras?.getString("NAME")
        var phoneNumber = extras?.getString("NUMBER")
     //   var mobile = extras?.getString("MOBILE")
        var contactInfo = extras?.getString("EMAIL")
        var person = extras?.getString("PERSON")
        var address = extras?.getString("ADDRESS")


        Toast
            .makeText(this, name, Toast.LENGTH_LONG).show()
        Toast.makeText(this, phoneNumber, Toast.LENGTH_LONG).show()
        binding.tvNme.text = name
        binding.tvphoneNumber.text = phoneNumber
        //binding.tvMobile.text = mobile
        binding.tvContactinfo.text = contactInfo
      //  binding.imgCall.tag =
      //  binding.imgCalls.tag =
        Picasso.get()
            .load(intent.getStringExtra("PERSON")).into(binding.imgPsn)

    }
}