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
fun ConstraintLayoutScreen() {
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
             welcomeText, questionText, joinBtn, coursesImg
        ) = createRefs()

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
        }
    }





