public class Task {

    //Поля класса
    private String id;
    private String name;
    private String description;
    private Status status;

    //Конструктор
    public Task(String id, String name, String description, Status status){
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
    }

    //Геттеры и сеттеры
    //ИД
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }

    //Название
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    //Описание
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.id;
    }
    public void setStatus(Status status){
        this.status = status;
    }
    public String getStatus(){
        return this.id;
    }

    public String toString(){
       return "Инфо о задании : ИД = " + id + ", Название = " + name + ", Описание = " + description
                + ", статус задания = " + status.toString();
    }






}
