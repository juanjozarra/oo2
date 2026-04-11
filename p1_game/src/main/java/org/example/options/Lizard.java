package org.example.options;


public class Lizard extends BaseOption{

    @Override
    public String vs(BaseOption option) {
        return option.playVsLizard();
    }

    @Override
    public String playVsStone() {
        return "Stone";
    }

    @Override
    public String playVsScissor() {
        return "Scissor";
    }

    @Override
    public String playVsLizard() {
        return "Draw";
    }

    @Override
    public String playVsSpock() {
        return "Lizard";
    }

    @Override
    public String playVsPapper() {
        return "Lizard";
    }
}
