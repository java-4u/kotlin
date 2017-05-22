import java.util.*

/**
 * Created by karthik on 22-05-2017.
 */


fun main(args : Array<String>){

    // range
    println("#List ")
    var list = listOf(1,2,3,4,5)
    for(i in list) println("I : $i")
    println("_____________")

    println("#List with Index ")
    var list1 = listOf(1,2,3,4,5)
    for((i,e) in list1.withIndex()) println("E : $e, I : $i")
    println("_____________")

    println("#Map with key-Value ")
    var map = TreeMap<String,Int>()
    map["mobile"] = 909090
    for((k,v) in map) println("key : $k, Value : $v")
    println("_____________")

}

