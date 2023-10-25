package com.example.tema5app2clase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tema5app2clase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {

    private lateinit var tareaAdapter: TareaAdapter
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var itemDecoration: DividerItemDecoration

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tareaAdapter = TareaAdapter(Tarea.TareaDatos.TAREAS, this)
        linearLayoutManager = LinearLayoutManager(this)
        itemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)

        binding.recyclerId.apply {
            layoutManager = linearLayoutManager
            adapter = tareaAdapter
            addItemDecoration(itemDecoration)
        }


    }

    override fun onClick(tarea: Tarea) {
        Toast.makeText(this, tarea.getNombre(), Toast.LENGTH_SHORT).show()
    }
}