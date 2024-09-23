package student_teacher_1;

public class RangeException extends RuntimeException{
	int start;
	int end;
	
	public RangeException(int start, int end) {
		this(start, end, start + "이상" + end + "이하의 값을 입력하세요.");
		this.start = start;
		this.end = end;
	}
	public RangeException(int start, int end, String msg) {
		super(msg);
		this.start = start;
		this.end = end;
	}
	public RangeException(String msg) {
		super(msg);
	}
	
}

