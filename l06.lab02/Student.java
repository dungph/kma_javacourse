class Student {
    String full_name;
    String class_name;

    Student(String student_name, String class_name) {
        full_name = student_name;
        this.class_name = class_name;
    }
    public void setDefaultName() {
        full_name = "Nguyen Van A";
    }
    public void show() {
        System.out.println("Fullname: " + full_name);
        System.out.println("Class name: " + class_name);
    }
    
    public static void main(String[] a) {
        Student st1 = new Student("A", "ct");
        Student st2 = new Student("B", "ct");

        st1.show();
        st2.show();
        setDefaultName(st2);
        st1.show();
        st2.show();
    }

    public static void setDefaultName(Student st) {
        st.setDefaultName();
    }
}
