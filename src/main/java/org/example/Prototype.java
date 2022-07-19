package org.example;

public class Prototype {
    public static void main(String[] args){
        Cash cash = new Cash();
        C
    }
    class Student implements Cloneable {

        @Override
        protected Student clone() throws CloneNotSupportedException {
            return (Student) super.clone();
        }
    }
    class Cash {
        private Student student;
        public Student getStudent() throws CloneNotSupportedException{
            return student.clone();
        }
        public void setStudent(Student student){
            this.student = student;
        }
    }

}
