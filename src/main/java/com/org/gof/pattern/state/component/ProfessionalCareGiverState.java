package com.org.gof.pattern.state.component;

public class ProfessionalCareGiverState implements State {
    @Override
    public void takeCareOf(int babyId, Context context) {
        increase(babyId, context);
        System.out.println("baby id " + babyId + " is been taking care of by professional care giver.");
        System.out.println("She has cried " + context.getNumOfCryPerBaby().get(babyId) + " times");

        if (context.getNumOfCryPerBaby().get(babyId) > 7) {
            context.getStatePerBaby().put(babyId, new SuperWomanState());
        }
    }
}
