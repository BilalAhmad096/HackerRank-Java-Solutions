public class GenericClass <T> {
    private T x;
    public GenericClass(T t){
        x=t;
    }
    public void printData(){
        System.out.println(x);
    }
}

class GenericClassTest{
    public static void main(String args[]){
        GenericClass<String> a=new GenericClass<String>("JAVA");
        a.printData();
        
    }
}