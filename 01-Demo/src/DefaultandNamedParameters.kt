/**
 * Created by karthik on 22-05-2017.
 */

fun main(args : Array<String>){
   var result = interest(400)
    println("Interest Amount is  $result")
    // named parameter
    var result1 = interest(amount = 500, interest = 0.15)
    println("Interest Amount is  $result1")
}

//  Default is  (Double = 0.05)
// @JvmOverloads for method overloads
@JvmOverloads
fun interest(amount: Int, interest: Double = 0.05): Int {
    return (amount + amount*interest).toInt()
}