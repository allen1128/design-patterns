package com.org.gof.pattern.state.component;

public interface State {
    void takeCareOf(int babyId, Context context);
    default void increase(int babyId, Context context){
        Integer count = context.getNumOfCryPerBaby().get(babyId);
        if (count == null) {
            count = 1;
        } else {
            count++;
        }

        context.getNumOfCryPerBaby().put(babyId, count);
    }
}
