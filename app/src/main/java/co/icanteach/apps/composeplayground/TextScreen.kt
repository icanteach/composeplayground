package co.icanteach.apps.composeplayground

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        MyText()
        Spacer(modifier = Modifier.height(4.dp))
        StylingMyText()
    }
}

@Composable
fun MyText() {
    Text(text = stringResource(id = R.string.jetpack_compose))
}

@Composable
fun StylingMyText() {
    Text(text = stringResource(id = R.string.jetpack_compose),
        fontStyle = FontStyle.Italic,
        color = MaterialTheme.colors.primary,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold
    )
}

@Preview
@Composable
fun MyTextPreview() {
    MyText()
}

@Preview
@Composable
fun StylingMyTextPreview() {
    StylingMyText()
}
