public class robotmove {
    public static void main(String[] args) {
        {
            String moves="v<^>>";
            int x=0,y=0;

            for(int i=0;i<moves.length();i++)
            {
                char c=moves.charAt(i);
                switch(c)
                {
                    case '<':x--;
                            break;

                    case '>':x++;
                            break;

                    case 'v':y--;
                            break;
                    case '^':y++;
                            break;
                }
            }
            if(x==0 && y==0)
            {
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
}
