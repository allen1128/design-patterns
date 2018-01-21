package com.org.gof.pattern.momento.component;

public class Originator {
    private int result;

    public Originator(int i) {
        result = i;
    }

    public void add(int operand) {
        result += operand;
    }

    public void minus(int operand) {
        result -= operand;
    }

    public void print(){
        System.out.format("result is %s \n", result);
    }

    public Momentor createMomento() {
        return new MomentorImpl(result);
    }

    public void setMomentor(Momentor momentor) {
        MomentorImpl momentor1 = (MomentorImpl) momentor;
        result = momentor1.getState();
    }

    private static class MomentorImpl implements Momentor {
        private int state;

        public MomentorImpl(int result) {
            this.state = result;
        }

        public int getState() {
            return state;
        }
    }
}
