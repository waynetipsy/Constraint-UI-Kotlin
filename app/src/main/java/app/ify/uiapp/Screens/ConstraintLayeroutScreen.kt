package app.ify.uiapp.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
fun ConstraintLayoutScreen(modifier: Modifier, function: @Composable () -> Unit) {
    ConstraintLayout (
        modifier = Modifier
            .background(MaterialTheme.colorScheme.surface)
            .fillMaxSize()
            // Enable vertical scrolling
            .verticalScroll(rememberScrollState())
    ){
          // 1- Creating the Reference for Composable
        // that will be constrained with the layout
        val(gradientBackground, profileImg, notificationImg,
             welcomeText, questionText, joinBtn, coursesImg, card,
            newCourses, androidImg, javaImg, pythonImg, androidText,
            javaText, pythonText
        ) = createRefs()

        // createRef() can hold up to 16 element
        val(latestLessonsText, seeAllText,lessonCard ) = createRefs()

        // GuideLine
        val horizontalGuideline1 = createGuidelineFromTop(0.45f)

      BackgroundGradient(modifier = Modifier
          .constrainAs(gradientBackground){
           top.linkTo(parent.top)
           end.linkTo(parent.end)
           start.linkTo(parent.start)
           bottom.linkTo(horizontalGuideline1)
           width = Dimension.fillToConstraints
           height = Dimension.fillToConstraints
      })

        // 2- Header: (Chain example)
        val topGuideline = createGuidelineFromTop(28.dp)
        val startGuideline = createGuidelineFromStart(16.dp)
        val endGuideline = createGuidelineFromEnd(16.dp)

        // chain
        createHorizontalChain(profileImg, notificationImg,
            chainStyle = ChainStyle.SpreadInside
        )
       ProfileImage(modifier = Modifier.constrainAs(profileImg) {
           top.linkTo(topGuideline)
       })

        NotificationImage(modifier = Modifier.constrainAs (notificationImg){
            top.linkTo(profileImg.top)
            bottom.linkTo(profileImg.bottom)
        })

        // 3- The Middle Part
        WelcomeText(modifier = Modifier.constrainAs(welcomeText) {
                top.linkTo(profileImg.bottom, margin = 32.dp)
                start.linkTo(startGuideline)
            } )

         QuestionText(modifier = Modifier.constrainAs(questionText){
             top.linkTo(welcomeText.bottom, margin = 8.dp)
             start.linkTo(welcomeText.start)
         })
         JoinNowButton(modifier = Modifier.constrainAs(joinBtn){
             top.linkTo(questionText.bottom, margin = 32.dp)
             start.linkTo(questionText.start)
             end.linkTo(questionText.end)
         })

        CoursesImage(modifier = Modifier.constrainAs(coursesImg) {
            bottom.linkTo(horizontalGuideline1)
            end.linkTo(endGuideline)

            //start.linkTo(joinBtn.end, margin = 8.dp)
            top.linkTo(joinBtn.bottom, margin = 8.dp)

            width = Dimension.value(260.dp)
            height = Dimension.fillToConstraints
        })

        // 4- The Card
        MyCard(modifier = Modifier.constrainAs(card){
          top.linkTo(horizontalGuideline1, margin = (-4).dp)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(parent.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        // Our Courses Section
        TextOurCourses(modifier = Modifier.constrainAs(newCourses) {
              top.linkTo(card.top, margin = 24.dp)
              start.linkTo(card.start, margin = 16.dp)
        })

        AndroidCourseImg(modifier = Modifier
            .constrainAs(androidImg){
         top.linkTo(newCourses.bottom, margin = 16.dp)
        })

        JavaCourseImg(modifier = Modifier.constrainAs(javaImg){
            top.linkTo(androidImg.top)
            bottom.linkTo(androidImg.bottom)
        })
        PythonCourseImg(modifier = Modifier.constrainAs (pythonImg){
            top.linkTo(androidImg.top)
            bottom.linkTo(androidImg.bottom)
        })

        // Chain the 3 images
        createHorizontalChain(
            androidImg, javaImg, pythonImg,
            chainStyle = ChainStyle.Spread

        )

        AndroidText(modifier = Modifier.constrainAs(androidText){
            top.linkTo(androidImg.bottom, margin = 12.dp)
            start.linkTo(androidImg.start)
            end.linkTo(androidImg.end)
        })

        JavaText(modifier = Modifier.constrainAs(javaText){
            top.linkTo(javaImg.bottom, margin = 12.dp)
            start.linkTo(javaImg.start)
            end.linkTo(javaImg.end)
        })

        PythonText(modifier = Modifier.constrainAs(pythonText){
            top.linkTo(pythonImg.bottom, margin = 12.dp)
            start.linkTo(pythonImg.start)
            end.linkTo(pythonImg.end)
        })

        // Latest Lesson Part
        LatestLessonsText(modifier = Modifier
            .constrainAs(latestLessonsText){
            top.linkTo(androidText.bottom, margin = 30.dp)
                start.linkTo(startGuideline)
        })
        SeeAllText(modifier = Modifier
            .constrainAs(seeAllText){
                top.linkTo(latestLessonsText.top)
                end.linkTo(endGuideline)
            })
        LessonCard(modifier = Modifier
            .constrainAs (lessonCard){
            top.linkTo(latestLessonsText.bottom, margin = 16.dp)
            start.linkTo(latestLessonsText.start)
            end.linkTo(endGuideline)
            width = Dimension.fillToConstraints
            height = Dimension.wrapContent
        })
       }
    }





