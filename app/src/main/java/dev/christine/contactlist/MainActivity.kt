package dev.christine.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.christine.contactlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContact()
    }
    fun displayContact(){
        var contact = Contact("Gumato","gumato@gmail.com","0712345678","a","https://images.pexels.com/photos/1661837/pexels-photo-1661837.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact1 = Contact("Faith","faith@gmail.com","0782182635","z","https://images.pexels.com/photos/1820919/pexels-photo-1820919.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact2= Contact("Jane","jane@gmail.com","0728393828","x","https://images.pexels.com/photos/938013/pexels-photo-938013.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact3 = Contact("Mary","mary@gmail.com","0735253516","y","https://images.pexels.com/photos/1181605/pexels-photo-1181605.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact4= Contact("Ojuaga","ojuoga@gmail.com","01293739398","l","https://images.pexels.com/photos/718978/pexels-photo-718978.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact5 = Contact("Ogutu","ogutu@gmail.com","0728391829","m","https://images.pexels.com/photos/3214751/pexels-photo-3214751.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact6 = Contact("Kiyaa","kiyaa@gmail.com","0789236636","p","https://images.pexels.com/photos/3290250/pexels-photo-3290250.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact7 = Contact("Bonnie","bon@gmail.com","07253651515","s","https://images.pexels.com/photos/1757281/pexels-photo-1757281.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact8 = Contact("Olola","olo@gmail.com","07261625111","t","https://images.pexels.com/photos/1661837/pexels-photo-1661837.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact9 = Contact("Dennis","den@gmail.com","0715253621","k","https://images.pexels.com/photos/1661837/pexels-photo-1661837.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact10 = Contact("Justa","jus@gmail.com","0715263653625","j","https://images.pexels.com/photos/1661837/pexels-photo-1661837.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact11= Contact("Vivian","viv@gmail.com","07152365346","v","https://images.pexels.com/photos/1661837/pexels-photo-1661837.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact12 = Contact("Abigael","abi@gmail.com","07155366352","a","https://images.pexels.com/photos/1661837/pexels-photo-1661837.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact13 = Contact("Angel","angel@gmail.com","07143653646","n","https://images.pexels.com/photos/1661837/pexels-photo-1661837.jpeg?auto=compress&cs=tinysrgb&w=400")

        var contactList = listOf(contact,contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11,contact12,contact13)
        var contactAdapter = ContactRvAdapter(contactList)
        binding.rvContact.layoutManager = LinearLayoutManager(this)
        binding.rvContact.adapter = contactAdapter
    }
}




