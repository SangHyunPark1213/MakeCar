package 배열실습문제;

import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int py[] = new int[3];
        int hinum;

        for (int i = 0; i < py.length; i++)
        {
            py[i] = sc.nextInt();
        }

        if (py[0] > py[1] && py[0] > py[2])
        {
            hinum = py[0];
            if (hinum * hinum == (py[1] * py[1]) + (py[2] * py[2]))
            {
                System.out.println("right");
            }
            else System.out.println("wrong");
        }

        else if (py[1] > py[0] && py[1] > py[2]) hinum = py[1];
        else hinum = py[2];

    }
}
