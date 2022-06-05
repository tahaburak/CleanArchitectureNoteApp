package com.plcoding.cleanarchitecturenoteapp.feature.note.presentation.util

/**
 * Created by burak on 05.06.22
 */
sealed class Screen(val route: String) {
    object NotesScreen : Screen("notes_screen")
    object AddEditNoteScreen : Screen("add_edit_note_screen")
}