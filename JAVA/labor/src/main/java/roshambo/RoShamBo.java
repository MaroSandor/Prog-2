/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package roshambo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author marosandor
 */
public class RoShamBo {
    public static void ko_papir_ollo() {
        String player1;
        String player2;

        Scanner sc = new Scanner(System.in);

        int score1=0;
        int score2=0;

        while(!(player1=sc.nextLine()).equals("vege"))
        {
            Random rnd = new  Random();
            int p2 = rnd.nextInt(3);

            // switch (p2)
            // {
            //     case 0:
            //         player2 = "ko";
            //         break;
            //     case 1:
            //         player2 = "papir";
            //         break;
            //     case 2:
            //         player2 = "ollo";
            //     break;
            // }

            if (p2==0)
            {
                player2 = "ko";
            }
            else if (p2 == 1)
            {
                player2 = "papir";
            }
            else
            {
                player2 = "ollo";
            }

            System.out.println("A gep valasza: " + player2);

            if (player1.equals("ko") && player2.equals("papir"))
            {
                score2++;
            }
            else if (player1.equals("ko") && player2.equals("ollo"))
            {
                score1++;
            }

            if (player1.equals("papir") && player2.equals("ko"))
            {
                score1++;
            }
            else if (player1.equals("papir") && player2.equals("ollo"))
            {
                score2++;
            }

            if (player1.equals("ollo") && player2.equals("ko"))
            {
                score2++;
            }
            else if (player1.equals("ollo") && player2.equals("papir"))
            {
                score1++;
            }
        }   

        if (score1>score2)
        {
            System.out.println("A felhasznalo nyert");
        }
        else if(score2>score1)
        {
            System.out.println("A gep nyert");
        }
        else
        {
            System.out.println("dontetlen");
        }

        sc.close();
    }
    
    public static void main(String[] args) {
        ko_papir_ollo();
    }
}
