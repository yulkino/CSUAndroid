package com.example.csuandroid

data class Student(val Name: String, val Course: Int)
{
    override fun toString(): String {
        return "$Name $Course курс"
    }
}