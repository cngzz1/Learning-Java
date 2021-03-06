package UdemyJavaProgrammingMasterclass.Section6_ClassesConstructorsInheritance.ComplexOperations;

public class ComplexNumber {
        private double real;
        private double imaginary;

        public ComplexNumber(double r, double i){
            this.real = r;
            this.imaginary = i;
        }

        public double getReal(){
            return this.real;
        }

        public double getImaginary(){
            return this.imaginary;
        }

        public void add(double r, double i){
            this.real += r;
            this.imaginary += i;
        }

        public void add(ComplexNumber complexNumber){
            this.real += complexNumber.getReal();
            this.imaginary += complexNumber.getImaginary();
        }

        public void subtract(double r, double i){
            this.real -= r;
            this.imaginary -= i;
        }

        public void subtract(ComplexNumber complexNumber) {
            this.real -= complexNumber.getReal();
            this.imaginary -= complexNumber.getImaginary();
        }
}
