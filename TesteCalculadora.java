public class TesteCalculadora {
    
    public static void main(String args[]){

        MinhaCalculadora calculadora=new MinhaCalculadora();
        
        System.out.println(calculadora.soma(2, 3));
        System.out.println(calculadora.soma(1, 2, 3));
        System.out.println(calculadora.soma(1.1, 2.1));
        
        
        int vetor[]={1,2,3,4,5};
        System.out.println(calculadora.soma(vetor));
        //ufa
        //o nome do método em todos é "soma", porém com parametros diferentes


    }
}
