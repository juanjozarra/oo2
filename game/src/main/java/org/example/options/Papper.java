package org.example.options;

public class Papper extends BaseOption {

    @Override
    public String vs(BaseOption option) {
        return option.playVsPapper();
    }

    @Override
    public String playVsStone() {
        return "Papper";
    }

    @Override
    public String playVsScissor() {
        return "Scissor";
    }

    @Override
    public String playVsLizard() {
        return "Lizard";
    }

    @Override
    public String playVsSpock() {
        return "Papper";
    }

    @Override
    public String playVsPapper() {
        return "Draw";
    }
}
