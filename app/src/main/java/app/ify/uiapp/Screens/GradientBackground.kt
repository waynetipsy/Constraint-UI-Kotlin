package app.ify.uiapp.Screens

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import app.ify.uiapp.R

@Composable
fun BackgroundGradient(modifier: Modifier){

    Image(painter = painterResource(id = R.drawable.bluegradient),
        contentDescription = "Main Background",
        contentScale = ContentScale.FillBounds,
        modifier = modifier.alpha(0.4f)
    )

}