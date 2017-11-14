import java.lang.*;
import java.util.Scanner;

public class vigenere
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        String fjalia;
        char[] chiper;

        // Mundohu ta marresh nje fjali nga user-i
        do
        {
            System.out.print("Jepe nje fjali: ");
            fjalia = cin.nextLine();
            chiper = fjalia.toCharArray();
        } while (chiper.length == 0);

        String key;
        char[] password;

        // Mundohu te marresh nje password nga user-i
        do
        {
            System.out.print("Password: ");
            key = cin.nextLine();
            password = key.toCharArray();
        } while (password.length == 0);

        System.out.print("Rezultati: ");
        int index = 0;
        int passSiNumer;

        // Per qdo shkronje te fjalise
        for (int i = 0; i < chiper.length; i++)
        {
            // Nese shkronja nuk eshte karakter
            // Le te printohet karakteri
            if (!Character.isLetter(chiper[i]))
            {
                System.out.print(chiper[i]);
                continue;
            }

            // Te merret vlera per t'iu shtuar shkronjes
            if(!Character.isLetter(password[index]))
                passSiNumer = password[index] % 48;
            else if(Character.isUpperCase(password[index]))
                passSiNumer = password[index] % 'A';
            else
                passSiNumer = password[index] % 'a';

            // Te printohet shkronja e enkoduar
            if (Character.isUpperCase(chiper[i]))
                if(chiper[i] + passSiNumer > 'Z')
                    System.out.print((char) ('A' + (chiper[i] + passSiNumer) % 'Z' - 1));
                else
                    System.out.print((char) (chiper[i] + passSiNumer));
            else
                if(chiper[i] + passSiNumer > 'z')
                    System.out.print((char) ('a' + (chiper[i] + passSiNumer) % 'z' - 1));
                else
                    System.out.print((char) (chiper[i] + passSiNumer));

            // Nese nuk ka mbaruar passwordi atehere te vazhdohet ndryshe
            // Te kthehet nga fillimi
            if(index == password.length - 1)
                index = 0;
            else
                index++;
        }

        // Dil ne kryerresht
        System.out.print('\n');
    }
}
