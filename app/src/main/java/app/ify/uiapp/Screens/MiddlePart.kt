package app.ify.uiapp.Screens

import androidx.compose.foundation.Image
import app.ify.uiapp.R
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import java.lang.reflect.Modifier

@Composable
fun WelcomeText(modifier: androidx.compose.ui.Modifier){
    Text(text = "Welcome Back",
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        color = Color.White,
        modifier = modifier
    )
}

@Composable
fun QuestionText(modifier: androidx.compose.ui.Modifier) {
    Text(
        text = "What do you want to do Today?",
        color = Color.White,
        modifier = modifier
    )
}

 @Composable
 fun JoinNowButton(modifier: androidx.compose.ui.Modifier){
     Button( onClick = { },
         modifier = modifier
     ) {
     Text(text = "Join Now!")
     }
 }

  @Composable
  fun CoursesImage(modifier: androidx.compose.ui.Modifier){
      Image(
          painter = painterResource(id = R.drawable.courses),
         contentDescription = "Courses",
         modifier = modifier
      )
  }