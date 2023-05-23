package day02.com.ict.edu;
class Ex05{
     public static void main(String[] args){

                int kor = 90;
                int eng = 80;
                int math = 80;

           //����
           //int sum = 90 + 80 + 80;
                int sum = kor + eng + math;
                 System.out.println(sum);

           //���
                double avg = (double)sum/3;
                 double avg2 = sum/3.0;

           //avg2�� �Ҽ��� 2�ڸ����� ���ϱ�
                double avg3 = (int)(avg2*100);
                double avg4 = (int)(avg2*100)/100.0;

                 System.out.println(avg);
                 System.out.println(avg2);
                 System.out.println(avg3);
                 System.out.println(avg4);


          // 1475�� ������ �����ؼ� 1470���� ����� ���
                int a = 1475;
                int b = (int)(a/10)*10;
                System.out.println(b);
    }
}