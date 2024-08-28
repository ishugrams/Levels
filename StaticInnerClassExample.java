class OuterClass {
    static class InnerClass {
        void show() {
            System.out.println("Inside the static inner class method.");
        }
    }
    
    void display() {
        System.out.println("Inside the outer class method.");
    }
}

public class StaticInnerClassExample {
    public static void main(String[] args) {
        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        
        inner.show();
        
        OuterClass outer = new OuterClass();
        
        outer.display();
        
    }
}
