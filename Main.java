package com.company;

public class Main {

    public static void main(String[] args) {

        String carMake = "Ford";
        int doors = 4;

        switch (carMake){
            case "Ford":{
                switch(doors){
                    case 1:{
                        System.out.println("Ford 1");;
                    }break;
                    case 4:{
                        System.out.println("Ford 4");
                    }break;
                    default:{
                        System.out.println("Ne postoji Ford sa toliko vrata!");
                    }break;
                }
            }break;
            case "BMW" : {

            }break;
            default:{
                System.out.println("Unsupported carMake");

            }break;
        }


    }
}
