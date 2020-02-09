import org.junit.jupiter.api.Test;
public class HomeWorkPlane {
    @Test
    public void HomeWorkPlane(){
     //   double a = 3.57;
       // int b = 20;
       // int c = 5000;
      //  System.out.println( c / 100  * b * a );
        Ticket2(3.57, 20, 5000);
    }
private void Ticket2 (double a, int b, int c ){
        double f = c / 100  *b  * a;
    System.out.println( f  +  " Stoljko topliva ushlo na rasstojnie 5000 killometrov");
}
}
