package io.project.notesappmvvm

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//Now we'll create object of retrofit
//and that is singleton i.e only one obj. throughout the application
//and here hilt will help us to define the singleton

//For hilt we need a application class that will be our entry pt.

@HiltAndroidApp
class NoteApplication : Application(){
}