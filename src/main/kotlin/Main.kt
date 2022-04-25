fun main(args: Array<String>) {
    var input = 20
    var atasbawah = 10
    var simbol2 = 18
    var arah : Boolean = true

    while ( arah == true){
        for(i in 1..input){
            for(j in 1..input){
                if(i==1||i==input||j==1||j==input) {
                    print("*")
                } else if (atasbawah == i && simbol2 == j){
                    print("@")
                } else {
                    print(" ")
                }
            }
            println()
        }
        print("arah yang di inginkan : ")
        val arah = readLine()

        if (arah == "s"){ // ke bawah
            if ( atasbawah < 19){
                atasbawah +=1
            }
        }else if (arah == "w"){ //ke atas
            if (atasbawah > 1){
                atasbawah -= 1
            }
        }else if (arah == "a"){ //ke kiri
            if (simbol2 > 1) {
                simbol2 -= 1
            }
        }else if (arah == "d"){ //ke kanan
            if (simbol2 < 19) {
                simbol2 += 1
            }
        }
        println()
    }
}