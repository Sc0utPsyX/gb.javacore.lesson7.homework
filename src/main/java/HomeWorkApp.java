public class HomeWorkApp {
    public static void main(String[] args) {
        Cat[] cats = new Cat[7];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat(CatNames.values()[i].getRussianTitle(), (int) Math.round(Math.random() * 49 + 1));
        } /* создаем котиков с присвоением имени из енума и аппетит просто рандомом от 1 до 50 (если котиков будет
        больше чем енумов, можно либо получать порядковый номер енума рандомом, либо зациклить переменную номера)*/
        Bowl bowl = new Bowl();
        bowl.fillBowl(100);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(bowl);
        }
        System.out.println("Созданные котики:");
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].toString());
        }
        cats[0].eat(bowl); // просто проверить что кот не будет есть второй раз!
    }

}
