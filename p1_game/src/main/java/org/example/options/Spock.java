package org.example.options;


public class Spock extends BaseOption {

    @Override
    public String vs(BaseOption option) {
        return option.playVsSpock();
    }

    @Override
    public String playVsStone() {
        return "Spock";
    }

    @Override
    public String playVsScissor() {
        return "Spock";
    }

    @Override
    public String playVsLizard() {
        return "Lizard";
    }

    @Override
    public String playVsSpock() {
        return "Draw";
    }

    @Override
    public String playVsPapper() {
        return "Papper";
    }
}
