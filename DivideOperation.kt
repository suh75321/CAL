package com.example.myapplication


class DivideOperation : AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double {
        require(num2 != 0) { "Divide by Zero" }
        return (num1.toDouble() / num2.toDouble())
    }
}
