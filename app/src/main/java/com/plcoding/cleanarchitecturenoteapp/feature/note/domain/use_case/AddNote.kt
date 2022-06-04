package com.plcoding.cleanarchitecturenoteapp.feature.note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.model.InvalidNoteException
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.repository.NoteRepository

/**
 * Created by burak on 04.06.22
 */
class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if (note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can't be empty")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can't be empty")
        }
        repository.insertNote(note)
    }
}