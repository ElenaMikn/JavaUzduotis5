package main.Kotlin

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



    var namasKedru=Namas("Kedru","Vilnius",1)
    //n.aukstai=-1 //Exception in thread "main" java.lang.IllegalArgumentException: Auksti negali nebuti

    //with
    with(namasKedru) {
        println("Namo adresas gatve: $gatve nr: $nr miestas:  $miestas  ")
    }

    //apply
    val NamasJonavos = Namas().apply {
        gatve = "Jonavos"
        miestas = "Kaunas"
        nr=7
    }
    println("${NamasJonavos.toString()} ")

    //also
    val namasUpesAlso = namasKedru.also {
        it.gatve = "Upes"
        it.miestas = "Vilnius"
        it.nr=8
    }
    println("${namasUpesAlso.toString()} ")

    //let turimam objektui paskaiciuojam bendra plota
    namasKedru.aukstai=4
    val bendrasPlotas: Double = namasKedru.let {
        it.aukstoPlotas=51.0
        it.GetBendrasPlotas()
    }
    println("${namasKedru.toString()} bendras plotas yra $bendrasPlotas")

    //RUN- sukuriam nauja objekta ir paskaiciuojam bendra plota
    val bendrasPlotas2: Double = run {
        val namas: Namas = Namas()
        namas.aukstai=2
        namas.aukstoPlotas=70.8
        namas.GetBendrasPlotas()
    }
    println("${namasKedru.toString()} bendras plotas2 yra $bendrasPlotas2")

    //Extension funkcijos
    fun Namas.GetBendrasPlotas(aukstai: Int, aukstoPlotas: Double):Double {
        return aukstai*aukstoPlotas
    }
    fun Namas.GetBendrasPlotas(aukstai: Int):Double {
        return aukstai*aukstoPlotas
    }
    fun Namas.GetBendrasPlotas(aukstoPlotas: Double):Double {
        return aukstai*aukstoPlotas
    }

    fun Namas.toString(aukstai: Int, aukstoPlotas: Double ):String {
        return "Namo adresas $gatve $nr, $miestas yra aukstu $aukstai po $aukstoPlotas m^2"
    }
    fun Namas.toString(aukstai: Int ):String {
        return "Namo adresas $gatve $nr, $miestas aukstu $aukstai "
    }
    fun Namas.toString(aukstoPlotas: Double ):String {
        return "Namo adresas $gatve $nr, $miestas auksto plotas $aukstoPlotas m^2 "
    }

    var namasPusu1=Namas("Pusu","Vilnius",1)
    var namasPusu1BendrasPlotas= namasPusu1.GetBendrasPlotas(4,65.0)
    println("${namasPusu1.toString(4,65.0)} bendras plotas Yra $namasPusu1BendrasPlotas")

    var namasPusu2=Namas("Pusu","Vilnius",2)
    namasPusu2.aukstoPlotas=20.0
    var namasPusu2BendrasPlotas= namasPusu2.GetBendrasPlotas(30)//jei int, tai zino, kad tai aukstu kiekis
    println("${namasPusu2.toString(30)}Bendras plotas Yra $namasPusu2BendrasPlotas")

    var namasPusu3=Namas("Pusu","Vilnius",3)
    namasPusu3.aukstai=5
    var namasPusu3BendrasPlotas= namasPusu3.GetBendrasPlotas(90.3)//jei double, tai zino, kad tai auksto plotas
    println("${namasPusu3.toString(90.3)} Bendras plotas Yra $namasPusu3BendrasPlotas")

    println( namasPusu3.aukstai)
    namasPusu3.state= StatusType.diejuAukstu
    println( namasPusu3.aukstai)
    println( namasPusu3.state)

    namasPusu3.state= StatusType.trijuAukstu
    println( namasPusu3.aukstai)
    println( namasPusu3.state)
}

