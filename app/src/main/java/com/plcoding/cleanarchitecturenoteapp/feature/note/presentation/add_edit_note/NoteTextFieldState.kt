package com.plcoding.cleanarchitecturenoteapp.feature.note.presentation.add_edit_note

/**
 * Created by burak on 05.06.22
 */
data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)
