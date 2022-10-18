public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee(String name,double salary,int workHours,int hireYear)
    {
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
    public double tax()
    {
        if (salary<=0)
        {
            System.out.println("Hatali bir deger girdiniz vergi hesaplanamiyor.");
        }



        if(salary<=1000)
        {
            return salary;
        }
        else
        {
            double tax = salary*0.03;
            return tax;
        }

    }
    public double bonus()
    {
        if(workHours<=0){
            System.out.println("Hatali bir deger girdiniz bonus hesaplanamiyor.");
        }
        if(workHours>40)
        {
            int bonus=(workHours-40)*30;
            return bonus;
        }
        else return 0;
    }
    public double raiseSalary()
    {
        if(hireYear<0||hireYear==2021||hireYear==0){
            System.out.println("Hatali bir deger girdiniz, maas artisi hesaplanamiyor.");
        }
        else {



            int wYear=2021-hireYear;
            if(wYear<10)
            {
                double zam=(salary)*1.05;
                return zam-salary;
            }
            else if (wYear>9&wYear<20)
            {
                double zam=(salary)*1.1;
                return zam-salary;
            }
            else if (wYear>19)
            {
                double zam=(salary)*1.15;
                return zam-salary;
            }


            if(wYear<10)
            {
                double zam=(salary-tax()+bonus())*0.05;
                return zam;
            }
            else if (wYear>9&wYear<20)
            {
                double zam=(salary-tax()+bonus())*0.1;
                return zam;
            }
            else if (wYear>19)
            {
                double zam=(salary-tax()+bonus())*0.15;
                return zam;
            }
        }
        return 0;
    }

    public String toString()
    {
        double total=salary-tax()+bonus();
        double toplam=salary+raiseSalary()-tax()+bonus();
        System.out.println("Adi:"+name);
        System.out.println("Maas:"+salary);
        System.out.println("Calisma Saati:"+workHours);
        System.out.println("Baslangic Yili:"+hireYear);
        System.out.println("Vergi:"+tax()+" TL");
        System.out.println("Bonus:"+bonus()+" TL");
        System.out.println("Maas artisi:"+raiseSalary()+" TL");
        System.out.println("Vergi ve bonuslarla birlikte maas:"+total+" TL");
        System.out.println("Toplam maas:"+toplam+" TL");
        return null;
    }
}
