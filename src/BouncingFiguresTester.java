import javax.swing.JFrame;

public class BouncingFiguresTester {

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        JFrame frame= new JFrame();
        frame.setTitle("Mr Fresh Window");
        frame.setSize(600, 620);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a box to put all objects in
        BouncingBox box = new BouncingBox();
       
        // Add all the components to the box
        BouncingFigure figure1 = new BouncingRectangle(0, 10, 10, 10, 325.0, 100);
        box.add(figure1);
        BouncingFigure figure2 = new BouncingRectangle(0, 500, 10, 10, 45.0, 250);
        box.add(figure2);
        BouncingFigure figure3 = new BouncingRectangle(0, 310, 50, 50, 0, 25);
        box.add(figure3);
        BouncingFigure figure4 = new BouncingRectangle(550, 310, 50, 50, 180, 25);
        box.add(figure4);
        BouncingFigure figure5 = new BouncingRectangle(300, 610, 10, 10, 95, 250);
        box.add(figure5);
        BouncingFigure figurec1 = new BouncingCircle(0,10,10,10,50,200);
        box.add(figurec1);
        BouncingFigure figurec2 = new BouncingCircle(300, 40, 15, 15, 270, 300);
        box.add(figurec2);
        BouncingFigure figurec3 = new BouncingCircle(600, 30, 7, 7, 235, 350);
        box.add(figurec3);
       
        frame.add(box);
       
        // Make the frame visible
        frame.setVisible(true);
       
        // Continuously update the frame since some components will change position
        while(true) {
            try{
                Thread.sleep(100); // Wait for 0.1 second = 100 milliseconds
            }
            catch(InterruptedException e){}
           
            frame.repaint();
           
        } // end while

    }//end main

}//end class