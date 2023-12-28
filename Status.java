public enum Status {

    COMPLETED("выполнено"),
    INPROGRESS("в процессе"),
    DENATED("Отложено");

    private String title;

    Status(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
