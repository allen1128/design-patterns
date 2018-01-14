package com.org.gof.pattern.decorator;

import com.org.gof.pattern.decorator.component.*;

public class Client {
    public static void main(String[] args){
        BodyParts face = new FaceliftDecorator(new MassageDecorator(new FaceLotionDecorator(new Face())));
        face.clean();
    }
}
