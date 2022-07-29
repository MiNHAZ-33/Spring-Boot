package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkOut()
    {
        System.out.println("Checkout method from shopping cart is called");
    }

}
