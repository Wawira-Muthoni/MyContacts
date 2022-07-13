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
    fun getExtras(){
        val extras = intent.extras
        var name = extras?.getString("NAME","")
        var Pn = extras?.getString("NUMBER","")
        var mobile = extras?.getString("MOBILE","")
        var Contactinfo = extras?.getString("Info","")
        var person = extras?.getString("PERSON","")

        Toast
            .makeText(this,name,Toast.LENGTH_LONG).show()
        Toast.makeText(this,Pn,Toast.LENGTH_SHORT).show()
        binding.tvNme.text = name
       // binding.tvPn.text = Pn
        binding.tvMobile.text = mobile
        binding.tvContactinfo.text = Contactinfo
        Picasso.get().load(intent.getStringExtra("IMAGE"))//.into(image

    }
}