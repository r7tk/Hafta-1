public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addBulkVerbal(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.verbal = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.verbal = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.verbal = kimya;
        }

    }
    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (calcCourseAvarage(this.fizik.note, this.fizik.verbal ,this.fizik.verbalAvarageRatio ) + (calcCourseAvarage(this.kimya.note,this.kimya.verbal,this.kimya.verbalAvarageRatio))
                +calcCourseAvarage(this.mat.note,this.mat.verbal,this.mat.verbalAvarageRatio)) / 3;
    }
    public double calcCourseAvarage(int note,int verbal,int verbalAvarageRatio){
        return (verbal * verbalAvarageRatio /(double) 100)
                +(note * (100 - verbalAvarageRatio)/(double) 100)  ;

    }
    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Matematik Sözlü Notu : "+ this.mat.verbal);
        System.out.println("Fizik Sözlü Notu : "+ this.fizik.verbal);
        System.out.println("Kimya Sözlü Notu : "+ this.kimya.verbal);
    }

}
