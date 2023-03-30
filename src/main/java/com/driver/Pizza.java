package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheese;
    private boolean toppings;
    private boolean takeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            this.price=300;
           price+=this.price;
           bill="Base Price Of The Pizza: "+price+"\n";
        }
        else
        {
            this.price=400;
            price+=this.price;
            bill="Base Price Of The Pizza: "+price+"\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheese)
            this.price+=80;
        extraCheese=true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppings) {
            if (this.isVeg) {
                price += 70;

            } else {
                price += 120;
            }
        }
        this.toppings=true;
    }

    public void addTakeaway(){
        // your code goes here
        price+=20;
    }

    public String getBill(){
        // your code goes here
        if(toppings)
        {
            if(isVeg)
                bill=bill+"Extra Toppings Added: "+70+"\n";
            else
                bill=bill+"Extra Toppings Added: "+120+"\n";
        }
        if(extraCheese)
            bill=bill+"Extra Cheese Added: "+80+"\n";
        if(takeAway)
            bill=bill+"Paperbag Added: "+20+"\n";
        bill=bill+"Total Price: "+price+"\n";
        return this.bill;
    }
}
