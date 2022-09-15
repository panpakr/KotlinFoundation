fun main() {

    testTypeInference()
}

fun testTypeInference() {

    /*
     val/var identifier : Type  = Intialiazation
     */

    //Int ,Byte ,Number
    //Char
    //String
    //Float ,Double
    //Boolean

    val number : Int = 10_000
    val numByte : Byte = 127
    //val numMaxByte : Byte = 128
    val numShort : Short = 32567
    // val numMaxShort : Short = 65536
    val numLong :Long = 123456

    println(Long.MAX_VALUE)

    val char : Char = 'q'
    val string : String = "hello"
    val lines : String = """ this
                is a good 
                boy"""

    val flValue : Float = 0.5f
    val dobValue : Double = 0.8
}
