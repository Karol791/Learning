import java.util.Scanner;


public class Drawer
{
        int[] clothes = new int [5];


        public Drawer()
        {
            Scanner scan = new Scanner(System.in);
            for(int i = 0;i < 5; i++)
            {
                switch(i)
                {
                    case 0:
                        System.out.println("How much Socks do you want to add?");
                        int howMuchS = scan.nextInt();
                        clothes[i] = howMuchS;
                    break;
                    case 1:
                        System.out.println("How much jackets do you want to add?");
                        int howMuchJ = scan.nextInt();
                        clothes[i] = howMuchJ;
                        break;
                    case 2:
                        System.out.println("How much shirts do you want to add?");
                        int howMuchSh = scan.nextInt();
                        clothes[i] = howMuchSh;
                        break;
                    case 3:
                        System.out.println("How much trousers do you want to add?");
                        int howMuchT = scan.nextInt();
                        clothes[i] = howMuchT;
                        break;
                    case 4:
                        System.out.println("How much panties do you want to add?");
                        int howMuchP = scan.nextInt();
                        clothes[i] = howMuchP;
                    break;
                    default:
                    break;

                }
            }
            
            System.out.println("Clothes added!");
        }

        public void addClothes(Drawer drawer,int cloth, int howMuch)
        {
            String check = "y";
            while(check.equals("y"))
            {
                
                switch(cloth)
                {

                    case 1:
                        drawer.clothes[cloth] += howMuch;
                    break;
                    case 2:
                        drawer.clothes[cloth] += howMuch;
                    break;
                    case 3:
                        drawer.clothes[cloth] += howMuch;
                    break;
                    case 4:
                        drawer.clothes[cloth] += howMuch;
                    break;
                    case 5:
                        drawer.clothes[cloth] += howMuch;
                    break;
                    default:
                        System.out.println("You typed worng number!");
                    break;

                }
                System.out.println("If you want continue type 'y' and press Enter if you don't type 'n' and press Enter");
                Scanner scan = new Scanner(System.in);
                check = scan.nextLine();
                if(check.equals("y"))
                {
                System.out.println("Which cloth do you want to add?\n 1 - Socks \n 2 - jacket \n 3 - Shirt \n 4 - trousers \n 5 - pants");
                cloth = scan.nextInt();
                System.out.println("How much do you want to add?");
                howMuch = scan.nextInt();
                }else
                {
                    System.out.println("Clothes added!");
                }
                
            }
        }
        void showClothes(Drawer d)
        {
            String y  = "You have ";
            for(int i = 0; i < 5; i++)
            {
                switch(i)
                {
                    case 0:
                        System.out.println(y + d.clothes[i] + " socks in your drawer");
                    break;
                    case 1:
                        System.out.println(y+ d.clothes[i] + " jackets in your drawer");
                        break;
                    case 2:
                        System.out.println(y+ d.clothes[i] + " shirts in your drawer");
                        break;
                    case 3:
                        System.out.println(y+ d.clothes[i] + " trousers in your drawer");
                        break;
                    case 4:
                        System.out.println(y+ d.clothes[i] + " panties in your drawer");
                    break;
                    default:
                    break;
                }
            }
        }
    



    public static void main(String[] args)
    {
        Drawer d = new Drawer(); 
        d.showClothes(d);
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to add more clothes? Type 'y' if you do type 'n' if you don't.");
        String dou = scan.nextLine();
        if(dou.equals("y"))
        {
            System.out.println("Which cloth do you want to add?\n 1 - Socks \n 2 - jacket \n 3 - Shirt \n 4 - trousers \n 5 - pants");
            int cloth = scan.nextInt();
            System.out.println("How much do you want to add?");
            int howMuch = scan.nextInt();
            d.addClothes(d, cloth, howMuch);
        }
        scan.close();
    }
}