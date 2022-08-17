fun main(args: Array<String>) {


        testPrintFunction()
        testProperties()
        testConditionals()
        testIterations()
        testTypeInference()
        testComments()


        testBlockFunction(2,true)
        testExpressionFunction(5,true )
        testUnitFunction()
        testWithoutUnitFunction()

}

fun testComments() {
        //Single Line

        /*
        Multiple Line
         */
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

fun testIterations() {

        var count = 1
        while(count < 10){

                count ++
        }


        //in keyword for iteration
        val range1 = IntRange(1,7)
        val range2 = 1..9
        val range3 = 1 until 11
        val range4 = 9 downTo 1

        val range5 = 1..9 step 2

        val range6 = IntProgression.fromClosedRange(1,6,2)


        for ( i in range1){
             println(i)
        }

        for(ch in "Kotlin"){
                println(ch)
        }

        var i = 0
        repeat(10){
                println(i++)
        }

}

fun testConditionals() {

        val bool = false
        if (!bool){
                println(" test boolean false ")
        }else{
                println(" test boolean true ")
        }

        val count = 10
        if(count > 0){
                println(" Non Zero value $count")
        }
        else if( count == 0 ){
                println("  Zero :  $count")
        }
        else {
                println("  Non Zero :  $count")
        }

        //Expression if
        val evenOdd  = if (count %2 == 0) 0 else 1

        when(count){
                 1 -> "Monday"
                 2 -> "Tuesday"
        }


        //in as membership
        val range = IntRange(1,10)
        val range2 = 'a'..'z'

        if( 5 in range) println( " 5 is there ")

        if('c' in range2) println( " c is there in alphabet")



}

fun testPrintFunction() {
        println("Programming 101!")
}

fun testProperties() {

        val input = 1

        //input = 10

        println("Value of input : $input")

        var input2 = "test"
        input2 = " me "

        println("Value of input : $input2")
}

fun testWithoutUnitFunction () {
        println(" This is function block body with implicit  Unit Return type ")
}

fun testUnitFunction () : Unit {
        println(" This is function block body  with explicit Unit Return type ")
}

//Method Signature  fun method_name (parameter list ) : return type
fun testBlockFunction (input :Int ,bool :Boolean): Int {

        println(" This is function block body ")
        return 0
}

//Expression Body
fun testExpressionFunction (input :Int ,bool :Boolean) =  input * 5

