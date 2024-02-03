package br.com.willaimsilva.cheatsgta.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.willaimsilva.cheatsgta.databinding.ItemCheatsIvBinding
import br.com.willaimsilva.cheatsgta.model.Cheats

class CheatsIVAdapter (private val cheats: List<Cheats>): RecyclerView.Adapter<CheatsIVAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemCheatsIvBinding) : RecyclerView.ViewHolder(binding.root)

    // infla o layout "gera objeto"
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemCheatsIvBinding.inflate(inflater, parent, false)
        val viewHolder = ViewHolder(binding)
        return viewHolder
    }

    //  vincula os objetos
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = cheats[position]
        holder.binding.ivPhoto.setImageResource(item.photo)
        holder.binding.tvName.text = item.name
        holder.binding.tvCheats.text = item.cheats
        holder.binding.tvDescription.text = item.description

    }

    // aqui é declarado quantas vezes ele chama o objeto
    override fun getItemCount(): Int = cheats.size

}

