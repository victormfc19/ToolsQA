package co.com.practica.toolsqa.stepdefinitions;
import cucumber.api.java.After;


public class AfterTestStepDefinitions {

    @After(value = "@Test1RadioButton, @Test2CorrectlyData")
    public void afterRadioButton(){
        System.out.println("#######################################################");
        System.out.println("ESTOY EJECUTANDO EL AFTER DEL TEST 1 - RADDIO BUTTON");
        System.out.println("#######################################################");
    }

    @After(value = "@Test2CorrectlyData")
    public void correctlyData(){
        System.out.println("#######################################################");
        System.out.println("ESTOY EJECUTANDO EL AFTER DEL TEST 2 - CORRECTLY DATA");
        System.out.println("#######################################################");
    }

    @After(value = "@Test3IncorrectlyData")
    public void incorrectlyData(){
        System.out.println("#######################################################");
        System.out.println("ESTOY EJECUTANDO EL AFTER DEL TEST 3 - INCORRECTLY DATA");
        System.out.println("#######################################################");
    }
}
