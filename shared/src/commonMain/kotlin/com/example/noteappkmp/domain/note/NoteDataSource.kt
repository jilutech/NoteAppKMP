package com.example.noteappkmp.domain.note

interface NoteDataSource {
    suspend fun insertNote(note: Note)
    suspend fun getNoteById(id: Long): Note?
    suspend fun getAllNote(): List<Note>
    suspend fun deleteNoteById(id: Long)
}