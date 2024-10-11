package org.marroquin.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {
    private final UserService userService;

    @Autowired
    public Main(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        // Ejecutar una acción de usuario, lo que también enviará una notificación
        userService.performUserAction();
    }
}
