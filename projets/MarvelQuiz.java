import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MarvelQuiz extends JFrame {
    private JLabel questionLabel;
    private JRadioButton[] options;
    private JButton nextButton;

    private String[] questions = {
            "What is the real name of Iron Man?",
            "Who is known as the God of Thunder?",
            "What is Captain America's shield made of?"
    };

    private String[][] optionsText = {
            {"Tony Stark", "Bruce Banner", "Steve Rogers", "Peter Parker"},
            {"Thor", "Hulk", "Captain America", "Black Widow"},
            {"Vibranium", "Adamantium", "Platinum", "Gold"}
    };

    private int[] correctAnswers = {0, 0, 0}; // Indices of correct answers

    private int currentQuestionIndex = 0;
    private int score = 0;

    public MarvelQuiz() {
        setTitle("Marvel Quiz");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        questionLabel = new JLabel(questions[currentQuestionIndex], JLabel.CENTER);
        add(questionLabel, BorderLayout.NORTH);

        JPanel optionsPanel = new JPanel(new GridLayout(4, 1));
        options = new JRadioButton[4];
        ButtonGroup group = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            options[i] = new JRadioButton();
            group.add(options[i]);
            optionsPanel.add(options[i]);
        }
        add(optionsPanel, BorderLayout.CENTER);

        nextButton = new JButton("Next");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkAnswer();
                currentQuestionIndex++;
                if (currentQuestionIndex < questions.length) {
                    displayQuestion();
                } else {
                    endQuiz();
                }
            }
        });
        add(nextButton, BorderLayout.SOUTH);

        displayQuestion();

        setVisible(true);
    }

    private void displayQuestion() {
        questionLabel.setText(questions[currentQuestionIndex]);
        List<String> optionsList = Arrays.asList(optionsText[currentQuestionIndex]);
        Collections.shuffle(optionsList);
        for (int i = 0; i < 4; i++) {
            options[i].setText(optionsList.get(i));
            options[i].setSelected(false);
        }
    }

    private void checkAnswer() {
        for (int i = 0; i < 4; i++) {
            if (options[i].isSelected() && options[i].getText().equals(optionsText[currentQuestionIndex][correctAnswers[currentQuestionIndex]])) {
                score++;
                break;
            }
        }
    }

    private void endQuiz() {
        JOptionPane.showMessageDialog(this, "Quiz ended!\nYour score: " + score + "/" + questions.length);
        dispose(); 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MarvelQuiz();
            }
        });
    }
}