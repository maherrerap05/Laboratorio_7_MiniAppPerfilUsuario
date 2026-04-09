package com.example.lab

import androidx.compose.runtime.collectAsState
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.core.view.KeyEventDispatcher.Component
import com.example.lab.ui.user.UserScreen
import com.example.lab.ui.user.UserViewModel

class MainActivity: ComponentActivity() {
    private val vm: UserViewModel by viewModels()

    override fun onCreate(savedInstanteState:Bundle?) {
        super.onCreate(savedInstanteState)

        setContent{
            val state = vm.state.collectAsState().value
            UserScreen(state)
        }
    }
}