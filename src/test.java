/*
        class HelloA{
            public HelloA(){
                System.out.println("HelloA");//2
            }
            {
                System.out.println("I'm A Class");//1
            }
        }

        class HelloB extends HelloA{
            public HelloB(){
                System.out.println("HelloB");//4
            }
            {
                System.out.println("I'm B Class");//3
            }
        }*/
public class test {
    public static void main(String[] args) {
        new Child("mike");
    }
}

class People {
    private String name;

    public People() {
        System.out.print("1");//2
    }

    public People(String name) {
        System.out.print("2");
        this.name = name;//1
    }
}

class Child extends People {
    People father;

    public Child(String name) {
        System.out.print("3");
        father = new People(name + " F");//3
    }

    public Child() {
        System.out.print("4");//4
    }
}


