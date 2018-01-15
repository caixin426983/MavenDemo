package test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by CX on 2018-1-15.
 */
public class LambdaTest {

  private  static final   List<Person> javaProgrammers = new ArrayList<Person>() {
        {
            add(new Person("Elsdon", "Jaycob", "Java programmer", "male", 43, 2000));
            add(new Person("Tamsen", "Brittany", "Java programmer", "female", 23, 1500));
            add(new Person("Floyd", "Donny", "Java programmer", "male", 33, 1800));
            add(new Person("Sindy", "Jonie", "Java programmer", "female", 32, 1600));
            add(new Person("Vere", "Hervey", "Java programmer", "male", 22, 1200));
            add(new Person("Maude", "Jaimie", "Java programmer", "female", 27, 1900));
            add(new Person("Shawn", "Randall", "Java programmer", "male", 30, 2300));
            add(new Person("Jayden", "Corrina", "Java programmer", "female", 35, 1700));
            add(new Person("Palmer", "Dene", "Java programmer", "male", 33, 2000));
            add(new Person("Addison", "Pam", "Java programmer", "female", 34, 1300));
        }
    };




    public static void main(String[] args) {


//        实用lanmbda表达式
//        现在我们使用forEach方法来迭代输出上述列表:
//        javaProgrammers.forEach( person -> System.out.printf("%s %s; ",person.getFirstName(),person.getLastName()) );

//    没涨工资之前
//        javaProgrammers.forEach( person -> System.out.println(person.getFirstName()+"--"+person.getSalary()));
//        我们同样使用forEach方法,增加程序员的工资5%:
//        Consumer<Person> giveRaise = e -> e.setSalary(e.getSalary() / 100 * 5 + e.getSalary());

//        javaProgrammers.forEach(giveRaise);
//        涨工资之后
//        javaProgrammers.forEach( person -> System.out.println(person.getSalary()));


//        filter();
        customFilter();
    }


    /**
     * 过滤参数
     */
    public static void filter(){
        javaProgrammers.stream().filter(person -> person.getSalary()>=2000).forEach(person -> System.out.println(person.getFirstName()));
    }

    /**
     * 自定义过滤器
     */
    protected  static void customFilter(){
        //年龄大于25
        Predicate<Person> ageFilter = (person) -> (person.getAge()>25);
        //工资高于2000
        Predicate<Person> salaryFilter = (person) ->(person.getSalary()>1300);
        //性别为女性
        Predicate<Person> genderFilter = (p) -> ("female".equals(p.getGender()));

        javaProgrammers.stream().filter(ageFilter).filter(salaryFilter).forEach(person -> System.out.println(person.getFirstName()));
        System.out.println("---------------------------------------");
        //limit方法可以限制结果集的个数
        javaProgrammers.stream().filter(ageFilter).filter(salaryFilter).limit(3).forEach(person -> System.out.println(person.getFirstName()));

    }

}
