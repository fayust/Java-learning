package DPIterator;

public class IteratorApp {
    public static void main(String[] args) {
        Tasks c = new Tasks();
        Iterator it = c.getIterator();
        while (it.hasNext()) {
            System.out.println((String)it.next());
        }
    }
}

interface Iterator {
    boolean hasNext();
    Object next();
}

/**
 * Контейнер должен иметь ссылку на Итератор
 */
interface Container {
    Iterator getIterator();
}

/**
 * У нас есть коллекция. В ней есть список задач. Нам нужно иметь итератор для доступа к этим  элементам
 *
 */
class Tasks implements Container {
    String[] tasks = {"Построить дом", "Родить сына", "Посадить дерево"};

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    /**
     * Описываем этот итератор внутренним классом, поскольку он нужен
     * только один раз для родительского класса с коллекцией
     * при вызове Iterator getIterator()
     */
    private class TaskIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < tasks.length) {
                return true;
            }
            return false;
        }


        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}

