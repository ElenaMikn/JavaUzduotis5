package main.Kotlin

data class Namas(val gatve: String="Egliu",
                 val miestas: String="Vilnius",
                 var nr: Int=1

)
{
   var aukstai: Int = 0
       get() = field
       set(value) {
           field = value
       }

}



//https://kotlinlang.org/docs/reference/properties.html