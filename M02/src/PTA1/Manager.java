package PTA1;

class Manager extends Employee{
    int Salary;

    public Manager(int salary) {
        Salary = salary;
    }

    @Override
    int getSalary() {
        return Salary;
    }
}
