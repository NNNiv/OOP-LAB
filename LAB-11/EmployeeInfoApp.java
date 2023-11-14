package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

class Employee {
  public String name;
  public int empID;
  public String designation;
  public double basicPay;
  public double DA;
  public double HRA;
  public double PF;
  public double LIC;
  public double netSalary;

  public Employee(String name, int empID, String designation, double basicPay) {
    this.name = name;
    this.empID = empID;
    this.designation = designation;
    this.basicPay = basicPay;
    this.DA = 0.4 * basicPay;
    this.HRA = 0.15 * basicPay;
    this.PF = 0.12 * basicPay;
    // Assume LIC and netSalary are calculated based on other parameters
    this.LIC = 0.1 * basicPay;
    this.netSalary = basicPay - PF - LIC; 
  }

}
public class EmployeeInfoApp extends Application {


    @Override
    public void start(Stage primaryStage) {
        // Create an Employee instance
        Employee employee = new Employee("Joe Mama", 1221, "Software Engineer", 50000.0);

        // Create labels to display employee information
        Label nameLabel = new Label("Name: " + employee.name);
        Label empIDLabel = new Label("Employee ID: " + employee.empID);
        Label designationLabel = new Label("Designation: " + employee.designation);
        Label basicPayLabel = new Label("Basic Pay: Rs. " + employee.basicPay);
        Label daLabel = new Label("DA: Rs. " + employee.DA);
        Label hraLabel = new Label("HRA: Rs. " + employee.HRA);
        Label pfLabel = new Label("PF: Rs. " + employee.PF);
        Label licLabel = new Label("LIC: Rs. " + employee.LIC);
        Label netSalaryLabel = new Label("Net Salary: Rs. " + employee.netSalary);

        // Create a GridPane layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5);

        // Add labels to the GridPane
        gridPane.addRow(0, nameLabel);
        gridPane.addRow(1, empIDLabel);
        gridPane.addRow(2, designationLabel);
        gridPane.addRow(3, basicPayLabel);
        gridPane.addRow(4, daLabel);
        gridPane.addRow(5, hraLabel);
        gridPane.addRow(6, pfLabel);
        gridPane.addRow(7, licLabel);
        gridPane.addRow(8, netSalaryLabel);

        // Create a Scene with the GridPane as its root
        Scene scene = new Scene(gridPane, 400, 300);

        // Set the title of the Stage
        primaryStage.setTitle("Employee Information");

        // Set the Scene for the Stage
        primaryStage.setScene(scene);

        // Show the Stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
	
