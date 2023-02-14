class DateTest {
    public static void main(String[] args) {
        
        Date d1 = new Date(2020,10,01);
        System.out.println(d1);
        
        d1.setDay(5);
        d1.setMonth(10);
        d1.setYear(1999);
        System.out.println("Day "+d1.getDay());
        System.out.println("Month "+d1.getMonth());
        System.out.println("Year "+d1.getYear());
        
    }
}

class Date {
    public static final int final_year=0;
    public static final int final_month=0;
    public static final int final_day=0;

    private int year;
    private int month;
    private int day;

    Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return this.year;
    }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }

    void setYear(int year){
        this.year = year;
    }
    void setMonth(int month){
        this.month = month;
    }
    void setDay(int day){
        this.day = day;
    }

    public String toString(){
        return day+"/"+month+"/"+year+"\n";
    }

}
