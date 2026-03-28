package org.example.options;

import java.util.List;

abstract class BaseOption implements Option {
    protected String name;
    protected List<String> winsTo;


    public String getName() {
        return name;
    }

    @Override
    public boolean winsTo(Option option) {
        return winsTo.contains(option.getName());
    }

}
