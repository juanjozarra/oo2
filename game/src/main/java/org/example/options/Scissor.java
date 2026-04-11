package org.example.options;


public class Scissor extends BaseOption {

    @Override
    public String vs(BaseOption option) {
        return option.playVsScissor();
    }

    @Override
    public String playVsStone() {
        return "Stone";
    }

    @Override
    public String playVsScissor() {
        return "Draw";
    }

    @Override
    public String playVsLizard() {
        return "Scissor";
    }

    @Override
    public String playVsSpock() {
        return "Spock";
    }

    @Override
    public String playVsPapper() {
        return "Scissor";
    }
}
