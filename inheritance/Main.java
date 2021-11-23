public class Main {
    public static void main(String[] a) {

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

class Cylinder extends Circle {
    double height;

    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }
    public double getVolumne() {
        return (double)this.area()*height;
    }
}

class Person {
    String name;
    int age;
    String gender;
}

class Employee extends Person {
    double salary;
    double salaryLevel;
    public double income() {
        return salary* salaryLevel;
    }
}

class Manager extends Employee {
    double extraIncome;
    public double income() {
        return (super.income() + extraIncome);
    };
}

class Student extends Person {
    String code;
}

class Programmer extends Student {
    int yearsOfExp;
}
