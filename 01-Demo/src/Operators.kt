/**
 * Created by karthik on 21-05-2017.
 */
@file:JvmName("Operator")

fun main(args : Array<String>){
    val num1 : Int = 100
    val num2 : Int = 50

    val addResult: Int = sum(num1 , num2)
    val subResult  = sub(num1 , num2)
    val mulResult  = mul(num1 , num2)
    val divResult  = div(num1 , num2)
    val divResult1  = div1(num1 , num2)


    println("Add  $num1 and $num2 , Value is $addResult")
    println("Subtract  $num1 and $num2 , Value is $subResult")
    println("Multiply  $num1 and $num2 , Value is $mulResult")
    println("Divide $num1 and $num2 , Value is $divResult")
    println("Divide $num1 and $num2 , Value is $divResult1")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sub(a: Int, b: Int): Int {
    return a + b
}

fun mul(a: Int, b: Int): Int {
    return a + b
}

fun div(a: Int, b: Int): Int {
    return a + b
}

fun div1(a: Int, b: Int): Int = a + b









