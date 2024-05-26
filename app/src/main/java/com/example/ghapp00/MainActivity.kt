package com.example.ghapp00

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.ghapp00.MainActivity.Companion.TAG
import com.example.ghapp00.ui.theme.Ghapp00Theme

class MainActivity : ComponentActivity() {

    companion object {
        const val TAG = "my:MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        "onCreate".log()
        enableEdgeToEdge()
        setContent {
            Ghapp00Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    MyApp()
                }
            }
        }
    }
}


private fun String.log() {
    Log.d(TAG, this)
}

// ----- Functions (Composable) -----

@Composable
fun MyApp() {
    Column(
        modifier = Modifier.fillMaxSize(),
        //.background(color = Color.Gray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = LocalContext.current.packageName)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyAppPreview() {
    Ghapp00Theme {
        MyApp()
    }
}