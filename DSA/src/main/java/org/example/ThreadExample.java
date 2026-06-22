package org.example;













class A1 extends Thread{

    @Override
    public void run() {

        while (true){
            System.out.println("In A1 Thread");
        }
    }
}



class A2 extends Thread{

    @Override
    public void run() {
        super.run();
        while (true){
            System.out.println("In A2 Thread");
        }
    }
}





class B{
    static void show(){
        for (int i=1;i<=5;i++){
            System.out.println("B");
        }
    }

}



public class ThreadExample {
    public static void main(String[] args) {



        A1 a1=new A1();
        A2 a2=new A2();
        a1.start();
        a2.start();



    }
}
