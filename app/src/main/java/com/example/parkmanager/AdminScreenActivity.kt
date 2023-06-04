package com.example.parkmanager

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable

class AdminScreenActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent { AdminAccessScreen() }
    }
}

/**
 * Administrator access screen.
 */
@Composable
fun AdminAccessScreen() {
}