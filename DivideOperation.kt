package com.example.myapplication


class DivideOperation : AbstractOperation() {
    @Throws(ArithmeticException::class)
    override fun operate(num1: Int, num2: Int): Double {
        require(num2 != 0) {
            ArithmeticException( "Divide by Zero")
        }
        return (num1 / num2).toDouble()
    }
}