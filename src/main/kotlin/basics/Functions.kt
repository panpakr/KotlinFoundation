fun main() {

    testUnitFunction()
    testWithoutUnitFunction()

    testBlockFunction(2,true)
    testExpressionFunction(5,true )

    testExpressionBody(true)


    testDefaultArguments("Ram", 25)
    testDefaultArguments("Shyam")


    testNamedArguments("Jack"  , "Daniels")
    testNamedArguments("Daniels"  , "Jack")


    testNamedArguments(secondName = "Jack"  , firstName = "Daniels")
    testNamedArguments(firstName = "Chris"  , secondName = "Rock")

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
fun testExpressionFunction (input :Int ,bool :Boolean) = input * 5

fun testExpressionBody (bool :Boolean) = if(bool) 5 else "me"

fun testDefaultArguments(name : String , age : Int = 18) =  "$name is $age years old"

fun testNamedArguments(firstName : String , secondName : String) = "My Name is $firstName + $secondName"


fun testExpressionFunction (input :Int ,bool :Boolean,range: IntRange)
{
    val res =
        if(bool) {
            5
        } else {
            "abc"
        }
}


fun tryExpressionBehaviours(){

    println( testExpressionFunction(5 , false ,1..5))
    println( testExpressionFunction(5 , true ,1..5))

    var test1 = testExpressionFunction(5 , false ,1..5)
    println(test1)
    test1 = testExpressionFunction(5 , true ,1..5)

    println(test1)

    var test2 :Any = 1
    test2 = "tetete"

}

