public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
            //    System.out.println(); Bug oluşması dahilinde çalıştır .
        } else if (salary > 1000) {
            return salary * 0.03;
        } else
            return 0;
    }

    public int bonus() {
        if (workHours > 40) {
            return (workHours-40)*30;
        } else
            return 0;
    }
    public double raiseSalary(){
        int Fark = 2021 - hireYear;
        if (Fark < 10)
            return salary *0.05;
        else if (Fark > 9 && Fark<20){
            return  salary * 0.1;
        } else if (Fark > 19) {
            return salary * 0.15;
        }
        else
            return 0;
    }
    public String toString(){
        return "Adı : "+this.name+"\n"+"Maaşı : "+this.salary+"\n"+"Çalışma Saati : "+this.workHours+"\n"+"Başlangıç Yılı : "+this.hireYear
                +"\n"+"Vergi : "+this.tax()+"\n"+"Bonus : "+this.bonus()+"\n"+"Maaş Artışı : "+this.raiseSalary()+"\n"+"Vergi ve Bonuslar ile birlikte Maaş : " + (this.salary- this.tax()+ this.bonus())
                +"\n"+"Toplam Maaş : "+(this.salary-this.tax()+ this.bonus()+ this.raiseSalary())+"\n"+"\n"+"This Method ";
    }
}

