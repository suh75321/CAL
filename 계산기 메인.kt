package com.example.myapplication






fun main() {


    val addCalc = Calculator(AddOperation())
    println("10 더하기 20 결과는 : ${addCalc.operate(10,20)} 입니다")

    val subCalc = Calculator(SubstractOperation())
    println("10 빼기 20 결과는 : ${subCalc.operate(10, 20)} 입니다")

    val mulCalc = Calculator(MultiplyOperation())
    println("10 곱하기 20 결과는 : ${mulCalc.operate(10, 20)} 입니다")

    val divCalc = Calculator(DivideOperation())
    println("10 나누기 20 결과는 : ${divCalc.operate(10, 20)} 입니다")
}