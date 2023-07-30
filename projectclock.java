import java.awt.*;
import javax.swing.*;
import java.text.*;
import java.util.*;

public class projectclock extends JFrame {
	private static final long serialVersionUID = 1L;
	Calendar calendar;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;
	
	projectclock(){
		setResizable(false);
		getContentPane().setBackground(new Color(255, 255, 0));
		setBackground(new Color(255, 255, 0));
		setAutoRequestFocus(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("CLOCK PROGRAM");
		getContentPane().setLayout(new FlowLayout());
		this.setSize(350,200);
		this.setVisible(true);
		
		timeFormat=new SimpleDateFormat("hh:mm:ss a");
		dayFormat=new SimpleDateFormat("EEEE");
		dateFormat=new SimpleDateFormat("MMMMM:dd:yyyy");
		
		timeLabel=new JLabel();
		timeLabel.setLabelFor(timeLabel);
		timeLabel.setFont(new Font("Dialog", Font.BOLD, 50));
		timeLabel.setBackground(Color.YELLOW);
		timeLabel.setOpaque(true);
		timeLabel.setVisible(true);
		
		dayLabel=new JLabel();
		dayLabel.setBackground(new Color(0, 0, 0));
		dayLabel.setFont(new Font("Dialog", Font.BOLD, 25));
		dayLabel.setVisible(true);
		
		dateLabel=new JLabel();
		dateLabel.setBackground(new Color(0, 0, 0));
		dateLabel.setLabelFor(dateLabel);
		dateLabel.setFont(new Font("Gadugi", Font.BOLD, 25));
		dateLabel.setVisible(true);
		
		getContentPane().add(timeLabel);
		getContentPane().add(dayLabel);
		getContentPane().add(dateLabel);
		
		setTime();
}

	public void setTime() {
	while(true) {
		time=timeFormat.format(Calendar.getInstance().getTime());
		timeLabel.setText(time);
		
		day=dayFormat.format(Calendar.getInstance().getTime());
		dayLabel.setText(day);
		
		date=dateFormat.format(Calendar.getInstance().getTime());
		dateLabel.setText(date);
		
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {}
	}
	}
	}