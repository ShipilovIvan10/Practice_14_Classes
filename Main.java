
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Класс Task
        Task task1 = new Task("878ds4s", "Перезагрузка аппарата",
                "Процесс перезапускает работу аппаратной машины с отдыхом в 3 сек.", Status.INPROGRESS);

        //Вывод 1-го варианта задания
        System.out.println("\nИсходный вариант объекта task:  " + task1.toString());

        task1.setId("ewfhui232");
        task1.setName("Загрузка ОС");
        task1.setDescription("Процесс загружает ОС из памяти устройства");
        task1.setStatus(Status.COMPLETED);

        System.out.println("Изменённый вариант об task:  " + task1.toString());

        //Создадим массив задач
        ArrayList<Task> taskArrayList = new ArrayList<>(10);
        taskArrayList.add(task1);

        //Класс TaskManager
        //Создание
        TaskManager taskManager = new TaskManager(taskArrayList);

        //Добавим Задачу
        Task task2 = new Task("dsfd32", "Завершени работы",
                "Процесс бла-бал-бла в 3 сек.", Status.INPROGRESS);

        Task task3 = new Task("32r3rf", "Взрыв работы",
                "Процесс взрывает работу аппарата через 3 сек.", Status.COMPLETED);

        taskManager.addToManager(task2);
        taskManager.addToManager(task3);

        //Вывод информации
        System.out.println("\n добавления задач:");
        taskManager.PrintManager();

        //Удалим задачу
        taskManager.deleteFromManager(task3);

        //Вывод информации
        System.out.println("\nПосле удаления задачи:");
        taskManager.PrintManager();

        //Обновим задачу номер 2
        Task task4 =  new Task("gy3gyu2yu", "Старт работы системы",
                "Процесс запускает работу аппарата через 3 сек.", Status.DENATED);

        taskManager.updateInManager(1, task4);

        //Вывод информации
        System.out.println("\nПосле обновления задачи #2:");
        taskManager.PrintManager();


        //Экземпляр объекта продукт
        Product product1 = new Product("s11", "Сахар по 900г.", 90.99,5);
        Product product2 = new Product("w11", "газировка Спрайт", 200.50,30);
        //Еще 3товара
        Product product3 = new Product("b11", "Хлеб тост", 25.90,15);
        Product product4 = new Product("f11", "рыба копч.", 505.50,10);
        Product product5 = new Product("m11", "мука.", 505.50,10);

        ArrayList<Product> productArrayList = new ArrayList<>(10);
        productArrayList.add(product1);

        //Экземпляр объекта магазин
        Store myStore = new Store(productArrayList);

        //Добавление товара
        myStore.addProductToStore(product2);
        myStore.addProductToStore(product3);
        myStore.addProductToStore(product4);

        //Вывод
        System.out.println("\nПосле добавления товаров:");
        myStore.PrintProductsOfStore();

        //Удаление (продажа) экземпляра
        myStore.saleProduct(product2);

        //Вывод
        System.out.println("\nПосле удаления товара #2:");
        myStore.PrintProductsOfStore();

        //Обновление товара
        myStore.updateProductInStore(1, product5);

        //Вывод
        System.out.println("\nПосле обновления товара #2:");
        myStore.PrintProductsOfStore();

        System.out.println("\nСтоимость всех товаров в магазине.");
        System.out.println(myStore.totalCost());










    }
}