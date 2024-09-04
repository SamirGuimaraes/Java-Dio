package Debugar;

public class debbugin {
    
    public static void main(String[] args) {
        System.out.println("Inciando programa no método main");
        a();
        System.out.println("Final do programa no método main");
    }

    public static void a() {
        System.out.println("Entrou no método a");
        b();
        System.out.println("Finalizou o método a");        
    }

    public static void b(){
        System.out.println("Entrou no método b");
        c();
        System.out.println("Finalizou o método b");
    }

    public static void c(){
        System.out.println("Entrou no método c");
        //Thread.dumStack();
        System.out.println("Finalizou o método c");
    }

}
