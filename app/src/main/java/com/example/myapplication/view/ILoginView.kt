package com.example.myapplication.view

interface ILoginView {
    fun OnLoginSuccess(message: String?)
    fun OnLoginError(message: String?)

}