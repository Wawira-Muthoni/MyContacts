package dev.christine.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView




class ContactRvAdapter(var contactList:List<Contact>):
    RecyclerView.Adapter<TwitterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitterViewHolder {
       var itemView  = LayoutInflater.from(parent.context)
           .inflate(R.layout.contact_list_item,parent,false)
        return TwitterViewHolder(itemView)

   }

    override fun onBindViewHolder(holder: TwitterViewHolder, position: Int) {
        var currentTwitter =contactList.get(position)
       holder.tvName.text = currentTwitter.Name
        holder.tvEmail.text = currentTwitter.Email
       holder.tvAddress.text= currentTwitter.Address
       holder.tvNumber.text = currentTwitter.Number}
    override fun getItemCount(): Int {
      return contactList.size
  }
}


class TwitterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
   var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
    var tvAddress= itemView.findViewById<TextView>(R.id.tvAddress)
    var imgPerson= itemView.findViewById<ImageView>(R.id.imgPerson)
    var tvNumber= itemView.findViewById<TextView>(R.id.tvNumber)

}