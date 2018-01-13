package com.org.gof.pattern.chainofresponsiblity;

import com.org.gof.pattern.chainofresponsiblity.component.*;

public class Client {
    public static void main(String[] args){
        Chain chain1 = new Chain1();
        Chain chain2 = new Chain2();
        Chain chain3 = new Chain3();
        chain1.setSuccessor(chain2);
        chain2.setSuccessor(chain3);

        RequestModel rr1 = new RaiseRequestModel("john", 100);
        RequestModel rr2 = new RaiseRequestModel("tom", 300);
        RequestModel rr3 = new RaiseRequestModel("max", 500);
        RequestModel rr4 = new RaiseRequestModel("bill", 600);


        RequestModel vr1 = new VacationRequestModel("john", 1);
        RequestModel vr2 = new VacationRequestModel("tom", 3);
        RequestModel vr3 = new VacationRequestModel("max", 5);
        RequestModel vr4 = new VacationRequestModel("bill", 6);


        chain1.handle(rr1);
        chain1.handle(rr2);
        chain1.handle(rr3);
        chain1.handle(rr4);

        chain1.handle(vr1);
        chain1.handle(vr2);
        chain1.handle(vr3);
        chain1.handle(vr4);
    }
}


