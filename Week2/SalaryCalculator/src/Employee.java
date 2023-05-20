public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //Maaşa uygulanan vergiyi hesaplayacaktır.
    //Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
    //Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
    private double tax(){
        double taxAmount = 0;
        if (this.salary > 1000){
            taxAmount = this.salary * 0.03;
        }
        return taxAmount;
    }

    //Eğer çalışan haftada 40 saatten fazla çalışmış ise
    //fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
    private double bonus(){
        int overtimePay = 0;
        if (this.workHours > 40){
            overtimePay = (this.workHours - 40) * 30;
            return overtimePay;
        }
        return overtimePay;
    }

    //Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
    //Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
    //Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
    //Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
    private double  raiseSalary(){
        int totalYear =  2021 - this.hireYear;

        if (totalYear > 0 && totalYear < 10){
            return this.salary * 0.05;
        }
        else if (totalYear > 9 && totalYear < 20) {
            return this.salary * 0.1;
        }
        else {
            return this.salary * 0.15;
        }
    }

    //Çalışana ait bilgileri ekrana bastıracaktır.
    //Adı : kemal
    //Maaşı : 2000.0
    //Çalışma Saati : 45
    //Başlangıç Yılı : 1985
    //Vergi : 60.0
    //Bonus : 150.0
    //Maaş Artışı : 300.0
    //Vergi ve Bonuslar ile birlikte maaş : 2090.0
    //Toplam Maaş : 2300.0
    public void information(){
        String info =
                "Adı : " + this.name + "\n" +
                "Maaşı : " + this.salary + "\n" +
                "Çalışma Saati : " + this.workHours + "\n" +
                "Başlangıç Yılı : " + this.hireYear + "\n" +
                "Vergi : " + this.tax() + "\n" +
                "Bonus : " + this.bonus() + "\n" +
                "Maaş Artışı : " + this.raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + this.bonus() - this.tax()) + "\n" +
                "Toplam Maaş : " + (this.salary + this.raiseSalary()) + "\n" ;

        System.out.println(info);
    }
}
