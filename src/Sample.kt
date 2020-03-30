class Sample(val firstName: String,val secondName: String) {

constructor(): this("Pet","Parker")
    var nickName: String? =null
    set(value){
        field = value
        println("New nickName is $field")
    }

    get() {
        println("Return valus is $field")
        return field
    }



}