package lesson09_interface;

public interface Fax {
	String FAX_NUMVER = "02-1234-56789";
	void send(String msg);
	void receive(String msg);
}
