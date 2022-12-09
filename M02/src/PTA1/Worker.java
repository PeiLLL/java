package PTA1;

class Worker extends Employee{
    int day;

    public Worker(int day, int salary) {
        this.day = day;
        this.salary = salary;
    }

    int salary;

    @Override
    int getSalary() {
        return day*salary;
    }
}
