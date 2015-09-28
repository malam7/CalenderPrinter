public class CalendarPrinter
    {
        public static void main (String[] args) {
        String month = "September ";
        int date = 0;
        while ( date < 30)  {
            date++;
            if (date == 5 || date == 6 || date == 12 || date ==13 || date == 19 || date == 20 || date == 26 || date == 27) 
            {
            System.out.println(month + date + " - WEEKEND");
            }
                else if (date == 25) 
                {
                System.out.println(month + date + " - End of marking period");
                }
        
                    else if (date == 7) 
                    {
                    System.out.println(month + date + " - NO SCHOOL (LABOR DAY)");
                    }
        
                        else 
                        {
                        System.out.println (month + date);
                        }
            }
        } 
     
    }    