public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int burn = 0;
        if (status.Altitude> 1000 && status.Altitude % 100 != 0) {
            burn = 100 - (status.Altitude % 100);
        }
        else if (status.Velocity > 100) {
            burn = 200;
        }
        else if (status.Velocity == 100 && status.Altitude >100) {
            burn = 100;
        }
        else if ( status.Velocity == 100 &&status.Altitude == 100) {
            burn = 150;
        }
        else if (status.Velocity == 50) {
            burn = 125;
        }
        else if (status.Velocity == 25) {
            burn = 120;
        }
        else if (status.Velocity == 5&& status.Altitude >5) {
            burn = 100;
        }
        else if (status.Altitude == 5) {
            burn = 103;
        }
        else if (status.Velocity == 2) {
            burn = 100;
        }



        System.out.println(burn); /*hack!*/
        return burn;
    }

}
