import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FourFunctionCalculator extends Application {

    @Override
    public void start(Stage primaryStage) {
        TextField num1Field = new TextField();
        num1Field.setPromptText("Enter first number");
        TextField num2Field = new TextField();
        num2Field.setPromptText("Enter second number");

        Label resultLabel = new Label("Result: ");

        Button addButton = new Button("+");
        Button subButton = new Button("-");
        Button mulButton = new Button("*");
        Button divButton = new Button("/");

        addButton.setOnAction(e -> {
            double n1 = Double.parseDouble(num1Field.getText());
            double n2 = Double.parseDouble(num2Field.getText());
            resultLabel.setText("Result: " + (n1 + n2));
        });

        subButton.setOnAction(e -> {
            double n1 = Double.parseDouble(num1Field.getText());
            double n2 = Double.parseDouble(num2Field.getText());
            resultLabel.setText("Result: " + (n1 - n2));
        });

        mulButton.setOnAction(e -> {
            double n1 = Double.parseDouble(num1Field.getText());
            double n2 = Double.parseDouble(num2Field.getText());
            resultLabel.setText("Result: " + (n1 * n2));
        });

        divButton.setOnAction(e -> {
            double n1 = Double.parseDouble(num1Field.getText());
            double n2 = Double.parseDouble(num2Field.getText());
            if (n2 != 0) {
                resultLabel.setText("Result: " + (n1 / n2));
            } else {
                resultLabel.setText("Cannot divide by zero!");
            }
        });

        HBox inputBox = new HBox(10, num1Field, num2Field);
        HBox buttonBox = new HBox(10, addButton, subButton, mulButton, divButton);
        VBox root = new VBox(10, inputBox, buttonBox, resultLabel);
        root.setPadding(new Insets(20));

        Scene scene = new Scene(root, 300, 150);
        primaryStage.setTitle("Four-Function Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
