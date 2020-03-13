//9. Система Интернет-магазин.
// Администратор добавляет информацию о Товаре.
// Клиент делает и оплачивает Заказ на Товары.
// Администратор регистрирует Продажу и может занести неплательщиков в «черный список».
//+ классы Product, Order, Client
public class Lab3_4 {
    public static void main(String[] args)
    {

        Administrator admin = new Administrator();
        Product product = new Product("Product1", 350);
        Order order = new Order();
        Client client = new Client();

        admin.createNewProduct("Product1", 350);
        order.addProdToOrder(product);
        order.showOrder();
        System.out.println(product.getName());
    }
}
