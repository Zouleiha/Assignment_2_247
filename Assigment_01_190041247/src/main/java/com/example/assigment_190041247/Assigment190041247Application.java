package com.example.assigment_190041247;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assigment190041247Application {

    public static void main(String[] args) {

        //fetch  record based on his roll no
        CakexModel model  = retrieveCourseFromDatabase();

        //Create a view : to write cake details on console
        CakexView view = new CakexView();

        CakexController controller = new CakexController(model, view);

        controller.updateView();

        //update model data
        controller.setCakeName("CupCake");
        System.out.println("Updated Details");

        controller.updateView();
    }
            //set cake information
    private static CakexModel retrieveCourseFromDatabase(){
        CakexModel cake = new CakexModel();
        cake.setName("Pound Cake");
        cake.setId("1000tk");
        cake.setType("chocolate");
        return cake;
    }
}
