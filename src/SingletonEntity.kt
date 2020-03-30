import java.util.*

enum class EntityTypes{
    EASY,MEDIUM,HARD;

    fun getFormattedName() = name.toLowerCase().capitalize()
}

object EnitityFactory {
    fun create(type: EntityTypes) : SingletonEntity{
        val id = UUID.randomUUID().toString()
        val name = when(type){

            EntityTypes.EASY -> type.getFormattedName()
            EntityTypes.MEDIUM ->type.getFormattedName()
            EntityTypes.HARD -> type.getFormattedName()
        }
        return SingletonEntity(id,name)
    }
}

class SingletonEntity(val id: String, val name: String) {

    override fun toString(): String {
        return "id : $id,name: $name"
    }

}

fun main() {
    val entityEasy = EnitityFactory.create(EntityTypes.EASY)
    println(entityEasy.toString())

    val entityMed = EnitityFactory.create(EntityTypes.MEDIUM)
    println(entityMed.toString())


    val entityHard = EnitityFactory.create(EntityTypes.HARD)
    println(entityHard.toString())
}