package org.guivic

class SquareManager(val side: Int): Shape {
    override fun calculateArea(): Int {
        return side * side
    }

    override fun calculatePerimeter(): Int {
        return side * 4
    }

}