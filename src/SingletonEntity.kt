object EnitityFactory {
    fun create() = SingletonEntity("123","Kotlin")
}

class SingletonEntity(val id: String, val name: String) {

    override fun toString(): String {
        return "id : $id,name: $name"
    }

}

fun main() {
    val entity = EnitityFactory.create()
    println(entity.toString())
}