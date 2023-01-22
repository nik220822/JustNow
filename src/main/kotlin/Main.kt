fun main() {
    println("был в сети ${agoToText(oneMin())}")
    println("был в сети ${agoToText(twoMin())}")
    println("был в сети ${agoToText(fiveMin())}")
    println("был в сети ${agoToText(elevenMin())}")
    println("был в сети ${agoToText(twentyoneMin())}")
    println("был в сети ${agoToText(twentyfiveMin())}")
    println("был в сети ${agoToText(oneHr())}")
    println("был в сети ${agoToText(twoHr())}")
    println("был в сети ${agoToText(fiveHr())}")
    println("был в сети ${agoToText(elevenHr())}")
    println("был в сети ${agoToText(twentyoneHr())}")
    println("был в сети ${agoToText(twentyfiveHr())}")
}

//fun agoToText(timeInSec: Int) = when (timeInSec) {
//    < 60 -> "$timeInSec секунд назад"
//    (timeInSec >= 60) && (timeInSec < 60 * 60) -> "${timeInSec / 60} минут(у) назад"
//    (timeInSec >= 60 * 60) && (timeInSec < 60 * 60 * 24) -> "${timeInSec / 60 / 60} час(ов) назад"
//    (timeInSec > 60 * 60 * 60 * 24) && (timeInSec < 60 * 60 * 60 * 24 * 2) -> "вчера"
//    (timeInSec >= 60 * 60 * 60 * 24 * 2) && (timeInSec < 60 * 60 * 60 * 24 * 3) -> "позавчера"
//    >= 60 * 60 * 60 * 24 * 3) -> "давно"
//    else -> "непонятно когда (время было задано некорректно)"
//}
fun agoToText(timeInSec: Int): String {
    return when {
        timeInSec < 60 -> "$timeInSec секунд назад"
        timeInSec >= 60 && timeInSec < 60 * 60 -> "${timeInSec / 60} минут(ы)(у) назад"
        timeInSec >= 60 * 60 && timeInSec < 60 * 60 * 24 -> "${timeInSec / 60 / 60} час(а)(ов) назад"
        timeInSec > 60 * 60 * 24 && timeInSec < 60 * 60 * 24 * 2 -> "вчера"
        timeInSec >= 60 * 60 * 24 * 2 && timeInSec < 60 * 60 * 24 * 3 -> "позавчера"
        timeInSec >= 60 * 60 * 24 * 3 -> "давно"
        else -> "непонятно когда (время было задано некорректно)"
    }
}

fun oneMin() = 60
fun twoMin() = 120
fun fiveMin() = 300
fun elevenMin() = 60 * 11
fun twentyoneMin() = 60 * 21
fun twentyfiveMin() = 60 * 25
fun oneHr() = 60 * 60
fun twoHr() = 60 * 60 * 2
fun fiveHr() = 60 * 60 * 5
fun elevenHr() = 60 * 60 * 11
fun twentyoneHr() = 60 * 60 * 21
fun twentyfiveHr() = 60 * 60 * 25
