package app.ify.uiapp.Screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import app.ify.uiapp.R


@Composable
fun ProfileImage(modifier: Modifier) {
    Image(painter = painterResource(
        id = R.drawable.user),
      contentDescription = "Profile",
        modifier = modifier.padding(start = 16.dp)
            .clip(CircleShape).size(27.dp)
    )
}

 @Composable
 fun NotificationImage (modifier: Modifier) {
     Image(painter = painterResource(
         id = R.drawable.bell),
        contentDescription = "Notification",
         modifier = modifier.padding(end = 16.dp)
             .clip(CircleShape).size(30.dp)
         )
 }