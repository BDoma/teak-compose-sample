package teak.sample.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import sample.logic.counter.Contract
import sample.logic.counter.counterInit
import sample.logic.counter.counterUpdate
import teak.framework.compose.WithTeak
import teak.sample.compose.ui.theme.TEAKSampleComposeTheme

@Composable
fun CounterScreen() {
    WithTeak(init = ::counterInit, update = ::counterUpdate) { model, dispatch ->
        CounterScreen(model, dispatch)
    }
}

@Composable
private fun CounterScreen(model: Contract.Model, dispatch : (Contract.Msg) -> Unit = {}) {
    Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically, modifier = Modifier
        .padding(32.dp)
        .fillMaxSize()) {
        Button(onClick = { dispatch(Contract.Msg.Dec) }) {
            Text(text = stringResource(id = R.string.dec))
        }
        Text(text = model.value.toString(), modifier = Modifier.padding(16.dp))
        Button(onClick = { dispatch(Contract.Msg.Inc) }) {
            Text(text = stringResource(id = R.string.inc))
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CounterPreview() {
    TEAKSampleComposeTheme {
        CounterScreen(Contract.Model(1))
    }
}