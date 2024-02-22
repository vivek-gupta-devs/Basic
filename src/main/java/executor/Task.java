package executor;

import com.github.javafaker.Faker;

public class Task implements Runnable{

    @Override
    public void run() {
        Faker faker = new Faker();
        Employee employee = Employee
                .builder()
                .name(faker.name().firstName())
                .age(faker.number().numberBetween(20,90))
                .email(faker.internet().emailAddress())
                .address(faker.address().streetAddress())
                .salary(faker.number().randomDouble(4,50000,500000))
                .build();

        System.out.printf("Thread name : %s \n",Thread.currentThread().getName());
        System.out.println(employee);
        System.out.println();
    }


}
