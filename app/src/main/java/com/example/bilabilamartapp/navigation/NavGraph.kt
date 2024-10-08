package com.example.bilabilamartapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.bilabilamartapp.admin.AdminHomeScreen
import com.example.bilabilamartapp.admin.AdminHomeScreenPreview
import com.example.bilabilamartapp.admin.Inventory

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
){
    NavHost(
        navController = navController,
        startDestination = AdminHomeScreen.route,
        modifier = modifier
    ){
        composable(route = AdminHomeScreen.route){
            AdminHomeScreen(
                navigateToInventory = { navController.navigate(Inventory.route)}
            )
        }

        //
        composable(route = Inventory.route){
            Inventory(

            )
        }
    }
}


