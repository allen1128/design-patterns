package com.org.gof.pattern.state.component;

public class NannyState implements State {
    @Override
    public void takeCareOf(int babyId, Context context) {
        increase(babyId, context);
        System.out.println("baby id " + babyId + " is been taking care of by nanny.");
        System.out.println("She has cried " + context.getNumOfCryPerBaby().get(babyId) + " times");

        if (context.getNumOfCryPerBaby().get(babyId) > 5) {
            context.getStatePerBaby().put(babyId, new ProfessionalCareGiverState());
        }
    }
}
