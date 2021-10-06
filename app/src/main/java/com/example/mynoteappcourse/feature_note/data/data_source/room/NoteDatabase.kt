package com.example.mynoteappcourse.feature_note.data.data_source.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mynoteappcourse.feature_note.domain.model.Note

@Database(
    version = 1,
    entities = [Note::class]
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object{

        const val DATABASE_NAME= "notes_db"
    }
}