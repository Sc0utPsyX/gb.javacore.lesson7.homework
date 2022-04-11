public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Bowl bowl) {
        if (bowl.decreaseFood(appetite) && !this.satiety) { // тут навсякий случай чтобы сытый Кот не кушал!
            System.out.printf("Котик %s поел %d единиц еды\n", name, appetite);
            System.out.printf("В миске осталось %d единиц еды\n", bowl.getFoodAmount());
            this.satiety = true;
        } else if (this.satiety) {
            System.out.printf("Котик %s сыт!\n", name);
        }
        else System.out.printf("В миске недостаточно еды для котика с именем %s\n", name);
    }

    @Override
    public String toString() {
        return String.format("Имя Котика: %s\nАппетит котика: %s\nСытость : %s\n", name, appetite, satiety);
    }
}