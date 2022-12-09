package PTA1;

public class Salesman extends Employee{
    int Salary;
    int Ticheng;

    public Salesman(int salary, int ticheng) {
        Salary = salary;
        this.Ticheng = ticheng;
    }

    @Override
    int getSalary() {
        return Salary+Ticheng;
    }
}
