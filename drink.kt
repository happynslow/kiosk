open class drink() {
    fun drinks(){
        val drinkss: List<String> = listOf("사과주스", "사과모히또","사과스무디","사과에이드")
        println("0.사과주스")
        println("1.사과모히또")
        println("2.사과스무디")
        println("3.사과에이드")
        val pickJ = readln().toInt()

        if(pickJ == 0){
            println("${drinkss.get(0)}: 사과 과즙 100% 사과주스")
            println("구매하시겠습니까? 예/아니오[4000원]")}

        else if(pickJ == 1){
            println("${drinkss.get(1)}: 논알콜 사과모히또")
            println("구매하시겠습니까? 예/아니오[4000원]")}

        else if(pickJ == 2){
            println("${drinkss.get(2)}: 사과가 갈려들어간 스무디!")
            println("구매하시겠습니까? 예/아니오[4000원]")}

        else if(pickJ == 3){
            println("${drinkss.get(3)}: 사과가 씹히는 에이드!")
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