package sebastian.cu.conocimientoapp

object Constantes {

    fun obtenerPreguntas (): ArrayList<Preguntas>{


        val listaPreguntas = ArrayList<Preguntas>()

        val pre1 = Preguntas(

            1, "¿A que pais pertenece esta bandera?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Belgica", "Rusia", "China",
            1
        )
        listaPreguntas.add(pre1)

        val pre2 = Preguntas(

            2, "¿A que pais pertenece esta bandera?",
            R.drawable.ic_flag_of_australia,
            "Argentina", "Afganistán", "Albania", "Australia",
            4
        )
        listaPreguntas.add(pre2)

        val pre3 = Preguntas(

            3, "¿A que pais pertenece esta bandera?",
            R.drawable.ic_flag_of_belgium,
            "Alemania", "Belgica", "Angola", "Andorra",
            4
        )
        listaPreguntas.add(pre3)

        val pre4 = Preguntas(

            4, "¿A que pais pertenece esta bandera?",
            R.drawable.ic_flag_of_brazil,
            "Alemania", "Argelia", "Brazil", "Austria",
            3
        )
        listaPreguntas.add(pre4)






        return listaPreguntas



    }



}