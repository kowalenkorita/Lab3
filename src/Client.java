public class Client {
    private Order order;

    //заказать
    public void book(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    //показать Заказ
    public void showOrder() {
        System.out.println("Ваш заказ: ");
        order.showOrder();
    }

    //оплатить Заказ
    public void pay() {
        if(order.isPayment() == true) {
            System.out.println("Вы уже оплатили заказ");
        } else {
            order.setPayment(true);
        }
    }

    //Забрать товар
    public void take() {
        if(order.isPayment() == false) {
            System.out.println("Вы ещё не оплатили товар");
        } else if(order.isRegister() == false) {
            System.out.println("Ваша заявка ещё не обработана");
        } else {
            System.out.println("Спасибо за покупку!");
        }
    }
}
