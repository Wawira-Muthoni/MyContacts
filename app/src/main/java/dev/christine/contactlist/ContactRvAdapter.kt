package dev.christine.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
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
        }
    }
        override fun getItemCount(): Int {
            return contactList.size
        }




class ContactViewHolder(var binding: ContactListItemBinding): RecyclerView.ViewHolder(binding.root){

}}