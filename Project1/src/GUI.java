import javax.swing.JOptionPane;

public class GUI {

	public static void main(String[] args) {
		int x =Integer.parseInt(JOptionPane.showInputDialog("introduzca su lado x"));
		JOptionPane.showConfirmDialog(null, "Su lado x es " + x + " ?");
		int y = Integer.parseInt(JOptionPane.showInputDialog("introduzca su lado y"));
		JOptionPane.showConfirmDialog(null,  "Su lado y es " + y + " ?");
		double z = Math.sqrt((x * x) + (y * y));
        JOptionPane.showMessageDialog(null, "Su hipotenusa es " + z );

	}

}
