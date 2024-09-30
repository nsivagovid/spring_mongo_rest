    package com.example.spring_mongo_curd.Controller;



    import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class HelloWorldController {

        @GetMapping("/hello")
        public String helloWorld() {
            return "hello";  // Return the name of the JSP view (hello.jsp)
        }
    }
