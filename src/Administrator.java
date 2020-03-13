import java.util.ArrayList;

public class Administrator {
    private ArrayList<Product> products = new ArrayList<Product>();
    private ArrayList<Client> blackclients = new ArrayList<Client>();

    //регистрация товара и добавление неплательщиков в черный список
    public void registerOrder(Client client) {
        if (client.getOrder().isPayment() == true) {
            client.getOrder().setRegister(true);
        } else {
            blackclients.add(client);
        }
    }

    //создание новых продуктов
    public void createNewProduct(String name, int price) {
        products.add(new Product(name,price));
    }
}
