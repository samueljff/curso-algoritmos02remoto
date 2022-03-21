package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date momment;
	private OrderStatus status;
	private Client client;

	private List<OrderItem> items = new ArrayList<>();

	public Order() {
	}

	public Order(Date momment, OrderStatus status, Client client) {
		this.momment = momment;
		this.status = status;
		this.client = client;
	}

	public Date getMomment() {
		return momment;
	}

	public void setMomment(Date momment) {
		this.momment = momment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public double total() {
		double sum = 0.0;
		for (OrderItem it : items) {
			sum += it.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order momment: ");
		sb.append(sdf.format(momment)+"\n");
		sb.append("Orderstatus: ");
		sb.append(status +"\n");
		sb.append("client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for(OrderItem item : items) {
			sb.append(item +"\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

}
