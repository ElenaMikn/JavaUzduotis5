package main.Kotlin
import kotlin.properties.Delegates
enum class StatusType {
    vienoAuksto, diejuAukstu, trijuAukstu, aukstas
}
data class Namas(var gatve: String="Egliu",
                 var miestas: String="Vilnius",
                 var nr: Int=1
) {

    var aukstai: Int = 0
        get() = field
        set(value) {
            if (value > 0) {
                field = value
            } else {
                throw IllegalArgumentException("Auksti negali nebuti")
            }
        }
    var aukstoPlotas: Double = 0.0
    fun GetBendrasPlotas(): Double {
        return aukstai * aukstoPlotas;
    }

    override fun toString(): String {
        return "Namo adresas $gatve $nr, $miestas  "
    }

    var state: StatusType by Delegates.observable( StatusType.vienoAuksto) { _, oldValue, newValue ->
        when (newValue) {
             StatusType.vienoAuksto ->  aukstai=1
             StatusType.diejuAukstu ->  aukstai=2
             StatusType.trijuAukstu ->  aukstai=3
             StatusType.aukstas ->  aukstai=5
            else -> aukstai=4
        }
    }
}
