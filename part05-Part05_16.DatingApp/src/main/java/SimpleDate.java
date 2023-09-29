
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance(){
        if (day == 30 && month < 12){ // resets day and increases month if it's the end of the month
            day = 1;
            month++;
        } else if (day == 30 && month == 12){ // resets day and month is it's the end of the year
            day = 1;
            month = 1;
            year++;
        } else { // increase day if day is not the end of the month
            day++;
        }
    }
    
    public void advance(int howManyDays){
        for (int i = 0; i < howManyDays; i++){
            advance();
        }
    }
    
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);

        return newDate;
    }

}
