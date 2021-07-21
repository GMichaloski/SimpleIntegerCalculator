import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal implements ActionListener {
    Integer num, result, temp = 0;
    boolean sum, sub, mul, div;
    static JFrame appFrame = new JFrame();
    static JTextField textField = new JTextField(16);

    private static void draw() {
        int sWidth = 50, sHeight = 40, dX = 135, dY = 300;
        textField.setEditable(false);

        // Numbers
        JButton bZero = new JButton("0");JButton bOne = new JButton("1");
        JButton bTwo = new JButton("2");JButton bThree = new JButton("3");
        JButton bFour = new JButton("4");JButton bFive = new JButton("5");
        JButton bSix = new JButton("6");JButton bSeven = new JButton("7");
        JButton bEight = new JButton("8");JButton bNine = new JButton("9");

        // Operators
        JButton bCls = new JButton("C");JButton bSum = new JButton("+");
        JButton bSub = new JButton("-");JButton bMulti = new JButton("*");
        JButton bDivision = new JButton("/");JButton bEqual = new JButton("=");

        // First line
        bCls.setBounds(dX - sWidth - 1, dY, sWidth, sHeight);appFrame.add(bCls);
        bZero.setBounds(dX, dY, sWidth, sHeight);appFrame.add(bZero);
        bEqual.setBounds(dX + sWidth + 1, dY, sWidth, sHeight);appFrame.add(bEqual);
        bDivision.setBounds(dX + 2 * (sWidth + 1), dY, sWidth, sHeight);appFrame.add(bDivision);

        // Second line
        bOne.setBounds(dX - sWidth - 1, dY - sHeight - 1, sWidth, sHeight);appFrame.add(bOne);
        bTwo.setBounds(dX, dY - sHeight - 1, sWidth, sHeight);appFrame.add(bTwo);
        bThree.setBounds(dX + sWidth + 1, dY - sHeight - 1, sWidth, sHeight);appFrame.add(bThree);
        bMulti.setBounds(dX + 2 * (sWidth + 1), dY - sHeight - 1, sWidth, sHeight);appFrame.add(bMulti);

        // Third line
        bFour.setBounds(dX - sWidth - 1, dY - 2 * sHeight - 2, sWidth, sHeight);appFrame.add(bFour);
        bFive.setBounds(dX, dY - 2 * sHeight - 2, sWidth, sHeight);appFrame.add(bFive);
        bSix.setBounds(dX + sWidth + 1, dY - 2 * sHeight - 2, sWidth, sHeight);appFrame.add(bSix);
        bSub.setBounds(dX + 2 * (sWidth + 1), dY - 2 * sHeight - 2, sWidth, sHeight);appFrame.add(bSub);

        // Fourth line
        bSeven.setBounds(dX - sWidth - 1, dY - 3 * sHeight - 3, sWidth, sHeight);appFrame.add(bSeven);
        bEight.setBounds(dX, dY - 3 * sHeight - 3, sWidth, sHeight);appFrame.add(bEight);
        bNine.setBounds(dX + sWidth + 1, dY - 3 * sHeight - 3, sWidth, sHeight);appFrame.add(bNine);
        bSum.setBounds(dX + 2 * (sWidth + 1), dY - 3 * sHeight - 3, sWidth, sHeight);appFrame.add(bSum);

        // Text box
        textField.setBounds(dX, dY - 4 * sHeight - 4, sWidth * 3, sHeight);
        appFrame.add(textField);
        textField.setText("0");

        //Setting the buttons:
        //
        ActionListener actionListener = new Principal();
        // Number buttons
        bZero.setActionCommand("bZero");bZero.addActionListener(actionListener);
        bOne.setActionCommand("bOne");bOne.addActionListener(actionListener);
        bTwo.setActionCommand("bTwo");bTwo.addActionListener(actionListener);
        bThree.setActionCommand("bThree");bThree.addActionListener(actionListener);
        bFour.setActionCommand("bFour");bFour.addActionListener(actionListener);
        bFive.setActionCommand("bFive");bFive.addActionListener(actionListener);
        bSix.setActionCommand("bSix");bSix.addActionListener(actionListener);
        bSeven.setActionCommand("bSeven");bSeven.addActionListener(actionListener);
        bEight.setActionCommand("bEight");bEight.addActionListener(actionListener);
        bNine.setActionCommand("bNine");bNine.addActionListener(actionListener);

        //Special buttons
        bCls.setActionCommand("bCls");bCls.addActionListener(actionListener);
        bSum.setActionCommand("bSum");bSum.addActionListener(actionListener);
        bSub.setActionCommand("bSubtraction");bSub.addActionListener(actionListener);
        bMulti.setActionCommand("bMultiplication");bMulti.addActionListener(actionListener);
        bDivision.setActionCommand("bDivision");bDivision.addActionListener(actionListener);
        bEqual.setActionCommand("bEqual");bEqual.addActionListener(actionListener);

        //Drawing the frame
        appFrame.setSize(400, 500);//400 width and 500 height
        appFrame.setLayout(null);//using no layout managers
        appFrame.setVisible(true);//making the frame visible
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        //Verifying which button has been pressed and doing something
        //based on it
        switch (e.getActionCommand()) {
            case "bCls":
                temp = 0;
                break;
            case "bZero":
                temp = temp * 10;
                break;
            case "bOne":
                temp = temp * 10 + 1;
                break;
            case "bTwo":
                temp = temp * 10 + 2;
                break;
            case "bThree":
                temp = temp * 10 + 3;
                break;
            case "bFour":
                temp = temp * 10 + 4;
                break;
            case "bFive":
                temp = temp * 10 + 5;
                break;
            case "bSix":
                temp = temp * 10 + 6;
                break;
            case "bSeven":
                temp = temp * 10 + 7;
                break;
            case "bEight":
                temp = temp * 10 + 8;
                break;
            case "bNine":
                temp = temp * 10 + 9;
                break;
            case "bSum":
                if(temp != 0){num = temp;}
                temp = 0;
                sum = true;sub = false;
                mul = false;div = false;
                break;
            case "bSubtraction":
                if(temp != 0){num = temp;}
                if(temp != 0){num = temp;}
                temp = 0;
                sum = false;sub = true;
                mul = false;div = false;
                break;
            case "bMultiplication":
                if(temp != 0){num = temp;}
                temp = 0;
                sum = false;sub = false;
                mul = true;div = false;
                break;
            case "bDivision":
                if(temp != 0){num = temp;}
                temp = 0;
                sum = false;sub = false;
                mul = false;div = true;
                break;
            case "bEqual":
                if (sum) {
                    result = num + temp;
                    sum = false;
                }
                else if (sub){
                    result = num - temp;
                    sub = false;
                }
                else if (mul){
                    result = num * temp;
                    mul = false;
                }
                else if (div){
                    result = num / temp;
                    div = false;
                }
                temp = result;
                break;

        }
        textField.setText(Integer.toString(temp));
    }

    public static void main(String[] args) {
        draw();
    }
}
