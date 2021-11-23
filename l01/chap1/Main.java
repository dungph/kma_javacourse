import java.util.Vector;

public class Main {
    public static void main(String[] a) {
        if (Date.test()) {
            System.out.println("Daate OK");
        } else {
            System.out.println("Date failed");
        }
    }
}

class Circle {
    float radius;
    String color;

    Circle() {
        radius = (float)1.0;
        color = "red";
    }

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
    int balance = 0;

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
    public boolean debit(int amount) {
        if (balance < amount) {
            System.out.println("Debit failed");
            return false;
        } else {
            System.out.println("Debit failed");
            balance -= amount;          
            return false;

        }
    }

    public void credit(int amount) {
        balance += amount;
    }

    public boolean transferTo(Account account, int amount) {
        if (this.debit(amount)) {
            account.credit(amount);
            System.out.println("Successful");
            return true;
        } else {
            System.out.println("Balance < Amount, Abort");
            return false;
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
        this.day = day;
        if (this.isValidIncompleteDate()) {

        } else {
            this.day = 0;
            System.out.println("Invalid day, day = 0");

        }
    }
    public void setYear(int new_year) {
        this.year = new_year;

        if (this.isValidIncompleteDate()) {
        } else {
            this.year = 0;
            System.out.println("Invalid year, year = 0");
        }

    }

    public void setMonth(int month) {
        this.month = month;

        if (this.isValidIncompleteDate()) {
        } else {
            this.month = 0;
            System.out.println("Invalid Month, month = 0");
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
        } else if (month==4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }
    public boolean isValidIncompleteDate() {
        if (day < 0 || month < 0 || year < 0) {
            return false;
        }
        if (month > 12) {
            return false;
        }
        if (year == 0) {
            if (month == 0) {
                if (day > 31) {
                    return false;
                } else {
                    return true;
                }
            } else {
                this.year = 4;

                if (day > this.daysInTheMonth()) {
                    this.year = 0;
                    return false;
                } else {
                    this.year = 0;
                    return true;
                }
            }
        } else {
            if (month == 0) {
                if (day > 31) {
                    return false;
                } else {
                    return true;
                }
            } else {
                if (day > this.daysInTheMonth()) {
                    return false;
                } else {
                    return true;
                }
            }
        }
    }
    public boolean isCompleteDate() {
        if (day*month*year == 0) {
            return false;
        } else {
            return true;
        }
    }
    
    public void showDay() {
        if (this.isCompleteDate()) {
            if (this.isValidIncompleteDate()) {
                System.out.println("The date is "
                    + month
                    + " "
                    + day
                    + ", "
                    + year);
            }
        } else {
            System.out.println("The date is Incomplete");
        }
    }
    
    public static boolean test() {
        int[] test1 = {31, 1, 1, 1};
        int[] test2 = {31, 4, 1, 0};
        int[] test3 = {29, 2, 1, 0};
        int[] test4 = {29, 2, 4, 1};
        int[] test5 = {32, 1, 1, 0};

        int[] test6 = {31, 12, 1, 1};
        int[] test7 = {31, 13, 1, 0};
        int[] test8 = {31, 1, -1, 0};
        
        
        Vector<int[]> all = new Vector<int[]>();
        all.add(test1);
        all.add(test2);
        all.add(test3);
        all.add(test4);
        all.add(test5);
        all.add(test6);
        all.add(test7);
        all.add(test8);

        for (int[] test: all) {
            Date date = new Date();
            date.day = test[0];
            date.month = test[1];
            date.year = test[2];
            System.out.println(date.isValidIncompleteDate());
            System.out.println(test[3] == 1);
            if (date.isValidIncompleteDate() == (test[3] == 1)) {
            } else {
                System.out.println(date.getDay());
                System.out.println(date.getMonth());
                System.out.println(date.getYear());
                System.out.println(test[3]);
                return false;
            }
        }
    
        return true;
        
    }
}
