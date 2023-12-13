open class coffee() {
    fun coffees(){
        val coffeess: List<String> = listOf("아메리카노", "카페라떼","카페모카","아포가토")
        println("0.아메리카노")
        println("1.카페라떼")
        println("2.카페모카")
        println("3.아포가토")
        val pickJ = readln().toInt()

        if(pickJ == 0){
            println("${coffeess.get(0)}: 고소하고 초코릿 풍미가 있습니다")
        println("구매하시겠습니까? 예/아니오[2500원]")}

        else if(pickJ == 1){
            println("${coffeess.get(1)}: 부드럽고 가볍게 달콤합니다")
            println("구매하시겠습니까? 예/아니오[3000원]")}

        else if(pickJ == 2){
            println("${coffeess.get(2)}: 커피와 초코의 만남!")
            println("구매하시겠습니까? 예/아니오[3500원]")}

        else if(pickJ == 3){
            println("${coffeess.get(3)}: 아이스크림과 커피를 함께!")
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


