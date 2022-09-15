fun main() {

    testConditionals()
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