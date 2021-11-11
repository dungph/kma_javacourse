public class Main {
    public static void main(String[] a) {
        
    }
}

class Circle {
    float radius;
    String color;
    public void setColor(String color) {
            this.color = color;
    }
    public void setRadius(float radius) {
            this.radius = radius;
    }
    public String getColor() {
            return color;
    }
    public float getRadius() {
            return radius;
    }
    public void showCircle() {
        System.out.println("Radius: " + radius);
        System.out.println("Color: " + color);
        System.out.println("Area: " + this.area());
    }

    public float area() {
        return radius*radius*(float)3.14;
    }
}

class Rectangle {
    float width;
    float length;
    public void setWidth(float width) {
            this.width = width;
    }
    public void setLength(float length) {
            this.length = length;
    }
    public float getWidth() {
            return width;
    }
    public float getLength() {
            return length;
    }
    public float getArea() {
            return length*width;
    }
    public void showRectangle() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + this.getArea());

    }
}

class Employee {
    int id;
    String firstName;
    String lastName;
    int montlySalary;

    public void setId(int id) {
            this.id = id;
    }
    public void setLastName(String lastName) {
            this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
            this.firstName = firstName;
    }
    public void setMontlySalary(int montlySalary) {
            this.montlySalary = montlySalary;
    }
    public int getId() {
            return id;
    }
    public String getLastName() {
            return lastName;
    }
    public String getFirstName() {
            return firstName;
    }
    public int getMontlySalary() {
            return montlySalary;
    }
    public int getYearlySalary() {
            return montlySalary*12;
    }

    public int setSalaryForDays(int days) {
        return (montlySalary*days)/12;
    }

    public void showInfo() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Montly Salary: " + montlySalary);
    }
}

class Account {
    int id;
    String name;
    int balance;

    public int getId() {
            return id;
    }
    public int getBalance() {
            return balance;
    }
    public String getName() {
            return name;
    }
    public void setId(int id) {
            this.id = id;
    }
    public void setName(String name) {
            this.name = name;
    }
    public void setBalance(int balance) {
            this.balance = balance;
    }
    public void credit(int amount) {
        if (balance < amount) {
            System.out.println("Credit failed");
        } else {
            System.out.println("Credit failed");
            balance -= amount;          
        }
    }

    public void debit(int amount) {
        balance += amount;
    }

    public void transferTo(Account account, int amount) {
        if (balance < amount) {
            System.out.println("Credit failed");
            System.out.println("Transfer failed");

        } else {
            System.out.println("Credit failed");
            balance -= amount;
            account.debit(amount);
        }
    }

    public void showInfo() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

class Date {
    int day = 0;
    int month = 0;
    int year = 0;

    public int getDay() {
            return day;
    }
    public int getYear() {
            return year;
    }
    public int getMonth() {
            return month;
    }
    public void setDay(int day) {
        int upperValid = 0;
        if (month == 0) {
            upperValid = 31;
        } else if (month == 2) {
            if (year <= 0) {
                upperValid = 29;
            } else {
                upperValid = this.daysInTheMonth();
            }
        } else {
            upperValid = this.daysInTheMonth();
        }


        if (day > 0 && day <= upperValid) {
            this.day = day;
        } else {
            System.out.println("Invalid day");
        }               
    }
    public void setYear(int new_year) {
            if (new_year <= 0) {
                System.out.println("Invalid year");
            } else {
                this.year = new_year;
                if (day > this.daysInTheMonth()) {
                    System.out.println("Invalid year");
                    this.year = 0;
                }
            }
    }

    public void setMonth(int month) {
            if (month > 0 && month <=12) {
                this.month = month;
                if (year == 0) {
                    this.year = 4;
                    if (this.daysInTheMonth() < this.day) {
                        System.out.println("Invalid month");
                        this.month = 0;
                    }
                    this.year = 0;
                }
            }
    }
    public boolean isLeapYear() {
        if (year <= 0) {
            System.out.println("Year 0 not existed");
            return false;
        } else if (year%4==0 && year%100!=0 || year%400==0) {
            return true;
        } else {
            return false;
        }
    }
    public int daysInTheMonth() {
        if (month == 2) {
            if (this.isLeapYear()) {
                return 29;
            } else {
                return 28;
            }
        } else if (month==4 || month == 6 || month = 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }
    public void showDay() {
        System.out.println("The date is "
                + month
                + " "
                + day
                + ", "
                + year);
    }

}
