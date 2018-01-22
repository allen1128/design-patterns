package com.org.gof.pattern.state.component;

public class BabySitterState implements State {
    @Override
    public void takeCareOf(int babyId, Context context) {
        increase(babyId, context);
        System.out.println("baby id " + babyId + " is been taking care of by baby sitter. ");
        System.out.println("She has cried " + context.getNumOfCryPerBaby().get(babyId) + " times");

        if (context.getNumOfCryPerBaby().get(babyId) > 3) {
            context.getStatePerBaby().put(babyId, new NannyState());
        }
    }
}
