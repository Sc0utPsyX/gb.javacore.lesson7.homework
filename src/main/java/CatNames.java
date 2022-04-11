public enum CatNames {
        VASYA("Василий"),
        GARFILD("Гарфилд"),
        TOM("Том"),
        LEO("Леопольд"),
        BEGEMOT("Бегемот"),
        PUSHOK("Пушок"),
        ATOS("Атос");

    private final String russianTitle;

    CatNames(String russianTitle) {
        this.russianTitle = russianTitle;
    }


    public String getRussianTitle() {
        return russianTitle;
    }
}
