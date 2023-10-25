package com.example.tema5app2clase

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tema5app2clase.databinding.ItemTareaBinding


class TareaAdapter (private val tareas: List<Tarea>, private val listener: OnClickListener): RecyclerView.Adapter<TareaAdapter.ViewHolder>() {

    private lateinit var context: Context

    inner class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val binding = ItemTareaBinding.bind(view) //Vinculamos la vista a nuestro adapter
        fun setListener(tarea: Tarea) {
            binding.root.setOnClickListener { listener.onClick(tarea) }
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder { //Inflamos la vista
        context = parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.item_tarea, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = tareas.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) { //Asignamos el contenido a cada item
        val tarea = tareas.get(position)

        with (holder) {
            setListener(tarea)
            binding.lblSubtitulo.text = tarea.getHora()
            binding.lblTitulo = tarea.getNombre()
        }
    }
}