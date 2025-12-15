package core;

public class GreetingService {
    public String greet(String name) {
    if (name == null || name.isBlank()) {
        return "Hola desde core 👋";
    }
        return "Hola, " + name + " (desde core)";
    }
}