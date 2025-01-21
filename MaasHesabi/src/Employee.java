public class Employee {
    String name;
    double salary = 0.0;
    int workHours;
    int hireYear;//işe başlangıç yılı

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {//maaşa uygulanacak vergi
        if (this.salary < 1000) {
            return 0;
        } else {
            double taxes = (this.salary * 3) / 100;
            return taxes;
        }
    }

    public double bonus() {
        double bonus = 0;
        if (this.workHours >= 40) {
            bonus = (this.workHours - 40) * 30;
        }
        return bonus;
    }

    public double raiseSalary() {
        int workYear = 2021 - this.hireYear;
        double raise = 0;
        if (workYear < 10) {
            raise = (this.salary * 5) / 100;
        } else if ((workYear > 9) && (workYear < 20)) {
            raise = (this.salary * 10) / 100;
        } else if (workYear > 19) {
            raise = (this.salary * 15) / 100;
        }
        return raise;
    }

    public String toString() {
        return ("Adı: " + this.name +
                "\nMaaşı: " + this.salary +
                "\nÇalışma Saati: " + this.workHours +
                "\nBaşlangıç Yılı: " + this.hireYear +
                "\nVergi: " + tax() +
                "\nBonus: " + bonus() +
                "\nMaaş Artışı: " + raiseSalary() +
                "\nVergi ve Bonuslar ile Birlikte Maaş: " + ((salary - tax()) + bonus()) +
                "\nToplam Maaş: " + ((salary - tax()) + bonus() + raiseSalary()));
    }
}
