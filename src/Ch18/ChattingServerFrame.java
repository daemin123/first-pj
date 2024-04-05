package Ch18;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChattingServerFrame extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JTextField textField;
    private JButton enterButton, saveButton, requestButton, historyButton;

    public ChattingServerFrame() {
        setTitle("Chatting Server");
        setBounds(100, 200, 360, 400); // 전체 프레임 크기 조정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE); // 배경색 변경
        setLayout(null);

        // JTextArea with JScrollPane
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(20, 20, 200, 150); // 위치 및 크기 조정
        textArea.setBackground(Color.PINK); // 텍스트 에어리아 배경색 변경
        add(scrollPane);

        // JTextField
        textField = new JTextField();
        textField.setBounds(20, 180, 200, 30); // 위치 및 크기 조정
        textField.setBackground(Color.YELLOW); // 텍스트 필드 배경색 변경
        textField.addActionListener(this); // 텍스트 필드에 액션 리스너 추가
        add(textField);

        // Enter Button
        enterButton = new JButton("입력");
        enterButton.setBounds(230, 180, 100, 30); // 위치 및 크기 조정
        enterButton.setBackground(Color.GREEN); // 버튼 배경색 변경
        enterButton.addActionListener(this);
        add(enterButton);

        // Additional Buttons
        saveButton = new JButton("파일로 저장");
        requestButton = new JButton("1:1 요청");
        historyButton = new JButton("대화 기록 보기");

        JButton[] buttons = {saveButton, requestButton, historyButton};
        Color[] buttonColors = {Color.RED, Color.ORANGE, Color.BLUE};
        int startY = 20;
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].setBounds(230, startY, 100, 30); // 위치 및 크기 조정
            buttons[i].setBackground(buttonColors[i]); // 버튼 배경색 변경
            buttons[i].addActionListener(this); // 각 버튼에 액션 리스너 추가
            add(buttons[i]);
            startY += 40; // 다음 버튼의 Y 위치를 조정
        }

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == enterButton || e.getSource() == textField) {
            textArea.append(textField.getText() + "\n");
            textField.setText(""); // 텍스트 필드 초기화
        } else if (e.getSource() == saveButton) {
            System.out.println("파일로 저장 clicked...");
        } else if (e.getSource() == requestButton) {
            System.out.println("1:1 요청 clicked...");
        } else if (e.getSource() == historyButton) {
            System.out.println("대화 기록 보기 clicked...");
        }
    }

    public static void main(String[] args) {
        new ChattingServerFrame();
    }
}

