package br.senai.sp.jandira.mytrips.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.R


@Composable
fun TelaInicial(modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Card(
            modifier = Modifier
                .width(95.dp)
                .height(40.dp)
                .align(Alignment.BottomStart),
            shape = RoundedCornerShape(
                topEnd = 32.dp,

            ),
            colors = CardDefaults.cardColors(
                containerColor = Color.Black
            )
        ) {
        }
        Card(
            modifier = Modifier
                .width(95.dp)
                .height(40.dp)
                .align(Alignment.BottomStart),
            shape = RoundedCornerShape(
                topEnd = 32.dp,
                topStart = 0.dp,
                bottomEnd = 0.dp,
                bottomStart = 20.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color.Black
            )
        ){


        }
        Column (
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .padding(horizontal = 15.dp)
        ){

        }
        Column (
            modifier = Modifier
                .padding(top = 50.dp)
        ){
            Text(
                text =  stringResource(R.string.Login),
                color = Color.Blue,
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(R.string.oi),
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        }
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.End,
        ){
            Column {
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top= 8.dp),
                    shape = RoundedCornerShape(20.dp),
             leadingIcon = {
                 Icon(imageVector = Icons.Default.Email,
                     contentDescription = ""
                 )
             },
                    label = { Text(text = stringResource(R.string.Email)) }
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top= 8.dp),
                    shape = RoundedCornerShape(20.dp),
                    label = {
                        Text(text = stringResource(R.string.Password))}

                )
            }
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(12.dp)
                    .height(45.dp),
                colors = ButtonDefaults.buttonColors(
                    Color.Blue
                ),

            ) {

            }
        }
    }

}
@Preview(showSystemUi = true)
@Composable
private fun TelaInicialPreview(){
    TelaInicial()
}


