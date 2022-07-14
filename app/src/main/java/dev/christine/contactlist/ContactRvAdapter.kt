package dev.christine.contactlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import dev.christine.contactlist.databinding.ContactListItemBinding


class ContactRvAdapter(var contactList:List<Contact>):
    RecyclerView.Adapter<ContactRvAdapter.ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding =
            ContactListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ContactViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact = contactList.get(position)
        val context = holder.itemView.context
        with(holder.binding) {
            tvName.text = currentContact.Name
            tvEmail.text = currentContact.Email
            tvAddress.text = currentContact.Address
            tvNumber.text =currentContact.Number
            Picasso.get()
                .load(currentContact.Person)
//                .resize(300,300)
//                .centerCrop()
//                .placeholder(R.drawable.)
//                .error(R.drawable.ic_launcher_background)
                .into(imgPerson)
            cvContact.setOnClickListener {
              val context = holder.itemView.context
                val intent = Intent(context,ViewContactActivity::class.java)
                intent.putExtra("NAME",currentContact.Name)
                intent.putExtra("NUMBER",currentContact.Number)
                intent.putExtra("EMAIL",currentContact.Email)
                intent.putExtra("ADDRESS",currentContact.Address)
                intent.putExtra("PERSON",currentContact.Person)


                context.startActivity(intent)
            }
//         holder.binding.cvContact.setOnClickListener {
//              Toast
//                 .makeText(context,"You have clicked on my face",Toast.LENGTH_LONG)
//                  .show()
//            }
        }
    }
        override fun getItemCount(): Int {
            return contactList.size
        }

    class ContactViewHolder(var binding: ContactListItemBinding): RecyclerView.ViewHolder(binding.root){

}}