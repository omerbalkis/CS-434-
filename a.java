//package GUI;
//
//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.FlowLayout;
//import java.awt.Font;
//import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JTabbedPane;
//import javax.swing.JTextField;
//
//import Model.GradeItem;
//import Model.Instructor;
//import Model.Student;
//
////reyyan.yeniterzi@ozyegin.edu.tr
//
//public class InstructorFrame extends JFrame {
//	private JTabbedPane tabbedPane = new JTabbedPane();
//	private JPanel[] tabs;
//	private Instructor instructor;
//	JPanel outerPanel = new JPanel();
//	public static JTextField[] gradeFields;
//	public static JTextField field;
//	public static int index;
//
//	public InstructorFrame(Instructor instructor) {
//		this.instructor = instructor;
//		tabs = new JPanel[(instructor.getCourses().size())];
//		gradeFields = new JTextField[5];
//		init();
//	
//	}
//
//	private void init() {
//		this.setSize(800, 600);
//		this.setLocationRelativeTo(null);
//
//		for (int i = 0; i < tabs.length; i++) {
//			JPanel outerPanel = new JPanel();
//			outerPanel.setLayout(new BorderLayout());
//
//			JPanel buttonPanel = new JPanel();
//			buttonPanel.setLayout(new GridLayout(1, 3));
//
//			JButton listStu = new JButton("List Students");
//			listStu.addActionListener(new listHandler());
//
//			JButton registerExam = new JButton("Register Exam Grades");
//			registerExam.addActionListener(new examHandler());
//
//			JButton listGrades = new JButton("List Grades");
//			listGrades.addActionListener(new listGradesHandler());
//
//			buttonPanel.add(listStu, BorderLayout.NORTH);
//			buttonPanel.add(registerExam, BorderLayout.NORTH);
//			buttonPanel.add(listGrades, BorderLayout.NORTH);
//
//			outerPanel.add(buttonPanel, BorderLayout.NORTH);
//
//			tabs[i] = outerPanel;
//
//		}
//
//		for (int i = 0; i < instructor.getCourses().size(); i++) {
//
//			tabbedPane.addTab(instructor.getCourses().get(i).getId(), tabs[i]);
//			tabbedPane.setVisible(true);
//
//		}
//
//		this.add(tabbedPane);
//
//		this.setVisible(true);
//
//	}
//
//	public class listHandler implements ActionListener {
//
//		public void actionPerformed(ActionEvent e) {
//
//			JPanel emptyPanel = new JPanel(new GridLayout(40, 1));
//
//			JPanel studentP = new JPanel();
//			studentP.setLayout(new GridLayout(0, 3, 90, 0));
//
//			JLabel ıd = new JLabel("ID");
//			JLabel name = new JLabel("Name");
//			JLabel email = new JLabel("Email");
//
//			studentP.add(ıd);
//			studentP.add(name);
//			studentP.add(email);
//
//			int index = tabbedPane.getSelectedIndex();
//			int size = instructor.getCourses().get(tabbedPane.getSelectedIndex()).getStudents().size();
//
//			for (int i = 0; i < size; i++) {
//				outerPanel.removeAll();
//
//				JLabel stuId = new JLabel(instructor.getCourses().get(index).getStudents().get(i).getId());
//				JLabel stuName = new JLabel(instructor.getCourses().get(index).getStudents().get(i).getName());
//				JLabel stuEmail = new JLabel(instructor.getCourses().get(index).getStudents().get(i).getEmail());
//
//				studentP.add(stuId);
//				studentP.add(stuName);
//				studentP.add(stuEmail);
//
//				outerPanel.revalidate();
//			}
//
//			tabs[index].add(outerPanel);
//			tabs[index].revalidate();
//			tabs[index].repaint();
//
//			emptyPanel.add(studentP);
//			outerPanel.add(emptyPanel);
//
//		}
//
//	}
//
//	public class examHandler implements ActionListener {
//
//		JTextField field = new JTextField();
//
//		public void actionPerformed(ActionEvent e) {
//
//			JPanel emptyPanel = new JPanel(new GridLayout(20, 1));
//
//			JPanel enterExam = new JPanel(new GridLayout(0, 3, 25, 15));
//			enterExam.add(new JLabel("Enter Exam Id:"));
//			enterExam.add(new JLabel());
//
//			Font font1 = new Font("SansSerif", Font.PLAIN, 25);
//			JTextField field = new JTextField(9);
//			field.setFont(font1);
//
//			enterExam.add(field);
//
//			int index = tabbedPane.getSelectedIndex();
//			int size = instructor.getCourses().get(tabbedPane.getSelectedIndex()).getStudents().size();
//
//			for (int i = 0; i < size; i++) {
//				outerPanel.removeAll();
//
//				JLabel stuId = new JLabel(instructor.getCourses().get(index).getStudents().get(i).getId());
//				JLabel stuName = new JLabel(instructor.getCourses().get(index).getStudents().get(i).getName());
//				JTextField stuGrade = new JTextField();
//				gradeFields[i] = stuGrade;
//
//				enterExam.add(stuId);
//				enterExam.add(stuName);
//				enterExam.add(stuGrade);
//
//				outerPanel.revalidate();
//			}
//
//			JPanel savePanel = new JPanel();
//			savePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
//
//			JButton saveButton = new JButton("SAVE");
//			savePanel.add(saveButton);
//
//			saveButton.addActionListener(new savebuttonHandler(gradeFields));
//
//			tabs[index].add(outerPanel);
//			tabs[index].revalidate();
//			tabs[index].repaint();
//
//			emptyPanel.add(enterExam);
//			emptyPanel.add(savePanel);
//			outerPanel.add(emptyPanel);
//
//		}
//
//		public class savebuttonHandler implements ActionListener {
//			private JTextField[] grades;
//
//			public savebuttonHandler(JTextField[] gradeFields) {
//				grades = gradeFields;
//			}
//
//			public void actionPerformed(ActionEvent e) {
//				int tmp = 0;
//
//				for (int i = 0; i < grades.length; i++) {
//
//					String gradetmp = grades[i].getText();
//
//					try {
//
//						tmp = Integer.parseInt(gradetmp);
//
//					} catch (NumberFormatException k) {
//
//						String message = "Grades must be integers";
//						JOptionPane.showMessageDialog(null, message);
//					}
//
//					GradeItem item = new GradeItem(instructor.getCourses().get(tabbedPane.getSelectedIndex()).getId(),
//							field.getText(), tmp);
//					instructor.getCourses().get(index).getStudents().get(i).addGrade(item);
//					instructor.getCourses().get(index).getStudents().get(i).getGradeItem(
//							instructor.getCourses().get(tabbedPane.getSelectedIndex()).getId(), field.getText());
//
//				}
//
//				String message = "Grades saved";
//				JOptionPane.showMessageDialog(null, message);
//
//			}
//
//		}
//
//	}
//
//	public class listGradesHandler implements ActionListener {
//		public void actionPerformed(ActionEvent e) {
//			JPanel emptyPanel = new JPanel(new GridLayout(20, 1));
//
//			JPanel stuInfo = new JPanel(new GridLayout(0, 3, 25, 15));
//
//			stuInfo.add(new JLabel("ID"));
//			stuInfo.add(new JLabel("Name"));
//			stuInfo.add(new JLabel());
//
//			int index = tabbedPane.getSelectedIndex();
//			int size = instructor.getCourses().get(tabbedPane.getSelectedIndex()).getStudents().size();
//
//			for (int i = 0; i < size; i++) {
//				outerPanel.removeAll();
//
//				JLabel stuId = new JLabel(instructor.getCourses().get(index).getStudents().get(i).getId());
//				JLabel stuName = new JLabel(instructor.getCourses().get(index).getStudents().get(i).getName());
//
//				String a = instructor.getCourses().get(index).getStudents().get(i).printer();
//
//				int b = instructor.getCourses().get(index).getStudents().get(i)
//						.getGradeItem(instructor.getCourses().get(tabbedPane.getSelectedIndex()).getId(), a).getGrade();
//
//				JLabel grades = new JLabel(String.valueOf(b));
//				
//				stuInfo.add(stuId);
//				stuInfo.add(stuName);
//				stuInfo.add(grades);
//
//				outerPanel.revalidate();
//			}
//
//			tabs[index].add(outerPanel);
//			tabs[index].revalidate();
//			tabs[index].repaint();
//
//			emptyPanel.add(stuInfo);
//			outerPanel.add(emptyPanel);
//
//		}
//
//	}
//
//}
