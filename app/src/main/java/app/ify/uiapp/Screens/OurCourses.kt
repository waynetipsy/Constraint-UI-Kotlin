package app.ify.uiapp.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.ify.uiapp.R


@Composable
 fun TextOurCourses(modifier: Modifier){
    Text(text = "New Courses",
           modifier = modifier,
           fontSize = 20.sp,
           fontWeight = FontWeight.Bold,
          color = Color.White
        )
 }

 @Composable
 fun AndroidCourseImg(modifier: Modifier){
     Image(
       painter = painterResource(id = R.drawable.android),
       contentDescription = "Android Course",
       modifier = modifier.size(70.dp)
     )
 }

@Composable
fun JavaCourseImg(modifier: Modifier) {
    Image(
        painter = painterResource(id = R.drawable.java),
        contentDescription = "Java Course",
        modifier = modifier.size(70.dp)
    )
}

 @Composable
 fun PythonCourseImg(modifier: Modifier){
     Image(
         painter = painterResource(id = R.drawable.python),
         contentDescription = "Python Course",
         modifier = modifier.size(70.dp)
     )
 }

 @Composable
 fun AndroidText(modifier: Modifier){
     Text(text = "Android",
          //fontWeight = FontWeight.SemiBold,
          fontSize = 15.sp,
         color = Color.White,
         modifier = modifier
         )
 }

@Composable
fun JavaText(modifier: Modifier){
    Text(text = "Java",
        //fontWeight = FontWeight.SemiBold,
        fontSize = 15.sp,
        color = Color.White,
        modifier = modifier
    )
}

@Composable
fun PythonText(modifier: Modifier){
    Text(text = "Python",
        //fontWeight = FontWeight.SemiBold,
        fontSize = 15.sp,
        color = Color.White,
        modifier = modifier
    )
}