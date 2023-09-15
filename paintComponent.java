public void paintComponent(Graphics g)
{
super.paintComponent(g);
g.setColor(Color.Red);
g.fillOval((int) (x-radious), (int) (Y-radious), (int) diameter,(int).diameter);
}
public static void main(String[] args)
{
JFrame.setDefaultLookAndFeelDecorated(true);
JFrame frame=new JFrame("Bouncing Ball);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300,200);
frame.setContentPane(new Bouncing Ball());
frame.setVisible(true);
}