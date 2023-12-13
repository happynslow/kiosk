open class menu {
  fun start(){
      var names: List<String> = listOf("커피", "음료", "차", "디저트")
      println("메뉴번호를 선택해주세요.")
      println("========================")
      println("0.커피 1.음료 2.차 3.디저트")
      println("========================")

      var pick = readln().toInt()

        if (pick == 0) {
            println(names.get(0))
            println("아포가토 어떠신가요?")
            var coffee = coffee()
            var resul = coffee.coffees()
        } else if (pick == 1) {
            println(names.get(1))
            println("사과주스 어떠신가요?")
            var drink = drink()
            var resul = drink.drinks()
        } else if (pick == 2) {
            println(names.get(2))
            println("히비스커스 티 어떠신가요?")
            var tea = tea()
            var resul = tea.teas()
        } else if (pick == 3) {
            println(names.get(3))
            println("레드벨벳 케이크 어떠신가요?")
            var Dessert = Dessert()
            var resul = Dessert.Desserts()
        } else (println("값을 다시 입력해주세요"))

    }





}