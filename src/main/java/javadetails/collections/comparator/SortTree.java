package javadetails.collections.comparator;

import java.util.*;

/**
 * Для упорядочивания объектов одного типа, хранящихся в массиве или коллекции, разработчики Java придумали интерфейс Comparable.
 * В нём объявлен всего один метод, compareTo
 * Здесь мы реализуем интерфейс и переопределяем метод и тогда нам не надо писать компаратор - анонимный класс.
 *
 */
public class SortTree {
    static class User1 implements Comparable<User1> {
        private final String name1;
        private final int age;

        public User1(String name, int age) {
            this.name1 = name;
            this.age = age;
        }

        @Override
        public int compareTo(User1 o) {
            int result = this.name1.compareTo(o.name1);
            //если имена одинаковые -  сравниваем возраст,  используя метод compareTo из класса Integer
            if (result == 0) {
                result = Integer.valueOf(this.age).compareTo(Integer.valueOf(o.age));
            }
            return result;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            SortTree.User1 user1 = (SortTree.User1) o;

            return name1 != null ? name1.equals(user1.name1) : user1.name1 == null;
        }

        @Override
        public int hashCode()   {
            return name1 != null ? name1.hashCode() : 0;
        }

        public String toString() {
            return "User{" + "name=\"" + name1 + "\"" + "}";
        }
    }

    public static void main(String[] args) {
        Set<User1> users1 = new TreeSet<>();
        users1.addAll (Arrays.asList(
                new User1("Petr", 23),
                new User1("Zuma", 45),
                new User1("Oleg", 54)));

        /**
         * TreeSet не имеет метода sort, т.к. оно и так упорядочено.
         * Надо лишь для класса User1 реализовать Comparable и переопределить compareTo
         */
        System.out.println(users1);	//при переопределенном toString печатает всю коллекцию

        /**
         * В интерфейсе List есть метод сорт, действует методом слияния, требует компаратора
         * Либо мы пишем компаратор - анонимный класс
         * Либо объявляем class User implements Comparable<User>
         * И реализуем метод compareTo()
         *
         * Если объекты равны по name, то можно сортировать по второму полю Фамилия
         * Компаратор  compare может вернуть 0 - два объекта равны,
         * 								     1 - объект 1 больше чем объект 2
         *                                  -1 	объект 2 больше чем объект 1
         *
         *  он вызывает compareTo, здесь так же 0 - две строки одинаковы
         *                                     >0 строка больше чем аргумент-строка
         *                                     <0	cтрока меньше чем аргумент-строка
         *
         *                     //Более короткая строка  precedes	длинной, т.е меньше
         */

       /* users1.sort();
                new comparator<SortList.User>() {
                    @Override
                    public int compare(SortTree.User1 o1, SortTree.User1 o2) {
                        return o1.name1.compareTo(o2.name1);
                    }
                });*/

    }
}
