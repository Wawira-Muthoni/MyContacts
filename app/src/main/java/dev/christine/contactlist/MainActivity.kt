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
        setContentView(binding.root)
        displayContact()
    }
    fun displayContact(){
        var contact = Contact("Gumato","gumato@gmail.com","0712345678","a","")
        var contact1 = Contact("Faith","faith@gmail.com","0782182635","z","")
        var contact2= Contact("Jane","jane@gmail.com","0728393828","x","")
        var contact3 = Contact("Mary","mary@gmail.com","0735253516","y","")
        var contact4= Contact("Ojuaga","ojuoga@gmail.com","01293739398","l","")
        var contact5 = Contact("Ogutu","ogutu@gmail.com","0728391829","m","")
        var contact6 = Contact("Kiyaa","kiyaa@gmail.com","0789236636","p","")
        var contact7 = Contact("Bonnie","bon@gmail.com","07253651515","s","")
        var contact8 = Contact("Olola","olo@gmail.com","07261625111","t","")
        var contact9 = Contact("Dennis","den@gmail.com","0715253621","k","")
        var contact10 = Contact("Justa","jus@gmail.com","0715263653625","j","")
        var contact11= Contact("Vivian","viv@gmail.com","07152365346","v","")
        var contact12 = Contact("Abigael","abi@gmail.com","07155366352","a","")
        var contact13 = Contact("Angel","angel@gmail.com","07143653646","n","")

        var contactList = listOf(contact,contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11,contact12,contact13)
        var contactAdapter = ContactRvAdapter(contactList)
        binding.rvContact.layoutManager = LinearLayoutManager(this)
        binding.rvContact.adapter = contactAdapter
    }
}




