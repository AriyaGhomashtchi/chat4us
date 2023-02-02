package com.example.chat4us.data

import com.example.chat4us.R
import com.example.chat4us.data.model.Chat

class Datasource {

    fun getChats(): List<Chat> {
        return listOf(
            Chat(
                "Mikel Arteta",
                34505456,
                R.drawable.arteta
            ),
            Chat(
                "Mohamed Elneny",
                349958605,
                R.drawable.elneny
            ),
            Chat(
                "Edu Gasper",
                348759303,
                R.drawable.gaspar
            ),
            Chat(
                "Gabriel Jesus",
                349458340,
                R.drawable.jesus
            ),
            Chat(
                "Jorginho",
                341122392,
                R.drawable.jorginho
            ),
            Chat(
                "Martin Ödegaard",
                341123392,
                R.drawable.martin
            ),
            Chat(
                "Gabriel Martinelli",
                342304932,
                R.drawable.martinelli
            ),
            Chat(
                "Eddie Nkethia",
                345969950,
                R.drawable.nkethia
            ),
            Chat(
                "Aaron Ramsdale",
                345968694,
                R.drawable.ramsdale
            ),
            Chat(
                "Bukayo Saka",
                345968694,
                R.drawable.saka
            ),
            Chat(
                "William Saliba",
                34100200,
                R.drawable.saliba
            ),
            Chat(
                "Leandro Trossard",
                34300988,
                R.drawable.trossard
            ),
            Chat(
                "Benjamin White",
                34599899,
                R.drawable.white
            ),
            Chat(
                "Granit Xhaka",
                34500600,
                R.drawable.xhaka
            ),
            Chat(
                "Oleksander Zinchenko",
                345006789,
                R.drawable.zinchenko
            )
        )
    }
}