package com.example.tema5app2clase

class Tarea (private var nombre: String,
            private var hora: String

){

    fun getNombre():String {
        return nombre
    }

    fun getHora():String {
        return hora
    }

    class TareaDatos {
        companion object {
            val TAREAS = arrayListOf<Tarea>(
                Tarea ("Correr 30 min", "08:00"),
                Tarea ("Ducha", "08:30"),
                Tarea ("Estudiar", "09:00"),
                Tarea ("Comer", "13:00"),
                Tarea ("Trabajo", "15:00"),
                Tarea ("Cenar", "21:00")

            )
        }
    }

}