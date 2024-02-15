package day16.src.com.pintu.ui;

import javax.swing.*;
import java.util.Random;

public class GameJFrame extends JFrame {

    int[] icons = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

    public GameJFrame() {
        //初始化窗口
        initJFrame();

        //初始化菜单栏
        initJMenu();

        //打乱图片数据
        initData();

        //初始化图片
        initImage();

        this.setVisible(true);
    }

    private void initData() {
        Random r = new Random();
        for (int i = 0; i < icons.length; i++) {
            int tmp = icons[i];
            int index = r.nextInt(icons.length);

            icons[i] = icons[index];
            icons[index] = tmp;
        }
    }


    private void initImage() {
        int number = 0;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                JLabel jLabel = new JLabel(new ImageIcon("C:\\Users\\mineq\\IdeaProjects\\java-learning\\day16\\image\\animal\\animal3\\" + icons[number] + ".jpg"));
                jLabel.setBounds(105 * i, 105 * j, 105, 105);
                this.getContentPane().add(jLabel);
                number++;
            }
        }
    }


    private void initJFrame() {
        this.setSize(603, 680);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("拼图游戏");

        this.setLayout(null);
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
