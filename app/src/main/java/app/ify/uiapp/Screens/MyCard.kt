package app.ify.uiapp.Screens

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
 fun MyCard(modifier: Modifier){
    Card(elevation = CardDefaults.cardElevation(8.dp),
        colors = CardDefaults.cardColors(),
         shape = RoundedCornerShape(
             topStart = 32.dp,
             topEnd = 32.dp),
        modifier = modifier
        ) {
    }
 }