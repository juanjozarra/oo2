package org.example.options;


public abstract class BaseOption {
    public abstract String vs(BaseOption option);
    public abstract String playVsStone();
    public abstract String playVsScissor();
    public abstract String playVsLizard();
    public abstract String playVsSpock();
    public abstract String playVsPapper();
}
