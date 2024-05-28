package com.ohgiraffers.section1;

public class Barista {
    /*
    * 주문에 따라 커피를 만들어야 함.
    * */
    private int coffeeStock = 5000; // 5000g 커피 보유

    public Coffee[] makeCoffee(Order order) {

        // 재고 차감 처리 - 커피 한 잔에 20g 사용
        if(coffeeStock >= (order.getCount()*20)){

        // 커피 생성
        Coffee[] coffees = new Coffee[order.getCount()];
        // 보유량 차감
      //  coffeeStock = coffeeStock - order.getCount()*20);

        for(int i = 0; i < coffees.length; i++) {
           // coffees[i] = new Coffee(order.getMenuName(), order.getOption()*20));

        }
        return coffees;
    }


        else {
            System.out.println("[바리스타] : 커피가루 충전해주세요 !!!!");
            return null;
        }
}

}
