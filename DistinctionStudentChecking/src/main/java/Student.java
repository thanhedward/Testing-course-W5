enum output {
            Distinction,
            NotDistinction,
            InvalidInput
}

public class Student {
    int drl;
    double gpa;

    public Student() {
    }

    public Student(int drl, double gpa) {
        if (drl < 0) {
            throw new IllegalArgumentException("drl must be greater 0");
        }
        this.drl = drl;
        this.gpa = gpa;
    }

    public int getDrl() {
        return drl;
    }

    public void setDrl(int drl) {
        this.drl = drl;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public output checkDistinction() {
        if (this.drl > 100) {
            return output.InvalidInput;
        }
        if (this.gpa > 4.0) {
            return output.InvalidInput;
        }
        if (this.gpa < 0) {
            return output.InvalidInput;
        }
        if (this.gpa >= 3.2 && this.drl >= 80) {
            return output.Distinction;
        }
        return output.NotDistinction;
    }
}
