class Cat {
    protected String name;
    protected int hunger;
    protected boolean full;

    Cat(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;
        full = false;
    }

    void setFull(boolean status) {
        full = status;
    }

    void eat(Bowl bowl) {
        if (!full)
            full = bowl.eatenFood(hunger);
    }

    @Override
    public String toString() {
        return "{name=" + name + ", hunger=" +
                hunger + ", full=" + full + "}";
    }
}