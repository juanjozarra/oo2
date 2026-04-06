package org.example.options;


import java.util.List;

public class Spock extends BaseOption {
    public Spock() {
        this.name = "spock";
        this.winsTo = List.of("scissor", "rock");
    }
}
