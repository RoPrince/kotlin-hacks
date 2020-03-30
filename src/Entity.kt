interface  idProvider{
fun getId(): String
}

class Entity private constructor(val id: String){

    companion object Factory : idProvider {
        override fun getId(): String {
            return "233";
        }

        const val id = "id"
        fun create() = Entity(getId())
    }
}

fun main(){
    val entity = Entity.Factory.create();
    entity.id
}