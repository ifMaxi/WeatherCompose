package com.maxidev.weather.ui.presentation.components

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.maxidev.weather.R
import com.maxidev.weather.ui.components.WeatherButton
import com.maxidev.weather.ui.theme.soraFamily

// Simulates an error screen when you do not have internet access.
@Composable
fun ErrorScreen(
    @StringRes errorText: Int,
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(1f))
        LottieComponent(animation = R.raw.fail_weather)
        Text(
            text = stringResource(id = errorText),
            fontFamily = soraFamily,
            fontWeight = FontWeight.Medium,
            fontSize = 24.sp
        )
        Spacer(modifier = Modifier.weight(1f))
        WeatherButton(
            text = R.string.re_connect,
            onClick = onClick
        )
    }
}