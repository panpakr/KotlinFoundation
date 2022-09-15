fun main() {
    testIterations()
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