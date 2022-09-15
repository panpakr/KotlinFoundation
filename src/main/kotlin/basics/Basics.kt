fun main() {

        testPrintFunction()
        testProperties()
        testComments()
}
fun testComments() {
        //Single Line

        /*
        Multiple Line
         */
}

fun testPrintFunction() {
        println("Programming 101!")
}

fun testProperties() {

        val input = 1    // ==> val input :Int = 1

       // val input3 : Int

       // println("Value of input : $input3")
       // input3 = 19


        //input3 = 29
        //input = 10

        println("Value of input : $input")

        var input2 = "test"
        input2 = " me "

        var input4 : String
        input4 = "te"
        println("Value of input : $input4")
        input4 = "hi"

        println("Value of input : ${input2.toUpperCase()}")
}