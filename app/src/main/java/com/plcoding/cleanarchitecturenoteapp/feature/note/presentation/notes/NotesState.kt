package com.plcoding.cleanarchitecturenoteapp.feature.note.presentation.notes

import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.util.NoteOrder

/**
 * Created by burak on 04.06.22
 */
data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.DEFAULT_NOTE_ORDER,
    val isOrderSectionVisible: Boolean = false
)
