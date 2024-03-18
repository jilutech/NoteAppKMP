package com.example.noteappkmp.domain.note

import com.example.noteappkmp.presentation.BabyBlueHex
import com.example.noteappkmp.presentation.LightGreenHex
import com.example.noteappkmp.presentation.RedOrangeHex
import com.example.noteappkmp.presentation.RedPinkHex
import com.example.noteappkmp.presentation.VioletHex
import kotlinx.datetime.LocalDateTime

data class Note(

    val id: Long?,
    val title: String?,
    val content: String,
    val colorHex: Long,
    val created:LocalDateTime
){
    companion object{
        private val colors = listOf(RedOrangeHex,RedPinkHex,BabyBlueHex,VioletHex,LightGreenHex)

        fun generateRandomColor()= colors.random()
    }
}
