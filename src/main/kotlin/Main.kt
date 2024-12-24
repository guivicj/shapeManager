package org.guivic

fun main() {

    val square = SquareManager(10)
    square.resultTitle()
    println(square.calculatePerimeter())
    println(square.calculateArea())
    val rectangle = RectangleManager(10, 7)
    rectangle.resultTitle()
    println(rectangle.calculatePerimeter())
    println(rectangle.calculateArea())

}