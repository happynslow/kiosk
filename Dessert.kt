open class Dessert() {
    fun Desserts(){
        val dessertss: List<String> = listOf("쿠키", "머핀","레드벨벳 케이크","오레오 케이크")
        println("0.쿠키")
        println("1.머핀")
        println("2.레드벨벳 케이크")
        println("3.오레오 케이크")
        val pickJ = readln().toInt()

        if(pickJ == 0){
            println("${dessertss.get(0)}: 바삭한 쿠키입니다")
            println("구매하시겠습니까? 예/아니오[1500원]")}

        else if(pickJ == 1){
            println("${dessertss.get(1)}: 폭신한 머핀입니다")
            println("구매하시겠습니까? 예/아니오[2000원]")}

        else if(pickJ == 2){
            println("${dessertss.get(2)}: 달콤하고 부드러운 레드벨벳!")
            println("구매하시겠습니까? 예/아니오[5500원]")}

        else if(pickJ == 3){
            println("${dessertss.get(3)}: 달콤하고 고소한 오레오!")
            println("구매하시겠습니까? 예/아니오[5500원]")}

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