package br.com.cotemig.timesfutebol

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import coil.load

class TimeAdapter(var context: Context, var lista: List<Time>) : BaseAdapter() {
    override fun getCount(): Int {
        return lista.size
    }

    override fun getItem(p0: Int): Any {
        return ""
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        var view = LayoutInflater.from(context).inflate(R.layout.item_time, null)
        var time = view.findViewById<TextView>(R.id.time)
        var escudo = view.findViewById<ImageView>(R.id.escudo)
        time.text = lista[position].nome
        escudo.load(lista[position].escudo)
        return view
    }
}