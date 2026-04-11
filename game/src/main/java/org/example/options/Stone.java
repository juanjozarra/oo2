package org.example.options;


public class Stone extends BaseOption {


    @Override
    public String vs(BaseOption option) {
        return option.playVsStone();
    }

    @Override
    public String playVsStone() {
        return "Draw";
    }

    @Override
    public String playVsScissor() {
        return "Stone";
    }

    @Override
    public String playVsLizard() {
        return "Stone";
    }

    @Override
    public String playVsSpock() {
        return "Spock";
    }

    @Override
    public String playVsPapper() {
        return "Papper";
    }
}
