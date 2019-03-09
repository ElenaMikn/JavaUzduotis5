package main.Kotlin;

open class  Masina(val gamintojas: String): TransportoPriemone (gamintojas)
{
    var varantiejiRatai: String="Priekiniai";
    override  fun toString(): String = "Masinos gamintojas yra $gamintojas, varantieji ratai yra $varantiejiRatai."
}

open class  Traukinys(val gamintojas: String): TransportoPriemone (gamintojas)
{
    var vagonuSkaicius: Int=50;
    override  fun toString(): String = "Tarkinio gamintojas yra $gamintojas, kurio ilgis yra $vagonuSkaicius vagonu."
}
open class  Dviratis(val gamintojas: String): TransportoPriemone (gamintojas)
{
    var begiuSkaicius: Int = 18;
    override  fun toString(): String = "Dviracio gamintojas yra $gamintojas, jis turi $begiuSkaicius begiu."
}