package com.example.noteagain.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class NoteEntity (
    @PrimaryKey(autoGenerate = true)
    val id:Int,
val title:String,
val description:String,
    val create:Long
        )