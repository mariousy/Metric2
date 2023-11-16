# Metric Converter App

## Description
The Metric Converter App is a JavaFX-based graphical user interface application that allows users to perform simple metric conversions. It supports conversions between kilograms and pounds, grams and ounces, kilometers and miles, and millimeters and inches.


## Setup and Execution
1. **JavaFX SDK Setup:**
   - Ensure that JavaFX SDK is downloaded and extracted.
   - Set the `PATH_TO_FX` environment variable to point to the `lib` directory of your JavaFX SDK installation.

2. **Compilation:**
   - Navigate to the directory containing the `MetricConverterApp.java`.
   - Compile the application using:
     ```
     javac --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml MetricConverterApp.java
     ```

3. **Running the Application:**
   - Run the application with:
     ```
     java --module-path $PATH_TO_FX --add-modules javafx.controls,javafx.fxml MetricConverterApp
     ```

## Usage
- After starting the application, the GUI will display input fields, a dropdown for conversion types, and a convert button.
- Enter the value to convert in the 'Input Value' field.
- Select the desired conversion type from the dropdown menu.
- Click 'Convert' to perform the conversion. The result will be displayed in the 'Converted Value' field.
- For any invalid input, an error message will appear in the 'Converted Value' field.
