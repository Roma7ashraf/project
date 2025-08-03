public Class Main {
    public static void main (String[] args)
    {
        String name ="Roma";
        int Age =19;
        String Film ="Action";
        int price_ticket=270;
        String card ="yes";
        if (Age >= 18){
            System.out.println("welcome,"+name+"you can attend the movie.");
            switch (card){
                case "yes":
                System.out.println("The price ticket before the discount is "+(price_ticket)+"\n price ticket after the discount is "+(price_ticket-120));
                break;
                case "no":
                System.out.println("The price ticket is"+price_ticket);
                break;
                default:
                System.out.println("other card.");

            }
            {System.out.println("welcome,"+name+"we hope you enjoy watching the movie.");}

        } 
        else{
            System.out.println("Sorry,my little one ,you cannot watch this movie.you ate still too young to handle the scary scenes.");
            System.out.println("you cannot watch this type of movies . you can view the movies that you or watch cartoon movies");
        }

    }
    
}