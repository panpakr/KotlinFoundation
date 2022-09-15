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

        //Immutable Property : Value
        val input = 1    //==> val input :Int = 1
        // input = 10     //==> Val cannot be reassigned -> Compilation Error
        println("Value of input : $input")

        //Mutable Property : Variable
        var input2 = "test"
        input2 = " me "

        println("Value of input : ${input2.uppercase()}")

        //Value usage late assignment
        val input3 : Int
       // println("Value of input : $input3")    //==>  Variable 'input3' must be initialized -> Compilation Error
        input3 = 19

        println("Value of input : $input3")

        //input3 = 29  //==> Val cannot be reassigned -> Compilation Error

        //Variable usage late assignment
        var input4 : String
        input4 = "te"
        println("Value of input : $input4")
        input4 = "hi"
        println("Value of input : $input4")

}