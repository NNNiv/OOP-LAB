import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentDetailsApp extends Application {

    private ListView<Integer> regNumList;
    private Canvas canvas;

    private List<Student> students;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Student Details Viewer");

        // Create some sample students
        students = createSampleStudents();

        regNumList = new ListView<>();
        regNumList.setItems(getRegistrationNumbers());
        regNumList.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> displayStudentDetails(newValue)
        );

        canvas = new Canvas(400, 200);

        HBox layout = new HBox(10);
        layout.getChildren().addAll(regNumList, canvas);

        Scene scene = new Scene(layout, 600, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private ObservableList<Integer> getRegistrationNumbers() {
        List<Integer> registrationNumbers = new ArrayList<>();
        for (Student student : students) {
            registrationNumbers.add(student.regNum);
        }
        return FXCollections.observableArrayList(registrationNumbers);
    }

    private void displayStudentDetails(Integer registrationNumber) {
        if (registrationNumber != null) {
            Student selectedStudent = findStudentByRegistrationNumber(registrationNumber);
            if (selectedStudent != null) {
                drawStudentDetails(selectedStudent);
            }
        }
    }

    private void drawStudentDetails(Student student) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        gc.fillText("Registration Number: " + student.regNum, 10, 20);
        gc.fillText("Full Name: " + student.fullName, 10, 40);
        gc.fillText("Date of Joining: " + student.dateOfJoining, 10, 60);
        gc.fillText("Semester: " + student.semester, 10, 80);
        gc.fillText("GPA: " + student.GPA, 10, 100);
        gc.fillText("CGPA: " + student.CGPA, 10, 120);
    }

    private Student findStudentByRegistrationNumber(int registrationNumber) {
        for (Student student : students) {
            if (student.regNum == registrationNumber) {
                return student;
            }
        }
        return null;
    }

    private List<Student> createSampleStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(122130169, "Joe Mama", LocalDate.of(2022, 9, 1), (short) 1, 3.5f, 3.5f));
        students.add(new Student(122130420, "Ben Dover", LocalDate.of(2022, 9, 1), (short) 1, 3.8f, 3.8f));
        // Add more students as needed
        return students;
    }

    // Define your Student class with the required fields
    private static class Student {
        public int regNum;
        public String fullName;
        public LocalDate dateOfJoining;
        public short semester;
        public float GPA;
        public float CGPA;

        public Student(int regNum, String fullName, LocalDate dateOfJoining, short semester, float GPA, float CGPA) {
            this.regNum = regNum;
            this.fullName = fullName;
            this.dateOfJoining = dateOfJoining;
            this.semester = semester;
            this.GPA = GPA;
            this.CGPA = CGPA;
        }
    }
    
}
