/**
 * Created by karthik on 21-05-2017.
 */


fun main(args : Array<String>){
    val val1 : String? = "Kotlin"
    val val2 : String? = "kotlin"

    // try
    /*
          if(val1.equals(val2))
          if(val1.equals(val2, tru))
          if(val1==val2)
     */



    if(val1.equals(val2))
        println("Comparing $val1 and $val2 , Result : ${val1.equals(val2,true)}")
    else
        println("Comparing $val1 and $val2 , Result :${val1.equals(val2,true)}")



}




