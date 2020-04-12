import com.atguigu.test06.bean.Rectangle;

public class Test07 {
    public static void main(String[] args) {
        Rectangle[] arr  = new Rectangle[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = new Rectangle();
            double d1 = Math.random()*9+1;
            double d2 = Math.random()*9+1;
            arr[i].setLigth(d1>d2?d1:d2);
            arr[i].setWidth(d1<=d2?d1:d2);
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].getInfo());
        }
        System.out.println("------------------------");
        for(int i=1; i<arr.length; i++){
            for(int j=0; j<arr.length-i; j++){
                if(arr[j].getArea() > arr[j+1].getArea()){
                    Rectangle temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].getInfo());
        }
    }
}

