
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int totalEuros = this.euros + addition.euros;
        int totalCents = this.cents + addition.cents;
        Money newMoney = new Money(totalEuros, totalCents); // create a new Money object that has the correct worth
        
        // return the new Money object
        return newMoney;
    }
    
    public boolean lessThan(Money compared){
        return this.euros < compared.euros || (this.euros == compared.euros && this.cents < compared.cents);
    }
    
    public Money minus(Money decreaser){
        int newCents = this.cents;
        int newEuro = this.euros;
        if (decreaser.cents > this.cents){
            newCents = 100;
            newEuro -= 1;
        }
        
        int euroDifference = newEuro - decreaser.euros;
        int centsDifference = newCents - decreaser.cents;
        if (euroDifference < 0){
            euroDifference = 0;
            centsDifference = 0;
        }
        
        
        Money newMoney = new Money(euroDifference, centsDifference);
        return newMoney;
    }
}
