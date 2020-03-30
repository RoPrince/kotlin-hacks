interface SampleInterface {

    val providerInfo: String

    fun printInfo(sample: Sample) {
        println("In Interface: $providerInfo")
        println("In parent class")
        println("length: ${providerInfo.length}")
    }
}

open class SampleClass : SampleInterface {

    override val providerInfo: String
        get() = "BasicInfo provider"

    val sessionId = "Session"



}


fun main() {
    val baseClass = FancyClass()
    baseClass.printInfo(Sample())
}