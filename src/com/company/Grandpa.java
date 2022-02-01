package com.company;

    public class Grandpa {
        private String name;
        private int age;
        private Car car;
        private EHight hight;

        public Grandpa(String name, int age, Car car, EHight hight) {
            this.name = name;
            this.age = age;
            this.car = car;
            this.hight = hight;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Car getCar() {
            return car;
        }

        public EHight getHight() {
            return hight;
        }

        @Override
        public String toString() {
            return "Granpa{" +
                    "name:'" + name + '\'' +
                    ", age:" + age +
                    ", car=" + car +
                    ", hight=" + hight +
                    '}';
        }
    }