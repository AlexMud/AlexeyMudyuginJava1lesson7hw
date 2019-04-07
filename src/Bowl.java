class Bowl {
    protected int amount;
    protected int food;

    Bowl(int amount, int food) {
        this.amount = amount;
        this.food = food;
    }

    boolean eatenFood(int pack) {
        if (food < pack) return false;
        food -= pack;
        return true;
    }

    void addFood(int food) {
        if (this.food + food <= amount)
            this.food += food;
    }

    @Override
    public String toString() {
        return "In bowl: " + food + " packs of catfood";
    }
}