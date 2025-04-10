package app.ify.uiapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import app.ify.uiapp.Screens.ConstraintLayoutScreen
import app.ify.uiapp.ui.theme.UIAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UIAppTheme {
                ConstraintLayoutScreen(Modifier.fillMaxSize()) {
                    Text(
                        text = "Lesson Card",
                        color = Color.Gray,
                        modifier = Modifier.const
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UIAppTheme {
        Greeting("Android")
    }
}