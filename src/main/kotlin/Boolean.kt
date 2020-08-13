fun main() {
    val nilai = 85
    val hasil : String

    hasil = if (nilai >= 90 && nilai < 100){
        "A"
    }else if (nilai >= 80 && nilai < 89){
        "B"
    }else if (nilai >= 70 && nilai < 79){
        "C"
    }else if (nilai >= 60 && nilai < 69){
        "D"
    }else if (nilai <= 59 && nilai <= 50){
        "E"
    }else{
        "DAPET PAKTA!!!"
    }
    print("Predikatnya adalah : $hasil")
}