/**
 * Created by karthik on 21-05-2017.
 */


fun main(args : Array<String>){
    val value : Int = 15

    when(value){
        2 ->  println("$value is correct")
        3 ->  println("$value is correct")
        4 ->  println("$value is correct")
        5 ->  println("$value is correct")
        else ->  println("$value is incorrect")
    }


    var result = when(value){
        2 ->  "Two"
        3 ->  "Three"
        4 ->  "Four"
        5 ->  "Five"
        else ->  "incorrect value $value"
    }
    println("Result : $result")
}

