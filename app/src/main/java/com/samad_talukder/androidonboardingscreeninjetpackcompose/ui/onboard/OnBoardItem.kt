package com.samad_talukder.androidonboardingscreeninjetpackcompose.ui.onboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samad_talukder.androidonboardingscreeninjetpackcompose.model.OnBoardModel


@Composable
fun OnBoardItem(page: OnBoardModel) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = page.imageRes),
            contentDescription = null,
            modifier = Modifier
                .height(350.dp)
                .width(350.dp)
                .padding(bottom = 20.dp)
        )
        Text(
            text = page.title, style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF232B39),
                textAlign = TextAlign.Center,
            )
        )
        Text(
            text = page.description,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 10.dp),
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.W400,
                color = Color(0xFF707784),
                textAlign = TextAlign.Center,
            )
        )


    }

}

