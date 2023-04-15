fun main(args: Array<String>) {
    println("Willkommen zum Gößer/Kleiner Spiel!")


    println("1. Zahl:")

    val zahl1 = readLine()!!.toInt()


    println("2. Zahl:")

    val zahl2 = readLine()!!.toInt()


    if(zahl1 < zahl2){
        println("$zahl1 < $zahl2")
    }

    if(zahl2 < zahl1){
        println("$zahl2 < $zahl1")
    }

    if(zahl1 == zahl2){
        println("$zahl1 == $zahl2")
    }
}