public class Delivery {
       long over;
       long ball;
       long runs;
       String batsman;
       String bowler;
       String nonStriker;
       public long getOver() {
              return over;
       }

       public void setOver(long over) {
              this.over = over;
       }

       public long getBall() {
              return ball;
       }

       public void setBall(long ball) {
              this.ball = ball;
       }

       public long getRuns() {
              return runs;
       }

       public void setRuns(long runs) {
              this.runs = runs;
       }

       public String getBatsman() {
              return batsman;
       }

       public void setBatsman(String batsman) {
              this.batsman = batsman;
       }

       public String getBowler() {
              return bowler;
       }

       public void setBowler(String bowler) {
              this.bowler = bowler;
       }

       public String getNonStriker() {
              return nonStriker;
       }

       public void setNonStriker(String nonStriker) {
              this.nonStriker = nonStriker;
       }

       
       
       public Delivery(long o, long b, long r, String batsman,
                     String bowler, String nonStriker) {
           super();
              this.over = o;
              this.ball = b;
              this.runs = r;
              this.batsman = batsman;
              this.bowler = bowler;
              this.nonStriker = nonStriker;
       }

       public Delivery() {

              
       }

       public void displayDeliveryDetails()
       {
              System.out.println("Over : "+over+"\nBall : "+ball+"\nRuns : "+runs+"\nBatsman : "+batsman+"\nBowler : "+bowler+"\nNonStriker : "+nonStriker);
       }

       
}
