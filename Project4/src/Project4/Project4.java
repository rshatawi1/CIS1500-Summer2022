package Project4;

import java.util.ArrayList;

import java.util.Scanner;
class LottoTickets {
    int numberOfValues, maxValue;
    ArrayList<Integer> list = new ArrayList<>();
    LottoTickets(int numberOfValues,int maxValue){

        this.numberOfValues = numberOfValues;

        this.maxValue = maxValue;

        for(int i=0; i<numberOfValues; i++){

            list.add((int) (Math.random()*maxValue));
        }

    }

    public boolean isWinner(int value){

        if(list.contains(value)){

            return true;

        }

        return false;

    }

}

class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the total number of tickets (In between 3 and 10)");

        int numOfValues = sc.nextInt();

        System.out.println("Please enter a maximum value of a ticket (Less than one hundred)");

        int maxValue = sc.nextInt();

        if(numOfValues>3 && numOfValues<10 && maxValue<100){

            LottoTickets ticket  = new LottoTickets(numOfValues, maxValue);

            System.out.println("Please enter your ticket number!");

            int value = sc.nextInt();

            if(ticket.isWinner(value)){

                System.out.println("You're a winner! :)");

            }else{

                System.out.println("You have lost!! :(");

            }

        }else{

            System.out.println("These entered values are incorrect!");

        }

    }

}
