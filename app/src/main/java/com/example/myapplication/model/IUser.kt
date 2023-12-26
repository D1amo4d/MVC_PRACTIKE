package com.example.myapplication.model

interface IUser {
    fun getEmail(): String?
    fun getPassword(): String?
    fun isValid(): Int
}