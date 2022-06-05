package com.plcoding.cleanarchitecturenoteapp.feature.note.domain.use_case

/**
 * Created by burak on 04.06.22
 */
data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)
