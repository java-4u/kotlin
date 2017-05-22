/**
 * Created by karthik on 22-05-2017.
 */

fun main(args : Array<String>){
  var value : String = "100"
    println("String value : $value")
    var num : Int = value.toInt()
    println("Int value : $value")

    var loop = 1..5
    for (i in loop) {
        num++
        println("Num : $num")
    }

}
