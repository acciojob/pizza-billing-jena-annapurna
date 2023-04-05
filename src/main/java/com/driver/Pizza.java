package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheese;
    private boolean toppingsAdded;
    private boolean takeAway;

    private boolean isBag;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {

           this.price=300;
        }
        else
        {
            this.price=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheese) {
            this.price += 80;
        }
       this.extraCheese=true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppingsAdded) {
            if (this.isVeg) {
                this.price += 70;

            } else {
               this.price += 120;
            }
        }
        this.toppingsAdded=true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!isBag)
        {
            this.price+=20;
        }
    isBag=true;
    }

    public String getBill() {
        // your code goes here
            if(this.isVeg)
            {
                this.bill="Base Price Of The Pizza: "+300;
            }
            else {
                this.bill="Base Price Of The Pizza: "+400;
            }
            if (extraCheese) {
                bill = bill + "\n"+"Extra Cheese Added: " +80;
            }
            if (toppingsAdded) {
                if(this.isVeg)
                {
                    this.bill+="\n"+"Extra Toppings Added: "+70;
                }
                else {
                    this.bill+="\n"+"Extra Toppings Added: "+120;
                }
            }

            if (isBag) {
                bill += '\n'+"Paperbag Added: " +20;
            }
            bill = bill +"\n"+"Total Price: " +this.price+"\n";
            return this.bill;
        }

    }
