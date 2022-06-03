package com.plcoding.cleanarchitecturenoteapp.feature.note.data.repository

import com.plcoding.cleanarchitecturenoteapp.feature.note.data.data_source.NoteDao
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.model.Note
import kotlinx.coroutines.flow.Flow

/**
 * Created by burak on 04.06.22
 */
class NoteRepositoryImpl(
    private val dao: NoteDao
) : NoteRepository {
    override fun getNotes(): Flow<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Note? {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note) {
        return dao.insertNote(note)
    }

    override suspend fun deleteNode(note: Note) {
        return dao.deleteNode(note)
    }
}