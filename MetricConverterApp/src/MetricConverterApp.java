import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MetricConverterApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Metric Converter");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label inputLabel = new Label("Input Value:");
        grid.add(inputLabel, 0, 0);
        TextField inputValue = new TextField();
        grid.add(inputValue, 1, 0);

        Label outputLabel = new Label("Converted Value:");
        grid.add(outputLabel, 0, 1);
        TextField outputValue = new TextField();
        outputValue.setEditable(false);
        grid.add(outputValue, 1, 1);

        ComboBox<String> conversionType = new ComboBox<>();
        conversionType.getItems().addAll("kg to lb", "g to oz", "km to mi", "mm to in");
        conversionType.setValue("kg to lb");
        grid.add(conversionType, 0, 2);

        Button convertButton = new Button("Convert");
        grid.add(convertButton, 1, 2);
        convertButton.setOnAction(e -> {
            try {
                double input = Double.parseDouble(inputValue.getText());
                String conversion = conversionType.getValue();
                double result = convert(input, conversion);
                outputValue.setText(String.format("%.2f", result));
            } catch (NumberFormatException ex) {
                outputValue.setText("Invalid input");
            }
        });

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private double convert(double value, String conversionType) {
        switch (conversionType) {
            case "kg to lb":
                return value * 2.20462;
            case "g to oz":
                return value * 0.035274;
            case "km to mi":
                return value * 0.621371;
            case "mm to in":
                return value * 0.0393701;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
