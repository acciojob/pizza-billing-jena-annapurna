package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheese;
    private boolean toppingsAdded;
    private boolean takeAway;
    private int cheesePrice;
    private int toppingsPrice;
    private boolean isBag;
    private int bag;
    private boolean isBill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {

           price+=300;
           bill="Base Price Of The Pizza: "+300+"\n";
        }
        else
        {
            price+=400;
            bill="Base Price Of The Pizza: "+400+"\n";
        }
    }

    public int getPrice(){

        if(isVeg)
            return 300;
        else
            return 400;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheese) {
            cheesePrice += 80;
        }
       this.extraCheese=true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppingsAdded) {
            if (this.isVeg) {
                toppingsPrice += 70;

            } else {
                toppingsPrice += 120;
            }
        }
        this.toppingsAdded=true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!isBag)
        {
            this.bag=20;
        }
    isBag=true;
    }

    public String getBill() {
        // your code goes here
        if (!isBill) {
            if (extraCheese) {
                price += cheesePrice;
                bill = bill + "Extra Cheese Added: " + cheesePrice + "\n";
            }
            if (toppingsAdded) {
                price += toppingsPrice;
                bill += "Extra Toppings Added: " + toppingsPrice + "\n";
            }

            if (isBag) {
                price += bag;
                bill += "Paperbag Added: " + bag + "\n";
            }
            bill = bill + "Total Price: " + price + "\n";
            this.isBill=true;
            return this.bill;
        }
        return this.bill;
    }
}
