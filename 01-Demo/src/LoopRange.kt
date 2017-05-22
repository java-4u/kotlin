/**
 * Created by karthik on 22-05-2017.
 */


fun main(args : Array<String>){

    // range
    println("#Range Inc By 1")
    var nums = 1..5
    for(i in nums) println("I : $i")
    println("_____________")

    println("#Range Inc By Step 2")
    var nums1 = 1..5
    for(i in nums1 step 2) println("I : $i")
    println("_____________")

    println("#Range in desc order #1")
    var nums2 = 1..5
    for(i in nums2.reversed()) println("I : $i")
    println("_____________")

    println("#Range in desc order #2")
    var nums3 = 5 downTo 1
    //var nums3 = 5.downTo(1)
    for(i in nums3) println("I : $i")
    println("_____________")

    println("#Range in desc order #2 by step2")
    var nums4 = 5 downTo 1
    for(i in nums4 step 2) println("I : $i")
    println("_____________")

    println("#Range in  until")
    var nums5 = 1 until 5
    for(i in nums5) println("I : $i")
    println(" Total Count : ${nums5.count()}")
    println("_____________")

    println("#Range of 'A' .. 'z'")
    var nums6 = 'A'..'z'
    for(i in nums6) println("I : $i")
    println(" Total Count : ${nums6.count()}")
    println("_____________")
}

