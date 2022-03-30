package com.example.gbooks

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gbooks.databinding.ActivityMainBinding
import com.example.gbooks.databinding.BookItemBinding
import org.json.JSONObject

class MainAdapter(private val libros: Array<JSONObject>): RecyclerView.Adapter<MainAdapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainHolder {
        val binding = BookItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, position: Int) {
        holder.render(libros[position])
    }

    override fun getItemCount(): Int = libros.size
    class MainHolder(val binding: BookItemBinding): RecyclerView.ViewHolder(binding.root){
        fun render(libro: JSONObject){
            binding.tvBookTitle.setText(libro.getString("titulo"))
            binding.tvBookAuthor.setText(libro.getString("Autor"))
        }
    }
}