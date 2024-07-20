package com.example.tarea1_dispositivosmoviles

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        val ref = when (referrer) {
            null -> "Doesn't have a referrer."
            else -> "Has a referrer named Amanda, who likes to play tennis."
        }
        println("Name: $name \nAge: $age \nLikes to $hobby. $ref\n")
    }
}