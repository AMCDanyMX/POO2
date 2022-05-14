package mx.tv.gameswinner.dragongame.utilerias;
public class AddErrores extends Exception {
	private  int num = 0;
	private String msg;

	public AddErrores(String msg, int num) {
		super(msg);
		this.num = num;
		this.msg = msg;
	}

	public int getNum() {
		return num;
	} 

	public String getMsg() {
		return msg;
	}
}