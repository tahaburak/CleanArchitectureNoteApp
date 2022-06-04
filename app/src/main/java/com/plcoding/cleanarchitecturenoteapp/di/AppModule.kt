package com.plcoding.cleanarchitecturenoteapp.di

import android.app.Application
import androidx.room.Room
import com.plcoding.cleanarchitecturenoteapp.feature.note.data.data_source.NoteDatabase
import com.plcoding.cleanarchitecturenoteapp.feature.note.data.repository.NoteRepositoryImpl
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.repository.NoteRepository
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.use_case.DeleteNote
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.use_case.GetNotes
import com.plcoding.cleanarchitecturenoteapp.feature.note.domain.use_case.NoteUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by burak on 04.06.22
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository)
        )
    }
}