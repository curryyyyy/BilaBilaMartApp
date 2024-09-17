package com.example.bilabilamartapp.admin

import android.content.res.Resources
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.bilabilamartapp.R
import com.example.bilabilamartapp.navigation.NavigationDestination
import com.example.bilabilamartapp.ui.theme.BilaBilaMartAppTheme

object AdminHomeScreen : NavigationDestination {
    override val route = "home"
    override val titleRes = R.string.app_name
}

@Composable
fun AdminHomeScreen(
    modifier: Modifier = Modifier,
    navigateToInventory:() -> Unit,
){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Row {
            Button(
                onClick = navigateToInventory,
            )
            {
                Text(text = "Inventory")
            }
        }

        Row {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Announcement")
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun AdminHomeScreenPreview(){
    BilaBilaMartAppTheme{
        AdminHomeScreen()
    }
}