package com.example.tictactoe

sealed class UserActions {
    object ReplayButtonClicked: UserActions()
    data class BoardTapped(val cellNo: Int): UserActions()

}