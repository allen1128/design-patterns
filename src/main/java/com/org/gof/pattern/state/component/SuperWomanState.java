package com.org.gof.pattern.state.component;

public class SuperWomanState implements State {

    @Override
    public void takeCareOf(int babyId, Context context) {
        increase(babyId, context);
        System.out.println("baby id " + babyId + " is been taking care of by a super woman. The baby stops here.");
        System.out.println("She has cried " + context.getNumOfCryPerBaby().get(babyId) + " times");
    }
}
