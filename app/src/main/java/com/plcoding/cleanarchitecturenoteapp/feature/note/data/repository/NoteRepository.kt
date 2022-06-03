package com.plcoding.cleanarchitecturenoteapp.feature.note.data.repository

import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.model.Note
import kotlinx.coroutines.flow.Flow

/**
 * Created by burak on 04.06.22
 */
interface NoteRepository {

    fun getNotes(): Flow<List<Note>>
    suspend fun getNoteById(id: Int): Note?
    suspend fun insertNote(note: Note)
    suspend fun deleteNode(note: Note)
}