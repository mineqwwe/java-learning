package day16.src.com.pintu.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.Random;

public class GameJFrame extends JFrame {

    int[] icons = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    // 白框位置
    int x = 0;
    int y = 0;

    // 二维数组
    int[][] XYPosition = new int[4][4];

    //图片位置
    String path = "day16\\image\\animal\\animal3\\";

    public GameJFrame() {
        //初始化窗口
        initJFrame();

        // 初始化键盘监听
        initKeyListener();

        //初始化菜单栏
        initJMenu();

        //打乱图片数据
        initData();

        //初始化图片
        initImage();

        this.setVisible(true);
    }

    private void initData() {
        // 打乱图片
        Random r = new Random();
        for (int i = 0; i < icons.length; i++) {
            int tmp = icons[i];
            int index = r.nextInt(icons.length);

            icons[i] = icons[index];
            icons[index] = tmp;
        }

        int index = 0;
        //存入二维数组
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                XYPosition[i][j] = icons[index];
                if (icons[index] == 0) {
                    x = i;
                    y = j;
                }
                index++;
            }
        }

        System.out.println(Arrays.deepToString(XYPosition));
        System.out.println(x + " " + y);
    }


    private void initImage() {
        // 移除已经添加的图片
        this.getContentPane().removeAll();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JLabel jLabel = new JLabel(new ImageIcon(path + XYPosition[j][i] + ".jpg"));
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                this.getContentPane().add(jLabel);
            }
        }
        //后添加的在下
        JLabel bg = new JLabel(new ImageIcon("day16/image/background.png"));
        bg.setBounds(40, 40, 508, 560);
        this.getContentPane().add(bg);

        //重新绘制
        this.getContentPane().repaint();
    }


    private void initJFrame() {
        this.setSize(603, 680);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("拼图游戏");

        this.setLayout(null);
    }

    private void initKeyListener() {
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //NONE

            }

            @Override
            public void keyPressed(KeyEvent e) {

                // 查看完整图片
                if (e.getKeyCode() == KeyEvent.VK_A) {
                    // 移除已经添加的图片
                    getContentPane().removeAll();

                    // all
                    JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
                    all.setBounds(83, 134, 420, 420);
                    getContentPane().add(all);

                    // 背景
                    JLabel bg = new JLabel(new ImageIcon("day16/image/background.png"));
                    bg.setBounds(40, 40, 508, 560);
                    getContentPane().add(bg);

                    getContentPane().repaint();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT -> {
                        if (x - 1 < 0) {
                            break;
                        }
                        XYPosition[x][y] = XYPosition[x - 1][y];
                        XYPosition[x - 1][y] = 0;

                        x = x - 1;
                        initImage();
                    }
                    case KeyEvent.VK_UP -> {
                        if (y - 1 < 0) {
                            break;
                        }
                        XYPosition[x][y] = XYPosition[x][y - 1];
                        XYPosition[x][y - 1] = 0;

                        y = y - 1;
                        initImage();
                    }
                    case KeyEvent.VK_RIGHT -> {
                        if (x + 1 > 3) {
                            break;
                        }
                        XYPosition[x][y] = XYPosition[x + 1][y];
                        XYPosition[x + 1][y] = 0;

                        x = x + 1;
                        initImage();
                    }
                    case KeyEvent.VK_DOWN -> {
                        if (y + 1 > 3) {
                            break;
                        }
                        XYPosition[x][y] = XYPosition[x][y + 1];
                        XYPosition[x][y + 1] = 0;

                        y = y + 1;
                        initImage();
                    }
                    case KeyEvent.VK_A -> {
                        initImage();
                    }
                    default -> {

                    }
                }

            }
        });

    }

    private void initJMenu() {
        JMenuBar jMenuBar = new JMenuBar();

        JMenu functionMenu = new JMenu("功能");
        JMenu aboutUsMenu = new JMenu("关于我们");

        JMenuItem replayMenuItem = new JMenuItem("重新游戏");
        JMenuItem reLoginMenuItem = new JMenuItem("重新登录");
        JMenuItem closeMenuItem = new JMenuItem("关闭游戏");

        JMenuItem accountMenuItem = new JMenuItem("公众号");

        //JMenuItem->JMenu
        functionMenu.add(replayMenuItem);
        functionMenu.add(reLoginMenuItem);
        functionMenu.add(closeMenuItem);

        aboutUsMenu.add(accountMenuItem);

        //JMenu->jMenuBar
        jMenuBar.add(functionMenu);
        jMenuBar.add(aboutUsMenu);

        //jMenuBar->JFrame
        this.setJMenuBar(jMenuBar);
    }


}
