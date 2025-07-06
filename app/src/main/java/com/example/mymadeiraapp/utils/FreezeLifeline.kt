package com.example.mymadeiraapp.utils

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//This class was made as a help for then I freeze and need a little help on something simple I'd
// remember with less pressure or I'd google in a pintch
class FreezeLifeline {

    // ===== Functions =====
    fun add(a: Int, b: Int): Int = a + b

    // ===== Data Classes =====
    data class User(val name: String, val age: Int)

    // ===== Extension Function Example =====
    fun String.isEmail() = contains("@")

    // ===== Companion Object (static-like) =====
    class Math {
        companion object {
            fun double(n: Int) = n * 2
        }
    }

    // ====== All demo code goes in main ======
    fun main() {
        // ===== Lists =====
        val list = listOf(1, 2, 3)
        val mutableList = mutableListOf("apple", "banana")
        mutableList.add("orange")
        mutableList.remove("banana")

        // Looping
        for (item in list) {
            println(item)
        }
        list.forEach { println(it) }

        // Map/filter/find
        val doubled = list.map { it * 2 }
        val evens = list.filter { it % 2 == 0 }
        val firstEven = list.find { it % 2 == 0 }

        // Sorting
        val sorted = list.sorted()
        val reversed = list.reversed()

        // ===== Maps =====
        val map = mapOf("PT" to "+351", "ES" to "+34")
        val mutableMap = mutableMapOf("A" to 1)
        mutableMap["B"] = 2

        // Access
        val ptCode = map["PT"]

        // Looping
        for ((country, code) in map) {
            println("$country = $code")
        }

        // Reverse lookup (code to country)
        fun getCountryByCode(code: String): String? = map.entries.firstOrNull { it.value == code }?.key

        println(getCountryByCode("+351")) // Should print "PT"

        // ===== Data Classes in use =====
        val user = User("Maria", 28)

        // ===== Null Safety =====
        var maybeString: String? = null
        println(maybeString?.length)      // prints 'null'
        val length = maybeString?.length ?: 0 // Elvis operator

        // ===== When Expression =====
        val score = 85
        val grade = when (score) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            else -> "C"
        }

        // ===== Extension Function Example =====
        println("me@mail.com".isEmail())

        // ===== Lambda Example =====
        val square = { x: Int -> x * x }
        println(square(4))

        // ===== Collections: add/remove/contains =====
        val fruits = mutableListOf("apple", "banana")
        fruits.add("orange")
        fruits.remove("banana")
        println("apple" in fruits)

        // ===== Empty Collections =====
        val emptyList = listOf<String>()
        val emptyMap = mapOf<String, Int>()

        // ===== Companion Object (static-like) =====
        println(Math.double(10))
    }
    // Run this in main() or as a script
    fun coroutinesDemo() = runBlocking {
        println("Coroutine demo start:")

        // Basic launch
        launch {
            delay(1000L)
            println("World!")
        }
        println("Hello,")
        delay(1500L) // Wait for child coroutine to finish

        // Suspending function
        suspend fun fetchData(): String {
            delay(500)
            return "Data fetched!"
        }

        // Exception handling
        launch {
            try {
                val data = fetchData()
                println(data)
            } catch (e: Exception) {
                println("Error: \${e.message}")
            }
        }

        // Parallel coroutines
        val deferred1 = async { fetchData() }
        val deferred2 = async { fetchData() }
        println("Parallel: \${deferred1.await()} & \${deferred2.await()}")

        // Dispatchers demo
        launch(Dispatchers.Default) {
            println("Working on Default dispatcher: \${Thread.currentThread().name}")
        }
        launch(Dispatchers.IO) {
            println("Working on IO dispatcher: \${Thread.currentThread().name}")
        }
    }
}