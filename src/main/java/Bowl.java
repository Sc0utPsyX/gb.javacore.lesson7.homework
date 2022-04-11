public class Bowl {
    private int foodAmount;

    public void fillBowl(int amount) {
        this.foodAmount += amount;
        System.out.printf("В миску добавлено %d единиц еды, теперь в миске %d еды\n", amount, foodAmount);
    }

    public boolean decreaseFood(int amount) {
        if (amount < foodAmount) {
            this.foodAmount -= amount;
            return true;
        } else return false;
    }


    public int getFoodAmount() {
        return foodAmount;
    }
}