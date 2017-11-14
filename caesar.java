import java.util.Scanner;
import java.lang.*;

public class caesar
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        String fjalia;
        char[] encrypt;

        do
        {
            // Pyete user-in per te japur nje fjali
            System.out.print("Jepe nje fjali: ");
            // Merre fjalen nga user-i
            fjalia = cin.nextLine();
            // Vendose ne nje liste te karaktereve fjaline e user-it
            encrypt = fjalia.toCharArray();
        } while (encrypt.length == 0);

        // Deklaroje numrin per sa te shtyhet teksti
        int key;

        // Pyete user-in per numrin me te madh se 0
        do
        {
            // Pyete user-in per sa te shtyhet fjalia
            System.out.print("Per sa deshiron te shtyhet fjalia: ");
            // Merre vleren e dhene nga user-i
            key = cin.nextInt();
        } while (key < 0);

        // Alfabeti i ka 26 shkronja dhe nese user-i e jep numrin me te madh
        // se 26 atehere te kthehet mbetja e tij
        key %= 26;

        System.out.print("Fjalia juaj e enkriptuar eshte: ");

        // Perderisa te nuk jemi ne fund te tekstit
        for(int i = 0; i < encrypt.length; i++)
        {
            // Nese karakteri nuk eshte shkronje
            if(!Character.isLetter(encrypt[i]))
                // Te printohet karakteri
                System.out.print(encrypt[i]);
            else // Ndryshe karakteri eshte shkronje
            // Nese shkronja eshte e madhe
            if(Character.isUpperCase(encrypt[i]))
                // dhe shkronja e fituar eshte me e madhe se Z
                if(encrypt[i] + key > 'Z')
                    // Te printohet shkronja nga fillimi
                    System.out.print((char) ('A' + (encrypt[i] + key) % 'Z' - 1));
                else
                    // Ndryshe te printohet shkronja e fituar
                    System.out.print((char) (encrypt[i] + key));
            else // Ndryshe shkronja eshte e vogel
                // Nese shkronja e fituar eshte me e madhe se z
                if(encrypt[i] + key > 'z')
                    // Te printohet shkronja nga fillimi
                    System.out.print((char) ('a' + (encrypt[i] + key) % 'z' - 1));
                else
                    // Ndryshe te printohet shkronja e fituar
                    System.out.print((char) (encrypt[i] + key));
        }

        // Shtoji nje kryerresht ne fund
        System.out.print('\n');
    }
}
