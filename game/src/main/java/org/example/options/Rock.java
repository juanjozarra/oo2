package org.example.options;

import java.util.List;

public class Rock extends BaseOption {

    public Rock() {
        this.name = "rock";
        this.winsTo = List.of("scissor", "lizard");
    }

}
