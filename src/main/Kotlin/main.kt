package main.Kotlin
fun Dviratis.toString(): String =  "Dviracio gamintojas yra $gamintojas, jis neturi turi begiu."

fun main(args: Array<String>) {
    println("Elena Mikneviciene")

    val masina=Masina("Toyota")
    masina.varantiejiRatai="Priekiniai"
    println(masina.toString())

    val traukinys=Traukinys("Siemens")
    traukinys.vagonuSkaicius=5
    println(traukinys.toString())

    val dviratis=Dviratis("Baltic Vairas")
    dviratis.begiuSkaicius=5
    println(dviratis.toString())


    val dviratis2=Dviratis("Baltic Vairas")
    dviratis2.begiuSkaicius=0
    println(dviratis2.toString())




    var listOfStr = arrayListOf<Namas>()
    listOfStr.add(Namas("Pusu","Vilnius",8))
    listOfStr.add(Namas("Pusu","Kaunas",3))
    listOfStr.add(Namas("Kedru","Vilnius",4))

    //https://kotlinexpertise.com/coping-with-kotlins-scope-functions/
    //var modifiedList = listOfStr { it.contains("e") }
}