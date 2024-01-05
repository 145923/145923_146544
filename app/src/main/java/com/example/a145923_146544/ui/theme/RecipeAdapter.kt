package com.example.a145923_146544.ui.theme

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecipeAdapter
    (private val recipes: List<Recipe>, private val onRecipeClickListener: OnRecipeClickListener) :
    recyclerview.Adapter<RecipeAdapter.RecipeViewHolder>() {

    interface OnRecipeClickListener {
        fun onRecipeClick(position: Int)
    }

    inner class RecipeViewHolder(itemView: View) : recyclerview.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
    }

   fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_recipe, parent, false)
        return RecipeViewHolder(itemView)
    }

    fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val currentRecipe = recipes[position]
        holder.titleTextView.text = currentRecipe.title

        holder.itemView.setOnClickListener {
            onRecipeClickListener.onRecipeClick(position)
        }
    }

    fun getItemCount(): Int {
        return recipes.size
    }
}



