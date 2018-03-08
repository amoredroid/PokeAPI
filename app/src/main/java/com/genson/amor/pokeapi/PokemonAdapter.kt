package com.genson.amor.pokeapi

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.row_main.view.*

/**
 * Created by Genson on 08/03/2018.
 */

class PokemonAdapter(val pokemonList: ArrayList<Pokemon>): RecyclerView.Adapter<CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.row_main, parent, false)
        return CustomViewHolder(cellForRow)  }

    override fun getItemCount(): Int {
        return pokemonList.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder?, position: Int) {
        val pokemon: Pokemon = pokemonList[position]
        holder?.view?.pokeName?.text = pokemon.name
        val pokemonImage = holder?.view?.pokeImgView
        Picasso.with(holder?.view?.context).load(pokemon.sprites.front_default).into(pokemonImage)

    }

}

class CustomViewHolder (val view: View): RecyclerView.ViewHolder(view){

}