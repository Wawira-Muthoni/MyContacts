package dev.christine.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.christine.contactlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        displayContact()
    }
    fun displayContact(){
        var contact = Contact("Gumato","","","","")
        var contact1 = Contact("","","","","")
        var contact2= Contact("","","","","")
        var contact3 = Contact("","","","","")
        var contact4= Contact("","","","","")
        var contact5 = Contact("","","","","")
        var contact6 = Contact("","","","","")
        var contact7 = Contact("","","","","")
        var contact8 = Contact("","","","","")
        var contact9 = Contact("","","","","")
        var contact10 = Contact("","","","","")
        var contact11= Contact("","","","","")
        var contact12 = Contact("","","","","")
        var contact13 = Contact("","","","","")

        var contactList = listOf(contact,contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11,contact12,contact13)
        var contactAdapter = ContactRvAdapter(contactList)
        binding.rvContact.layoutManager = LinearLayoutManager(this)
        binding.rvContact.adapter = contactAdapter
    }
}




