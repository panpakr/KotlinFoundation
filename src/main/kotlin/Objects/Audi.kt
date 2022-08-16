package Objects

class Audi(val version :String ) {

    init {
        println("Primary  Constructor $version")
    }

  /* constructor(var version :String, var gears :Int ) :this(version){

        //var not supported in secondary constructor
    }


   */

    constructor( version :String, gears :Int ) :this(version){
        println("Secondary Constructor $version")
    }


}

fun main(args: Array<String>) {

    val audi = Audi("A5")

    val secondaryAudi = Audi("A3 ",5)

    println(audi.version)
    println(secondaryAudi.version)
}