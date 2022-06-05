package com.plcoding.cleanarchitecturenoteapp.feature.note.domain.use_case

import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.repository.NoteRepository

/**
 * Created by burak on 05.06.22
 */
class GetNote(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}