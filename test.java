
interface Animal {
    void makeSound();
}
public class test {
    public static void main(String[] args) {


        
        Dog.makeSound();


    } 
    final static Animal Dog = new Animal() {
        @Override
        public void makeSound() {
            System.out.println("汪汪汪！");    
        }
        };
}
