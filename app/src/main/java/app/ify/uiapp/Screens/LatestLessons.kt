package app.ify.uiapp.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.ify.uiapp.R

@Composable
fun LatestLessonsText(modifier: Modifier){
    Text(text = "Latest Lessons",
        fontSize = 20.sp,
        color = Color.White,
        fontWeight = FontWeight.Bold,
        modifier = modifier
        )
}

@Composable
fun SeeAllText(modifier: Modifier){
    Text(text = "See All",
        fontSize = 20.sp,
        color = Color.Blue,
        modifier = modifier
    )
}

 @Composable
 fun LessonCard(modifier: Modifier) {
    Card (elevation = CardDefaults.cardElevation(8.dp),
           shape = RoundedCornerShape(12.dp),
           modifier = modifier
        ){
        Box(modifier = Modifier
            .padding(top = 16.dp, bottom = 16.dp)
            .wrapContentSize(Alignment.TopStart)
            .fillMaxHeight()
            .background(Color.White)
        ){
            Spacer(modifier = Modifier.width(8.dp))

            ConstraintLayout (modifier = Modifier.fillMaxSize()){

                val(lessondate, timeImg, lessonSchedule,
                    lessonImg, lessonTitle, lessonDesc) = createRefs()

                Text(
                   text = "Lesson Date",
                    color = Color.Gray,
                    modifier = Modifier.constrainAs(lessondate){
                        top.linkTo(parent.top, 16.dp)
                        start.linkTo(parent.start, 24.dp)
                    }
                )
                Image(painter = painterResource(id = R.drawable.time),
                    contentDescription = "Time",
                    modifier = Modifier.constrainAs(timeImg){
                        top.linkTo(lessondate.bottom, margin = 8.dp)
                        start.linkTo(lessondate.start)
                    }

                )

                Text(text = "Thur jun 6 | 8:00 - 8:30 AM",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black,
                    modifier = Modifier.constrainAs(lessonSchedule){
                        top.linkTo(timeImg.top)
                        start.linkTo(timeImg.end, 4.dp)
                    }
                    )
                Image(painter = painterResource(id = R.drawable.data),
                    contentDescription = "Data Structure",
                    modifier = Modifier.constrainAs (lessonImg){
                     top.linkTo(timeImg.bottom, margin = 16.dp)
                        start.linkTo(timeImg.start)
                        bottom.linkTo(parent.bottom, margin = 16.dp)

                    }.size(60.dp)
                )

                Text(text = "Data Structures $ Alogrithms",
                   fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier.constrainAs(lessonTitle) {
                        top.linkTo(lessonImg.top)
                        start.linkTo(lessonImg.end, 12.dp)
                    }
                    )

                Text(text = "Top be a pro Developer, you need to master data structures and alogorithms",
                    fontSize = 8.sp,
                    color = Color.White,
                    modifier = Modifier.constrainAs(lessonTitle) {
                        top.linkTo(lessonTitle.bottom, 2.dp)
                        start.linkTo(lessonTitle.start)

                    }.padding(end = 4.dp)
                )
            }

    }}
 }