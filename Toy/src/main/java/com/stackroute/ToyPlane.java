package com.stackroute;

import java.math.BigDecimal;

public class ToyPlane extends AiToy implements FlyingToy,MovingToy,Toy {
    public void fly(){
        System.out.println("it will fly");
    }
    public void move(){
        System.out.println("it will move");
    }
private BigDecimal price;
    private String color;
    @Override
    public void setPrice(BigDecimal price) {
     this.price=price;
    }

    @Override
    public void setColor(String color) {
this.color=color;
    }
}
