import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;

public class TaskManager {

    //Поле - список заданий
    ArrayList<Task> taskList;

    //Конструктор
    public TaskManager(ArrayList<Task> taskList){
        this.taskList = new ArrayList<>(taskList);
    }

    //Методы

    //Добавление
    public void addToManager(Task newTask){
        this.taskList.add(newTask);
    }

    //Удаление
    public void deleteFromManager(Task taskToDelete){
        this.taskList.remove(taskToDelete);
    }

    //Обновление одного из заданий
    public void updateInManager(int indexToUpdate, Task newTask){
        this.taskList.set(indexToUpdate, newTask);
    }

    //Вывод информации о задачах
    public void PrintManager(){

        System.out.println("\nИнформация о задачах:");
        for (Task task : this.taskList){
            System.out.println(task.toString());
        }

    }
}
