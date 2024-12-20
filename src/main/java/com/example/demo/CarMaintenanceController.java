package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CarMaintenanceController {

    @GetMapping("/")
    public String showForm() {
        return "car-maintenance"; // Returns the car-maintenance.html template
    }

    @PostMapping("/submit")
    public String submitForm(Model model, String registration, String serviceType, String date, Double cost, String description) {
        // This is where you can process or save the form data
        // You can pass this data to the result page or save it to a database

        // For now, we'll add attributes to display on a result page
        model.addAttribute("registration", registration);
        model.addAttribute("serviceType", serviceType);
        model.addAttribute("date", date);
        model.addAttribute("cost", cost);
        model.addAttribute("description", description);

        return "result"; // Returns the result page after form submission
    }
}
