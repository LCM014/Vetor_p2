import java.util.Random;;
public class Vetor 
{
    public static void main(String[] args) 
    {
        Random random = new Random();
        
        int numeros[] = {random.nextInt(100),random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)};

        for (int index = 0; index < numeros.length; index++) 
        {   
            
                System.out.println(numeros[index]);
        }


    }
}