package com.plcoding.cleanarchitecturenoteapp.feature.note.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.model.Note

/**
 * Created by burak on 04.06.22
 */

@Database(
    entities = [Note::class],
    version = 1
)

abstract class NoteDatabase : RoomDatabase() {
    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}