package Bean;

import java.util.Date;

public class TestDemo05 {
	private int id;
	private String name;
	private Date date;
	private Double money;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "TestDemo05 [id=" + id + ", name=" + name + ", date=" + date + ", money=" + money + "]";
	}
	
	
}
