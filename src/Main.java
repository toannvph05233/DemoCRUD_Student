import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] arrStudent = new Student[1];
        arrStudent[0] = new Student(1, "toan", "nam", 18);
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1.Thêm");
            System.out.println("4.Show");
            System.out.println("5.Exit");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    arrStudent = Manager.create(arrStudent);
                    break;
                case 4:
                    for (Student s:arrStudent) {
                        System.out.println(s);
                    }
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}
