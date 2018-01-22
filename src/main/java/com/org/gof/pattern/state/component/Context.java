package com.org.gof.pattern.state.component;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<Integer, Integer> numOfCryPerBaby = new HashMap<>();
    Map<Integer, State> statePerBaby = new HashMap<>();

    public Map<Integer, Integer> getNumOfCryPerBaby() {
        return numOfCryPerBaby;
    }

    public Map<Integer, State> getStatePerBaby() {
        return statePerBaby;
    }

    public void takeCare(Integer babyId){
        State state = getStatePerBaby().get(babyId);
        if (state == null) {
            state = new BabySitterState();
            getStatePerBaby().put(babyId, state);
        }

        state.takeCareOf(babyId, this);
    }
}
