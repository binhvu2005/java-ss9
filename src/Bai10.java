import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai10 {
    public enum Gender {
        MALE, FEMALE, OTHERS;
    }

    public static class Student {
        private static int idCounter = 1;

        private int studentId;
        private String name;
        private int age;
        private Gender gender;
        private String address;
        private String phone;

        public Student(String name, int age, Gender gender, String address, String phone) {
            this.studentId = idCounter++;
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.address = address;
            this.phone = phone;
        }

        public void inputData() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập tên: ");
            name = scanner.nextLine();
            System.out.print("Tuổi: ");
            age = scanner.nextInt();
            System.out.print("Giới tính (Male/Female/Others): ");
            scanner.nextLine();
            String genderInput = scanner.nextLine();
            switch (genderInput.toUpperCase()) {
                case "MALE":
                    gender = Gender.MALE;
                    break;
                case "FEMALE":
                    gender = Gender.FEMALE;
                    break;
                default:
                    gender = Gender.OTHERS;
            }
            System.out.print("Địa chỉ: ");
            address = scanner.nextLine();
            System.out.print("Số điện thoại: ");
            phone = scanner.nextLine();
        }

        public void displayData() {
            System.out.println("Thông tin sinh viên:");
            System.out.println("Mã sinh viên: " + studentId);
            System.out.println("Tên: " + name);
            System.out.println("Tuổi: " + age);
            System.out.println("Giới tính: " + gender);
            System.out.println("Địa chỉ: " + address);
            System.out.println("Số điện thoại: " + phone);
        }

        public int getId() {
            return studentId;
        }
    }

    private static List<Student> students = new ArrayList<>();

    private static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống!");
        } else {
            System.out.println("Danh sách tất cả sinh viên:");
            for (Student student : students) {
                student.displayData();
                System.out.println("----------------------");
            }
        }
    }

    private static void addStudent() {
        Student newStudent = new Student("", 0, Gender.OTHERS, "", "");
        newStudent.inputData();
        students.add(newStudent);
    }

    private static void editStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Sửa thông tin cho sinh viên có mã: " + id);
                student.inputData();
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã sinh viên: " + id);
    }

    private static void deleteStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                System.out.println("Xóa sinh viên thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã sinh viên: " + id);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("==== Menu ====");
            System.out.println("1. Hiển thị danh sách tất cả sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Sửa thông tin sinh viên dựa vào mã sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayAllStudents();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    System.out.print("Nhập mã sinh viên cần sửa: ");
                    int idToEdit = scanner.nextInt();
                    editStudentById(idToEdit);
                    break;
                case 4:
                    System.out.print("Nhập mã sinh viên cần xóa: ");
                    int idToDelete = scanner.nextInt();
                    deleteStudentById(idToDelete);
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }

        } while (choice != 5);

        scanner.close();
    }
}
