open class tea() {
    fun teas(){
        val teas: List<String> = listOf("허브티", "카모마일티","얼그레이티","히비스커스티")
        println("0.허브티")
        println("1.카모마일티")
        println("2.얼그레이티")
        println("3.히비스커스티")
        val pickJ = readln().toInt()

        if(pickJ == 0){
            println("${teas.get(0)}: 향긋하고 심신이 안정됩니다")
            println("구매하시겠습니까? 예/아니오[2500원]")}

        else if(pickJ == 1){
            println("${teas.get(1)}: 나른하고 평온해집니다")
            println("구매하시겠습니까? 예/아니오[3000원]")}

        else if(pickJ == 2){
            println("${teas.get(2)}: 커피 대신으로도 좋습니다")
            println("구매하시겠습니까? 예/아니오[3500원]")}

        else if(pickJ == 3){
            println("${teas.get(3)}: 건강에 좋습니다!")
            println("구매하시겠습니까? 예/아니오[4000원]")}

        val yeah = readln().toString()
        if (yeah == "예") {
            println("구매 감사합니다! 맛있게 드세요!")
        } else if (yeah == "아니오") {
            println("재주문 하시겠습니까? 주문을 종료하시겠습니까? 재주문/종료")
            val oh = readln().toString()
            if (oh == "종료") {
                return
            }else if (oh == "재주문"){
                val menu = menu()
                var resul = menu.start()}


        }
    }
}