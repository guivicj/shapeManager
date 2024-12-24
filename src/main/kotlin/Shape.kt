package org.guivic

interface Shape {
    fun calculateArea(): Int
    fun calculatePerimeter(): Int
    fun resultTitle() {
        println("Shape Data")
    }
}