package com.org.gof.pattern.state;

import com.org.gof.pattern.state.component.BabySitterState;
import com.org.gof.pattern.state.component.Context;
import com.org.gof.pattern.state.component.State;

import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Context context = new Context();
        System.out.println("Enter baby ID:");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            int babyId = scanner.nextInt();
            if (babyId == 0){
                return;
            }

            context.takeCare(babyId);
        }
    }
}
