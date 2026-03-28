package org.example.options;

public interface Option {
    String getName();
    boolean winsTo(Option option);
}
