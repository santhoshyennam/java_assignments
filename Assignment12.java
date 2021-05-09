import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

// Student class having fields id,name,age,gender,engDepartment,year of enrollment ,perTillDate

//        1. Print the name of all departments in the college?
//        2.Get the names of all students who have enrolled after 2018?
//        3. Get the details of all male student in the computer sci department?
//        4. How many male and female student are there ? (HINT:use Collectors.groupingBy() for grouping based on gender)
//        5.What is the average age of male and female students?
//        6.Get the details of highest student having highest percentage ?
//        7.Count the number of students in each department? (Hint :use Collectors.groupingBy())
//        8. What is the average percentage achieved in each department?
//        9. Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy)
//        10.How many male and female students are there in the computer science department?


 class Student {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String engDepartment;
    private int year_of_enrollment;
    private double perTillDate;

    Student(int id, String name, int age, String gender, String engDepartment, int year_of_enrollment, double perTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.year_of_enrollment = year_of_enrollment;
        this.perTillDate = perTillDate;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getEngDepartment() {
        return engDepartment;
    }
    public double getPerTillDate() {
        return perTillDate;
    }

    public static void task1(ArrayList<Student> list) {
        list.stream()
                .map(x -> x.engDepartment).distinct()
                .forEach(System.out::println);
    }

    public static void task2(ArrayList<Student> list) {
        list.stream()
                .filter(x -> x.year_of_enrollment > 2018)
                .forEach(x -> System.out.println(x.name));
    }

    public static void task3(ArrayList<Student> list) {
        list.stream()
                .filter(x -> x.engDepartment.equalsIgnoreCase("Computer Science"))
                .filter(x -> x.gender.equalsIgnoreCase("male"))
                .forEach(x -> System.out.println(x.name));
    }

    public static void task4(ArrayList<Student> list) {
        list.stream()
                .collect(groupingBy(Student::getGender))
                .forEach((x, y) -> System.out.println("Count of " + x + " is " + y.size()));
    }

    public static void task5(ArrayList<Student> list) {
        list.stream()
                .collect(groupingBy(Student::getGender, averagingInt(Student::getAge)))
                .forEach((x, y) -> System.out.println("average age of " + x + " is " + y));
    }




    public static String task6(ArrayList<Student> list) {
        return list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Student :: getPerTillDate))).toString();
    }

    public static void task7(ArrayList<Student> list) {
        list.stream()
                .collect(groupingBy(Student::getEngDepartment))
                .forEach((x, y) -> System.out.println("Count of " + x + " is " + y.size()));
    }

    public static void task8(ArrayList<Student> list) {
        list.stream()
                .collect(groupingBy(Student::getEngDepartment, averagingDouble(Student::getPerTillDate)))
                .forEach((x, y) -> System.out.println("average percentage of " + x + " is " + y));
    }

    public static String task9(ArrayList<Student> list) {
        return list.stream()
                .filter(x -> x.gender.equals("Male"))
                .filter(x -> x.engDepartment.equalsIgnoreCase("Electronic"))
                .collect(Collectors.minBy(Comparator.comparingInt(Student::getAge))).toString();
    }

    public static void task10(ArrayList<Student> list) {
        list.stream()
                .filter(x -> x.engDepartment.equalsIgnoreCase("computer science"))
                .collect(Collectors.groupingBy(Student::getGender))
                .forEach((x, y) -> System.out.println("No of " + x + " in Computer Science is " + y.size()));
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        list.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        list.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        list.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        list.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        list.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        list.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        list.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        list.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        list.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        list.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        list.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        list.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        list.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        list.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        list.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        list.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
        System.out.println();
        task1(list);
        System.out.println();
        task2(list);
        System.out.println();
        task3(list);
        System.out.println();
        task4(list);
        System.out.println();
        task5(list);
        System.out.println();
        System.out.println("Details of Student with Highest percentage"+task6(list).substring(8));
        task7(list);
        System.out.println();
        task8(list);
        System.out.println();
        System.out.println("Details Of young student"+task9(list).substring(8));
        task10(list);
    }
}