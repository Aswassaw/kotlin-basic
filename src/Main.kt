import com.company.belajar.util.sayGoodBye
import com.company.belajar.util.sayHello

object Asw {
    const val NATION = "INDONESIA"
}

fun main() {
//    1. HELLO WORLD
//    println("Hello World")
//    println("Hello World")
//    println("pantek")

//    2. TIPE DATA NUMBER
//    var age: Byte = 21
//    var price: Int = 10000
//    println(age)
//    println(price)
//
//    var discount: Double = 2.5
//    discount = 33.5
//    println(discount)
//    var aDiscount = discount.toInt()
//    println(aDiscount)
//
//    var million = 1_000_000
//    println(million)

//    TIPE DATA CHARACTER
//    var char1 = "A"
//    var char2 = "B"
//    var char3 = "C"

//    TIPE DATA BOOLEAN
//    var isMarried = false;

//    TIPE DATA STRING
//    var name = "Andry Pebrianto"
//    println(name)
//    var text = """
//        Saya Adalah Manusia
//        Hahahahaha
//        Yoi Masbro
//    """.trimIndent()
//    println(text)
//
//    println("Manusia" + " " + "Api")
//    println("$name Tampan | ${name.length}")

//    VARIABEL
//    var name = "AAA"; // bisa diubah
//    val nameAbsolute = "BBB" // tidak bisa diubah
//    var bambang: String? = null;
//    println(bambang)
//    println(bambang?.length)
//    bambang = "BAMBANG"
//    println(bambang)
//    println(bambang?.length)
//    println(Asw.NATION)

//    TIPE DATA ARRAY
//    var names: Array<String> = arrayOf("Bagas", "Adi", "Alung")
//    println(names[1])
//    var nation: Array<String?> = arrayOfNulls(2 + 1)
//    println(nation[1])

//    TIPE DATA RANGE
//    var satus = 0..100 step 2
//    println(satus)
//    println(satus.count())
//    println(satus.contains(50))
//    println(satus.contains(200))
//    println(satus.first)
//    println(satus.last)
//    println(satus.step)

//    WHEN (Switch Case) EXPRESSION
//    val finalExam = "S"
//    val allExam = arrayOf("A+", "S", "SS")
//    when (finalExam) {
//        in(allExam) -> println("Kamu gila banget")
//        "A", "B" -> println("Kamu lulus")
//        "C" -> println("Kamu dapat peringatan")
//
//        else -> {
//            println("Goblok!")
//            println("Anak tolol!")
//        }
//    }
//
//    var array = arrayOf("Bambang", "Budi", "Juned")
//    for (name in array) {
//        println(name)
//    }
//
//    for (i in 0..99 step 4) {
//        println(i)
//    }
//
//    for (index in 0..array.size - 1) {
//        println(array[index])
//    }

//    BREAK & CONTINUE
//    for (i in 0..100) {
//        if (i == 20) {
//            continue
//        }
//
//        println(i)
//
//        if (i == 50) {
//            break
//        }
//    }

//    FUNCTION
//    helloWorld("Andry", "Pebrianto")
//    helloWorld("Bagggad")

//    FUNCTION NAMED ARGUMENT
//    fullName(lastName = "Pebrianto", firstName = "Andry", middleName = "Middle")

//    FUNCTION RETURN
//    println(sum(a = 10, b = 12))

//    SINGLE EXPRESSION FUNCTION
//    println(kaliDua(10))

//    FUNCTION VARARGS PARAMETER
//    println(hitungTotal(origin = 10, 5, 5, 5, 5, 5, 5))

//    EXTENSION FUNCTION
//    println("Bambugs".hello())

//    INFIX FUNCTION NOTATION
//    val result1 = "Andry Pebrianto" gedeAtoKecil "UP"
//    val result2 = "Andry Pebrianto" gedeAtoKecil "DOWN"
//    println(result1)
//    println(result2)

//    LAMBDA EXPRESSION
//    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
//        val result = "$firstName $lastName"
//        result
//    }
//    println(contohLambda("Andry", "Pebrianto"))

//    HIGHER ORDER FUNCTION
//    val lambdaUpper = { value: String -> value.uppercase() }
//    println(helloHOF("Andry", lambdaUpper))
//    println(helloHOF("Bagas", fun(name: String): String {
//        return name
//    }))

//    INLINE FUNCTION
//    println(hello { "Andry" })

//    LABEL
//    loopI@ for (i in 1..10) {
//        loopJ@ for (j in 1..10) {
//            if (i > 5) {
//                break@loopI
//            }
//
//            println("$i * $j = ${i * j}")
//        }
//    }

//    PACKAGE
    sayHello("BAMBANG")
    sayGoodBye("BAGAS")
}

fun helloWorld(name: String, lastName: String? = null) {
    if (lastName !== null) {
        println("Halo ${name} ${lastName}")
    } else {
        println("Halo ${name}")
    }
}

fun fullName(firstName: String, middleName: String, lastName: String) {
    println("Hello $firstName $middleName $lastName")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun kaliDua(a: Int): Int = a * 2;

fun hitungTotal(origin: Int, vararg values: Int): Int {
    var result = origin

    for (value in values) {
        result += value
    }

    return result
}

fun String.hello(): String {
    return "Hello $this"
}

infix fun String.gedeAtoKecil(type: String): String {
    return if (type === "UP") {
        this.uppercase()
    } else {
        this.lowercase()
    }
}

fun helloHOF(name: String, transformer: (String) -> String): String {
    val nameTransform = transformer(name)
    return "Hello $nameTransform"
}

inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}