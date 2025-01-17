package com.plcoding.cleanarchitecturenoteapp.feature.note.data.data_source

import androidx.room.*
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.model.Note
import kotlinx.coroutines.flow.Flow

/**
 * Created by burak on 04.06.22
 */
@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>

    @Query("SELECT * FROM note WHERE id=:id")
    suspend fun getNoteById(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNode(note: Note)
}