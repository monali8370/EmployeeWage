package com.bridgelabz.employeewage;

public class uc4_UsingSwitchCase {
    public static final int IS_PART_TIME=1,IS_FULL_TIME=2;
        public static final int EMP_RATE_PER_HOUR=20;
        public static void main(String[] args) {
            // Variables
            int empHrs=0,empWage=0;
            //Computation
            int empCheck=(int) Math.floor(Math.random()*10)%3;
            switch (empCheck){
                case IS_PART_TIME:
                    empHrs=4;
                    break;
                case IS_FULL_TIME:
                    empHrs=8;
                    break;
                default:
                    empHrs=0;
                    break;
            }
            empWage=empHrs*EMP_RATE_PER_HOUR;
            System.out.println("Emp wage: "+empWage);
        }
    }

