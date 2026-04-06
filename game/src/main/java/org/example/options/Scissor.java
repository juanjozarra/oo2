package org.example.options;


import java.util.List;

public class Scissor extends BaseOption {

    public Scissor() {
        this.name = "scissor";
        this.winsTo = List.of("papper", "lizard");
    }

}
