import java.util.Scanner;


public class Drawer
{
        int[] clothes;


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
            scan.close();
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
                scan.close();
            }
        }
        void showClothes(Drawer d)
        {
            for(int i = 0; i < 5; i++)
            {
                switch(i)
                {
                    case 0:
                        System.out.println("You have "+ d.clothes[i] + " socks in your drawer");
                    break;
                    case 1:
                        System.out.println("You have "+ d.clothes[i] + " jackets in your drawer");
                        break;
                    case 2:
                        System.out.println("You have "+ d.clothes[i] + " shirts in your drawer");
                        break;
                    case 3:
                        System.out.println("You have "+ d.clothes[i] + " trousers in your drawer");
                        break;
                    case 4:
                        System.out.println("You have "+ d.clothes[i] + " panties in your drawer");
                    break;
                    default:
                    break;
                }
            }
        }
    



    public void main(String[] args)
    {
        Drawer d = new Drawer(); // NOT DONE YET
    }
}