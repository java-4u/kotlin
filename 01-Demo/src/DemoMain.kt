/**
 * Created by karthik on 21-05-2017.
 */
fun main(args:Array<String>){
    println("Hello Demo")
    println("______________________")
    // Create an Object of Person

    var person = Person()
    var ageVal = 20
    person.name = "KotlinUser"
    person.gender.value = "Male"
    person.age = ageVal
    // Two Ways we can print the output
    println("Person Name : "+person.name)
    println("Person Name : ${person.name}")
    println("Person Is Active : ${person.active}")
    println("Person Gender : ${person.gender.value}")
    println("Person Age is assigned as  '$ageVal' ,  Now Age is : ${person.age}")
}
