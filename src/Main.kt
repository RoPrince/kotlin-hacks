val name = "rosh"
var greeting = "welcome"

fun getJob(): String = "software"

fun sayNothing() {
    println("return nothing")
}
fun helloName( hell: String): String {
 return "Hello $hell"
}


fun main() {
    val cars = arrayOf("swift","kia","ford");
    println(cars[0].plus("red"));

   cars.forEach { car ->println(car) }
    cars.forEachIndexed{index,car->println(car)}

    val sample = Sample("Kes","Ram")
    sample.firstName
    sample.nickName = "Mars"
    sample.nickName = "Venus"
    println(sample.nickName)
}


