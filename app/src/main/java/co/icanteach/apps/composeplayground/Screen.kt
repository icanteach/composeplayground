package co.icanteach.apps.composeplayground

sealed class Screen(val route: String) {
    object Text : Screen("playground_text")
    object Home : Screen("playground_home")
}