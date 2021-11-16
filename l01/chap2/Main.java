import java.util.Scanner;

public class Main {
    public static void main(String[] a) {

    }
}

class NhanVien {
    String name;
    int age;
    String address;
    double salary;
    int workingHours;
    
    NhanVien() {}

    NhanVien(String name, int age, String address, double salary, int workingHours) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.workingHours = workingHours;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	};

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input data");
        System.out.println("Input name");
        this.name = scanner.nextLine();

        System.out.println("Input age");
        this.age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Input address");
        this.address = scanner.nextLine(); 

        System.out.println("Input salary");
        this.salary = scanner.nextDouble();

        System.out.println("Input workingHours");
        this.workingHours = scanner.nextInt();
    }

    public double tinhThuong() {
        if (workingHours >= 200) {
            return salary*0.2;
        } else if (workingHours>= 100) {
            return salary*0.1;
        } else {
            return 0;
        }
    }
    public void printInfo() {
        System.out.println(
                name
                + " sinh nam " 
                + age 
                + " dia_chi " 
                + address + " luong " 
                + salary
                + " tong_gio_lam_viec " 
                + workingHours);
    }
 

}

class Student {
    String code;
    float avarageScore;
    int age;
    String className;

    Student() {}
    Student(String a, float b, int c, String d) {
        code = a;
        avarageScore = b;
        age = c;
        className = d;
    }

    public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public float getAvarageScore() {
		return avarageScore;
	}
	public void setAvarageScore(float avarageScore) {
		this.avarageScore = avarageScore;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap code: ");
            code = scanner.nextLine();
            code.trim();
        } while (code.length() != 4);

        do {
            System.out.print("Nhap avarageScore: ");
            avarageScore = scanner.nextFloat();
        } while (avarageScore < 0.0 || avarageScore > 10.0);

        do {
            System.out.print("Nhap age: ");
            age = scanner.nextInt();
        } while (age < 18);
        scanner.nextLine();
        do {
            System.out.print("Nhap className: ");
            className = scanner.nextLine();
            className.trim();
            System.out.println(className);
        } while (className.charAt(0) != 'A' && className.charAt(0) != 'B' && className.charAt(0) != 'C');
    }
    public void printInfo() {
        System.out.println("code: " + code);
        System.out.println("avarageScore: " + avarageScore);
        System.out.println("age: " + age);
        System.out.println("className: " + className);
    }

    public boolean hasScholarship() {
        if (avarageScore >= 8.0) {
            return true;
        } else {
            return false;
        }
    }

	public static void main() {
        Student s = new Student();
        s.inputInfo();
        s.printInfo();
    }
}

class MyPoint {
    int x;
    int y;

    MyPoint() {
        x = 0;
        y = 0;
    }

    MyPoint(int x, int y) {
        this.x = x;
        this.y = x;
    }

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

    public void setXY(int x, int y) {
        this.setX(x);
        this.setY(y);
    }
    
    public String toString() {
        String ret = "(";
        ret += x; 
        ret += ", ";
        ret += y;
        ret += ")";
        return ret;
    }
    public double distantFrom(int rx, int ry) {
        double dx = (double)(rx - x)*(rx - x);
        double dy = (double)(ry - y)*(ry - y);
        return Math.sqrt(dx + dy);
    }
}
