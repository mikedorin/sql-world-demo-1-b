package edu.stthomas.sqlworlddemo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/send-data")
    public String sendDataPage() {
        return "send-data"; // Assuming your HTML file for sending data is named send-data.html
    }

    @GetMapping("/fetch-data")
    public String fetchDataPage() {
        return "fetch-data"; // Assuming your HTML file for fetching data is named fetch-data.html
    }
}