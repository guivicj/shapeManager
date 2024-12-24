package org.guivic

class RectangleManager(val width: Int, val height: Int): Shape {
    override fun calculateArea(): Int {
        return width * height
    }

    override fun calculatePerimeter(): Int {
        return (width * 2) + (height * 2)
    }
}