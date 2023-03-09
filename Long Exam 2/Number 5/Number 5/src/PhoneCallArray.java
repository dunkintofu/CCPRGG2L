public class PhoneCallArray {
    public static void main(String[] args) {
        String[] PhoneCallArray = {"09456723108", "09459120675", "09453286177", "09450863915", "09459409865",
                    "09062250745", "09066671577", "09068997738", "09064535489", "09067326135"};

                    for(int i = 0; i < PhoneCallArray.length; i++){
                        if(i <= 4){
                            
                            System.out.println(PhoneCallArray[i] + " - Incoming Phone Call," + " Price: 0.02");
                            System.out.println("================================================================");
                        }
                        else if(i <= 9 && i > 4){
                            System.out.println(PhoneCallArray[i] + " - Outgoing Phone Call" + " Price: 4.00 per minute");
                            System.out.println("================================================================");
                        }
                    }            
                }
            }

  
  
  