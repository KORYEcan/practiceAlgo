package dataStructure;

public class list {
    public static void main(String[] args) {
        //배열 생성과 동시에 초기화
        int[] numbers= new int[5];  //크기가 5인 정수형 배열 생성

        numbers[0]= 10;
        numbers[1]= 20;
        numbers[2]= 30;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        int length = numbers.length;
        System.out.println("배열의 길이:"+ length);


        //방법 1: 인덱스별로 값 할당
        int[] number= {10,20,30,40,50};

        //방법 2: new 키워드로 직접 할당
        int[] numberss= new int[]{10,20,30,40,50};

        //방법 3: 빈 배열 생성 후 인덱스별로 값 할당
        int[] numbersss= new int[5];

        numbersss[0]= 10;
        numbersss[1]= 20;
        numbersss[2]= 30;
        numbersss[3]= 40;
        numbersss[4]= 50;

        System.out.println("배열의 길이"+numbersss.length);

        for (int i= 0; i< numberss.length; i++)    {   // 길이 5  0,1,2,3,4
            System.out.println(numbersss[i]);
        }

        //향상된 for문
        for (int numberi:numbersss){
            System.out.println(numberi);
        }
    }

}
