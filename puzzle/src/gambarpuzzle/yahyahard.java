/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gambarpuzzle;

/**
 *
 * @author user
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.lang.model.SourceVersion;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


class MyButton extends JButton {

    private boolean isLastButton;

    public MyButton() {

        super();

        initUI();
    }

    public MyButton(Image image) {

        super(new ImageIcon(image));

        initUI();
    }

    private void initUI() {

        isLastButton = false;
        BorderFactory.createLineBorder(Color.gray);

        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.yellow));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBorder(BorderFactory.createLineBorder(Color.gray));
            }
        });
    }

    public void setLastButton() {
        
        isLastButton = true;
    }

    public boolean isLastButton() {

        return isLastButton;
    }
}

public class yahyahard extends JFrame{

    private JPanel panel;
    private BufferedImage source;
    private BufferedImage resized;    
    private Image image;
    private MyButton lastButton;
    private int width, height;    
    
    private List<MyButton> buttons;
    private List<Point> solution;

    private final int NUMBER_OF_BUTTONS = 64;
    private final int DESIRED_WIDTH = 800;

    public yahyahard() {

        initUI();
    }

    private void initUI() {

        solution = new ArrayList<>();
        
        solution.add(new Point(0, 0));
        solution.add(new Point(0, 1));
        solution.add(new Point(0, 2));
        solution.add(new Point(0, 3));
        solution.add(new Point(0, 4));
        solution.add(new Point(0, 5));
        solution.add(new Point(0, 6));
        solution.add(new Point(0, 7));
        solution.add(new Point(1, 0));
        solution.add(new Point(1, 1));
        solution.add(new Point(1, 2));
        solution.add(new Point(1, 3));
        solution.add(new Point(1, 4));
        solution.add(new Point(1, 5));
        solution.add(new Point(1, 6));
        solution.add(new Point(1, 7));
        solution.add(new Point(2, 0));
        solution.add(new Point(2, 1));
        solution.add(new Point(2, 2));
        solution.add(new Point(2, 3));
        solution.add(new Point(2, 4));
        solution.add(new Point(2, 5));
        solution.add(new Point(2, 6));
        solution.add(new Point(2, 7));
        solution.add(new Point(3, 0));
        solution.add(new Point(3, 1));
        solution.add(new Point(3, 2));
        solution.add(new Point(3, 3));
        solution.add(new Point(3, 4));
        solution.add(new Point(3, 5));
        solution.add(new Point(3, 6));
        solution.add(new Point(3, 7));
        solution.add(new Point(4, 0));
        solution.add(new Point(4, 1));
        solution.add(new Point(4, 2));
        solution.add(new Point(4, 3));
        solution.add(new Point(4, 4));
        solution.add(new Point(4, 5));
        solution.add(new Point(4, 6));
        solution.add(new Point(4, 7));
        solution.add(new Point(5, 0));
        solution.add(new Point(5, 1));
        solution.add(new Point(5, 2));
        solution.add(new Point(5, 3));
        solution.add(new Point(5, 4));
        solution.add(new Point(5, 5));
        solution.add(new Point(5, 6));
        solution.add(new Point(5, 7));
        solution.add(new Point(6, 0));
        solution.add(new Point(6, 1));
        solution.add(new Point(6, 2));
        solution.add(new Point(6, 3));
        solution.add(new Point(6, 4));
        solution.add(new Point(6, 5));
        solution.add(new Point(6, 6));
        solution.add(new Point(6, 7));
        solution.add(new Point(7, 0));
        solution.add(new Point(7, 1));
        solution.add(new Point(7, 2));
        solution.add(new Point(7, 3));
        solution.add(new Point(7, 4));
        solution.add(new Point(7, 5));
        solution.add(new Point(7, 6));
        solution.add(new Point(7, 7));
        
        buttons = new ArrayList<>();

        panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(Color.gray));
        panel.setLayout(new GridLayout(8, 8, 0, 0));

        try {
            source = loadImage();
            int h = getNewHeight(source.getWidth(), source.getHeight());
            resized = resizeImage(source, DESIRED_WIDTH, h,
                    BufferedImage.TYPE_INT_ARGB);

        } catch (IOException ex) {
            Logger.getLogger(yahyahard.class.getName()).log(
                    Level.SEVERE, null, ex);
        }

        width = resized.getWidth(null);
        height = resized.getHeight(null);

        add(panel, BorderLayout.CENTER);

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {

                image = createImage(new FilteredImageSource(resized.getSource(),
                        new CropImageFilter(j * width / 8, i * height / 8,
                                (width / 8), height / 8)));
                
                MyButton button = new MyButton(image);
                button.putClientProperty("position", new Point(i, j));

                if (i == 7 && j == 7) {
                    lastButton = new MyButton();
                    lastButton.setBorderPainted(false);
                    lastButton.setContentAreaFilled(false);
                    lastButton.setLastButton();
                    lastButton.putClientProperty("position", new Point(i, j));
                } else {
                    buttons.add(button);
                }
            }
        }

        Collections.shuffle(buttons);
        buttons.add(lastButton);

        for (int i = 0; i < NUMBER_OF_BUTTONS; i++) {

            MyButton btn = buttons.get(i);
            panel.add(btn);
            btn.setBorder(BorderFactory.createLineBorder(Color.gray));
            btn.addActionListener(new ClickAction());
        }

        pack();
        setTitle("Puzzle");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private int getNewHeight(int w, int h) {

        double ratio = DESIRED_WIDTH / (double) w;
        int newHeight = (int) (h * ratio);
        return newHeight;
    }

    private BufferedImage loadImage() throws IOException {

        BufferedImage bimg = ImageIO.read(new File("src/gambarpuzzle/mamangpuzzle.jpeg"));

        return bimg;
    }

    private BufferedImage resizeImage(BufferedImage originalImage, int width,
            int height, int type) throws IOException {

        BufferedImage resizedImage = new BufferedImage(width, height, type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, width, height, null);
        g.dispose();

        return resizedImage;
    }

    private class ClickAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {

            checkButton(e);
            checkSolution();
        }

        private void checkButton(ActionEvent e) {

            int lidx = 0;
            
            for (MyButton button : buttons) {
                if (button.isLastButton()) {
                    lidx = buttons.indexOf(button);
                }
            }

            JButton button = (JButton) e.getSource();
            int bidx = buttons.indexOf(button);

            if ((bidx - 1 == lidx) || (bidx + 1 == lidx)
                    || (bidx - 8 == lidx) || (bidx + 8 == lidx)) {
                Collections.swap(buttons, bidx, lidx);
                updateButtons();
            }
        }

        private void updateButtons() {

            panel.removeAll();

            for (JComponent btn : buttons) {

                panel.add(btn);
            }

            panel.validate();
        }
    }

    private void checkSolution() {

        List<Point> current = new ArrayList<>();

        for (JComponent btn : buttons) {
            current.add((Point) btn.getClientProperty("position"));
        }

        if (compareList(solution, current)) {
            JOptionPane.showMessageDialog(panel, "Finished",
                    "Congratulation", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static boolean compareList(List ls1, List ls2) {
        
        return ls1.toString().contentEquals(ls2.toString());
    }

    
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                yahyahard puzzle = new yahyahard();
                puzzle.setVisible(true);
            }
        });
    }

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
}

